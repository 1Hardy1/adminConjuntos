package ingsw.pdd.conjuntos.entidad;

import ingsw.pdd.conjuntos.vivienda.Casa;

public class Propietario extends Habitante{
	
	private int torre;
	private Casa casa;

	public Propietario(String nombre, int documento, int telefono) {
		super(nombre, documento, telefono);
		// TODO Auto-generated constructor stub

	}
	



	public Propietario(int documento, String nombre, int telefono, int edad, Login login,int torre, Casa casa) {
		super(documento, nombre, telefono, edad, login);
		this.torre = torre;
		this.casa = casa;
	}


	public int getTorre() {
		return torre;
	}

	public void setTorre(int nTorre) {
		this.torre = torre;
	}

	public Casa getCasa() {
		return casa;
	}

	public void setCasa(Casa casa) {
		this.casa = casa;
	}

}
