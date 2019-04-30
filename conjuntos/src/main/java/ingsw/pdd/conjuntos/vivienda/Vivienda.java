package ingsw.pdd.conjuntos.vivienda;


public class Vivienda {
	
	private String idzona;
	private String nombre;
	
	public Vivienda(String nombre) {
		this.nombre = nombre;
	}
	
	public Vivienda(String idzona, String nombre) {
		super();
		this.idzona=idzona;
		this.nombre = nombre;

	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getIdzona() {
		return idzona;
	}

	public void setIdzona(String idzona) {
		this.idzona = idzona;
	}

	@Override
	public String toString() {
		return "Vivienda [idzona=" + idzona + ", nombre=" + nombre + "]";
	}





}
