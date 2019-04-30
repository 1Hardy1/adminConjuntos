package ingsw.pdd.conjuntos.entidad;

public class Visitante{
	
	private int documento;
	private String nombre;
	private int torre;
	private int casa;
	private String entrada;
	private String salida;

	public Visitante(int documento, String nombre, int torre, int casa, String entrada, String salida) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.torre = torre;
		this.casa = casa;
		this.entrada = entrada;
		this.salida = salida;
	}

	public int getTorre() {
		return torre;
	}

	public void setTorre(int torre) {
		this.torre = torre;
	}

	public int getcasa() {
		return casa;
	}

	public void setcasa(int casa) {
		this.casa = casa;
	}

	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEntrada() {
		return entrada;
	}
	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}
	public String getSalida() {
		return salida;
	}
	public void setSalida(String salida) {
		this.salida = salida;
	}

	@Override
	public String toString() {
		return "Visitante [documento=" + documento + ", nombre=" + nombre + ", torre=" + torre + ", casa=" + casa
				+ ", entrada=" + entrada + ", salida=" + salida + "]";
	}

}
