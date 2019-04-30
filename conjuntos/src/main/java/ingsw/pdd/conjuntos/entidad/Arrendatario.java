package ingsw.pdd.conjuntos.entidad;

public class Arrendatario extends Habitante{
	
	private String parqueadero;
	private String torreapart;

	public Arrendatario(String nombre, int documento, int telefono,  String torreapart, String parqueadero) {
		super(nombre, documento, telefono);
		this.parqueadero = parqueadero;
		this.torreapart=torreapart;
	}

	public String getTorreapart() {
		return torreapart;
	}

	public void setTorreapart(String torreapart) {
		this.torreapart = torreapart;
	}

	public String getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(String parqueadero) {
		this.parqueadero = parqueadero;
	}
	

}
