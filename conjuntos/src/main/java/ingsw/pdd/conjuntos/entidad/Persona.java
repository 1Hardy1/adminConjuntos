package ingsw.pdd.conjuntos.entidad;

import java.util.List;

import ingsw.pdd.conjuntos.impl.IBuild;

public abstract class Persona implements IBuild{
	
	    private int documento;
	    private String nombre;
	    private String genero;
	    private int edad;
		private Direccion 		direccion;
		private List<Telefono>		telefonos;
		private List<Contacto>	Contactos;
	    private Login login;

	    public Persona(int documento, String nombre, String genero, String edae, Direccion direccion, List<Telefono> telefonos,
				List<Contacto> Contactos) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.genero = genero;
			this.edad = edad;
			this.direccion = direccion;
			this.telefonos = telefonos;
			this.Contactos = Contactos;
			
		}

		public Persona(int documento, String nombre, List<Telefono> telefonos) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.telefonos = telefonos;
			
		}

		public Persona(int documento, String nombre, int edad, List<Telefono> telefonos, Login login) {
	        super();
	        this.documento = documento;
	        this.nombre = nombre;
	        this.edad = edad;
			this.telefonos = telefonos;   
	        this.login = login;
	    }

		public Persona(int documento, String nombre, Login login) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.login = login;
		}

	    public Persona() {
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

	    public List<Telefono> gettelefonos() {
			return telefonos;
		}

		public void settelefonos(List<Telefono> telefonos) {
			this.telefonos = telefonos;
		}

	    public int getEdad() {
	        return edad;
	    }

	    public void setEdad(int edad) {
	        this.edad = edad;
	    }

	    public Login getLogin() {
	        return login;
	    }

	    public void setLogin(Login login) {
	        this.login = login;
	    }

	    public BuildPersona build() {
	    	
			return new BuildPersona(documento,nombre, genero, edad, direccion, telefonos, Contactos, login);
		}
}
