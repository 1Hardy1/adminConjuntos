package ingsw.pdd.conjuntos.entidad;


public abstract class Persona {
	
	    private int documento;
	    private String nombre;
	    private int telefono;
	    private String nacimiento;
	    private Login login;

	    public Persona(int documento, String nombre, int telefono, String nacimiento) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.telefono = telefono;
			this.nacimiento = nacimiento;
			
		}

		public Persona(int documento, String nombre, int telefono) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.telefono = telefono;
			
		}

		public Persona(int documento, String nombre, int telefono, String nacimiento, Login login) {
	        super();
	        this.documento = documento;
	        this.nombre = nombre;
	        this.telefono = telefono;
	        this.nacimiento = nacimiento;
	        
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

	    public int getTelefono() {
	        return telefono;
	    }

	    public void setTelefono(int telefono) {
	        this.telefono = telefono;
	    }

	    public String getNacimiento() {
	        return nacimiento;
	    }

	    public void setNacimiento(String nacimiento) {
	        this.nacimiento = nacimiento;
	    }

	    public Login getLogin() {
	        return login;
	    }

	    public void setLogin(Login login) {
	        this.login = login;
	    }

}
