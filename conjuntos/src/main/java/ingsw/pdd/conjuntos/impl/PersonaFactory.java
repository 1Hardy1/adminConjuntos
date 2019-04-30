package ingsw.pdd.conjuntos.impl;

import ingsw.pdd.conjuntos.entidad.BuildPersona;

public class PersonaFactory extends GeneralFactory{
	
	public PersonaFactory() {
		
	}
	
	public BuildPersona crearPersona() {
		return new BuildPersona();
	}

}
