package ingsw.pdd.conjuntos.entidad;

public class Telefono {
	
	private String numero;
	private String ext;
	private String tipo;
	
	public Telefono() {
	}
	
	public Telefono(String numeror, String ext, String tipo) {
		this.numero= numero;
		this.ext = ext;
		this.tipo= tipo;	
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getExt() {
		return ext;
	}

	public void setExt(String ext) {
		this.ext = ext;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Telefono [numero=" + numero + ", ext=" + ext + ", tipo=" + tipo + "]";
	}

	
	

}
