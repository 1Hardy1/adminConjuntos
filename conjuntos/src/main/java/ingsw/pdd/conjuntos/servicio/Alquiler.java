package ingsw.pdd.conjuntos.servicio;

import ingsw.pdd.conjuntos.impl.Administracion;
import ingsw.pdd.conjuntos.impl.ServicioFactory;

public interface Alquiler {
	
	public int getPrecio();
	Servicio admin= new Administracion().getServicio();
	
}
