package ingsw.pdd.conjuntos.entidad;

public class Direccion {
	
	 private String direccion;
	 private String ciudad;
	 private String pais;
	 private String cp;
	
	 public Direccion() {
	 }
	
	 public Direccion(String direccion, String ciudad, String pais, String cp) {
	 this.direccion = direccion;
	 this.ciudad = ciudad;
	 this.pais = pais;
	 this.cp = cp;
}
	 
	 
	
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Direccion [direccion=" + direccion + ", ciudad=" + ciudad + ", pais=" + pais + ", cp=" + cp + "]";
	}


	


}
