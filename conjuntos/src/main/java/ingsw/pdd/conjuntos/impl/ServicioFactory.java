package ingsw.pdd.conjuntos.impl;

import ingsw.pdd.conjuntos.servicio.Servicio;

public  class ServicioFactory extends GeneralFactory{
	public ServicioFactory() {
		
	}
	
	public Servicio crearServicio() {
		return new Servicio();
	}
	

}
