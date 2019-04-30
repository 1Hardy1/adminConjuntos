package ingsw.pdd.conjuntos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ingsw.pdd.conjuntos.cifrar.metodo.Cifrado;
import ingsw.pdd.conjuntos.entidad.Login;
import ingsw.pdd.conjuntos.entidad.Persona;
import ingsw.pdd.conjuntos.entidad.Usuario;

public class LoginDAO {
	
	private static Usuario persona;
	private static LoginDAO loginDAO=null;

	
	
	
private static Connection conexion = null;
	
	private PreparedStatement consultarUsuario = null;
	
	
	public LoginDAO(Connection conex) {
		this.conexion = conex;
		try {
		
			consultarUsuario = conexion.prepareStatement(
					"SELECT usuario, contraseña FROM usuarios");
		}
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
			System.exit(1);
		}
	}

  
  public Usuario consultarUsuario (String usuario, String contraseña, Usuario user) {


		try {		

			ResultSet result = consultarUsuario.executeQuery();
			 result.next();
				user.setUser(result.getString("usuario"));
				user.setContraseña(result.getString("contraseña"));
	
			
		} 
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		}
		return user;
  }
	
	public void close() {
		try {
			conexion.close();
		} 
		catch (SQLException sqlException) {
			sqlException.printStackTrace();
		} 
	}
	
}
