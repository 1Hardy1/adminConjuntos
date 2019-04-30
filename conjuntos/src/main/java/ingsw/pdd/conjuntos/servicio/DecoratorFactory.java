package ingsw.pdd.conjuntos.servicio;

import ingsw.pdd.conjuntos.impl.Administracion;

public class DecoratorFactory {
	
	
	Servicio serv =new Servicio();
	int opcion;
	
	public void setOpcion(int opcion) {
		this.opcion = (opcion= new Administracion().getOpcionServ());
		}
public DecoratorFactory() {
	
	setOpcion(opcion);
	if(opcion==1) {
		GimnasioDecorator decorator=new GimnasioDecorator();
	}else if(opcion==3) {
		SinteticaDecorator decorator=new SinteticaDecorator();
	}else if(opcion==5) {
		PiscinaDecorator decorator=new PiscinaDecorator();
	}
	
}
}

