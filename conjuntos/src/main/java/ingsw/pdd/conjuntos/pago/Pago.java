package ingsw.pdd.conjuntos.pago;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.sql.Connection;
import java.sql.*;
import java.util.Properties;
import ingsw.pdd.conjuntos.util.*;

import ingsw.pdd.conjuntos.util.PropertiesUtil;
import javafx.collections.ObservableList;


public class Pago {
	
	 private static final String DB_PROPERTIES = "DBMySQL.properties";

	    private static final String DB_NAME_PROP = "dbname";
	    private static final String DB_HOST_PROP = "host";
	    private static final String DB_PASSWORD_PROP = "password";
	    private static final String DB_PORT_PROP = "port";
	    private static final String DB_USER_PROP = "user";
	    
	    String connectionString = createConnectionString();

	
	public static Pago pago = null;

	private Pago() {
		
	}

	public static Pago getInstance() {
		if (pago == null) {
			pago = new Pago();
		}
		return pago;
	}

	
	public void traerDatosRecibo(String documento, Recibo recibo) throws SQLException {
	    Connection connection = DriverManager.getConnection(connectionString);
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "SELECT torre, casa FROM vivienda WHERE documento=?";

		PreparedStatement ps2 = null;
		ResultSet rs2 = null;
		String sql2 = "SELECT * FROM vivienda WHERE torre=? && casa=?";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, documento);
			rs = ps.executeQuery();
			if (rs.next()) {
				recibo.settorre(rs.getString(1));
				recibo.setcasa(rs.getString(2));
			}
			ps2 = connection.prepareStatement(sql2);
			ps2.setString(1, recibo.gettorre());
			ps2.setString(2, recibo.getcasa());
			rs2 = ps2.executeQuery();

			if (rs2.next()) {

				String parqueadero;
				parqueadero = rs2.getString(4);
				if (parqueadero.equals("no")) {
					recibo.setCostoParq("0");
					
				}else {
					recibo.setCostoParq(rs2.getString(7));
				}
				recibo.setZona(rs2.getString(5));
				recibo.setCostoAdmin(rs2.getString(6));				
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

	public boolean guardarRecibo(Recibo recibo) throws SQLException {
		boolean creado = false;

		Connection connection = DriverManager.getConnection(connectionString);
		PreparedStatement ps = null;
		String sql = "INSERT INTO recibo(codigo, documento, nombre, ntorre, napart, zona, costoadmin, costoparq, total, cancelado) VALUES (?,?,?,?,?,?,?,?,?,?)";

		try {
			ps = connection.prepareStatement(sql);
			ps.setString(1, recibo.getCodigo());
			ps.setString(2, recibo.getDocumento());
			ps.setString(3, recibo.getNombre());
			ps.setString(4, recibo.gettorre());
			ps.setString(5, recibo.getcasa());
			ps.setString(6, recibo.getZona());
			ps.setString(7, recibo.getCostoAdmin());
			ps.setString(8, recibo.getCostoParq());
			ps.setString(9, recibo.getTotal());
			ps.setString(10, recibo.getCancelado());
			ps.execute();
			creado = true;
		} catch (SQLException e) {
			creado = false;
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {

			}
		}

		return creado;
	}
	
	 private String createConnectionString() {
	        Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);
	        String host = prop.getProperty(DB_HOST_PROP);
	        String port = prop.getProperty(DB_PORT_PROP);
	        String db = prop.getProperty(DB_NAME_PROP);
	        String user = prop.getProperty(DB_USER_PROP);
	        String password = prop.getProperty(DB_PASSWORD_PROP);

	        String connectionString = "jdbc:mysql://" + host + ":" + port + "/" + db + "?user=" + user + "&password=" + password;
	        return connectionString;
	    }
}
