package ingsw.pdd.conjuntos.entidad;

public class Habitante extends Persona{
	

	private String nombre;
	private int documento;
	private int telefono;

	

	public Habitante(String nombre, int documento, int telefono) {
		// TODO Auto-generated constructor stub
	}

	public Habitante(int documento, String nombre, int telefono, String nacimiento, Login login) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int getDocumento() {
		return documento;
	}

	@Override
	public void setDocumento(int documento) {
		this.documento = documento;
	}

	@Override
	public int getTelefono() {
		return telefono;
	}

	@Override
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
