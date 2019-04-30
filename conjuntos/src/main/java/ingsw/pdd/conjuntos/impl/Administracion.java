package ingsw.pdd.conjuntos.impl;

import ingsw.pdd.conjuntos.servicio.Servicio;

public class Administracion {
	
	
	private Servicio Serv;
	private int opcionServ;
	PersonaFactory persona = new PersonaFactory();
	Servicio servicio= new ServicioFactory().crearServicio(Serv);
	
	
	

	public PersonaFactory getPersona() {
		return persona;
	}


	public void setPersona(PersonaFactory persona) {
		this.persona = persona;
	}


	public Servicio getServicio() {
		return servicio;
	}


	public void setServicio(Servicio servicio) {
		this.servicio = servicio;
	}


	public int getOpcionServ() {
		return opcionServ;
	}


	public void setOpcionServ(int opcionServ) {
		this.opcionServ = opcionServ;
	}
	
	
	
}
