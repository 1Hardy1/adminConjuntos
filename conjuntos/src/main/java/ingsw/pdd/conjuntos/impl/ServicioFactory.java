package ingsw.pdd.conjuntos.impl;

import ingsw.pdd.conjuntos.servicio.*;

public  class ServicioFactory extends GeneralFactory{
	
	
	Servicio serv =new Servicio();
	int opcion;
	
	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
	this.opcion = (opcion= new Administracion().getOpcionServ());
	}


	
	public ServicioFactory() {
	
	}

	public Servicio crearServicio(Servicio serv) {
		
		
		switch (opcion) {
		
		case 1:
			Servicio serv1= new Gimnasio();
			serv1.getClass();
			serv1=(Gimnasio) serv;
				break;
				
		case 2:
			Servicio serv2= new Parrilla();
			serv2.getClass();
			serv2=(Parrilla) serv;
			break;
		case 3:
			Sintetica serv3= new Sintetica();
			serv3.getClass();
			serv3=(Sintetica) serv;
			break;
		case 4:
			SalonComunal serv4= new SalonComunal();
			serv4.getClass();
			serv4=(SalonComunal) serv;
			break;
		case 5:
			Piscina serv5= new Piscina();
			serv5.getClass();
			serv5=(Piscina) serv;
			break;
		case 6:
			Parqueadero serv6= new Parqueadero();
			serv6.getClass();
			serv6=(Parqueadero) serv;
			break;

		}
		return serv;
		
	}
}
