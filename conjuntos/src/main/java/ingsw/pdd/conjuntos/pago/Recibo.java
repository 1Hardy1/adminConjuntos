package ingsw.pdd.conjuntos.pago;

public class Recibo {
	
	private String codigo;	
	private String documento;
	private String nombre;
	private String torre;
	private String casa;
	private String zona;
	private String costoAdmin;
	private String costoParq;
	private String total;
	private String cancelado;

	public Recibo() {
	}
	public Recibo(String codigo, String documento, String nombre, String torre, String casa, String zona,
			String costoAdmin, String costoParq, String total, String cancelado) {
		this.codigo = codigo;
		this.documento = documento;
		this.nombre = nombre;
		this.torre = torre;
		this.casa = casa;
		this.zona = zona;
		this.costoAdmin = costoAdmin;
		this.costoParq = costoParq;
		this.total = total;
		this.cancelado = cancelado;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDocumento() {
		return documento;
	}


	public void setDocumento(String documento) {
		this.documento = documento;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String gettorre() {
		return torre;
	}


	public void settorre(String torre) {
		this.torre = torre;
	}


	public String getcasa() {
		return casa;
	}


	public void setcasa(String casa) {
		this.casa = casa;
	}


	public String getZona() {
		return zona;
	}


	public void setZona(String zona) {
		this.zona = zona;
	}


	public String getCostoAdmin() {
		return costoAdmin;
	}


	public void setCostoAdmin(String costoAdmin) {
		this.costoAdmin = costoAdmin;
	}


	public String getCostoParq() {
		return costoParq;
	}


	public void setCostoParq(String costoParq) {
		this.costoParq = costoParq;
	}


	public String getTotal() {
		return Float.toString(Float.parseFloat(costoAdmin)+Float.parseFloat(costoParq));
	}


	public void setTotal(String total) {
		this.total = total;
	}


	public String getCancelado() {
		return cancelado;
	}


	public void setCancelado(String cancelado) {
		this.cancelado = cancelado;
	}


	@Override
	public String toString() {
		return "Recibo [codigo=" + codigo + ", documento=" + documento + ", nombre=" + nombre + ", torre=" + torre
				+ ", casa=" + casa + ", zona=" + zona + ", costoAdmin=" + costoAdmin + ", costoParq=" + costoParq
				+ ", total=" + total + ", cancelado=" + cancelado + "]";
	}

}
