package ingsw.pdd.conjuntos.servicio;

import ingsw.pdd.conjuntos.impl.Administracion;

public class Servicio implements Alquiler{
	
	private int precio;
	private String tipo; //publico o privado
	
	
	
	
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
