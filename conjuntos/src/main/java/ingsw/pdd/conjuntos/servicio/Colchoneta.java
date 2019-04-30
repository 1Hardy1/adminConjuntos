package ingsw.pdd.conjuntos.servicio;

public class Colchoneta extends PiscinaDecorator{
	
	public Colchoneta(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+2000;
	}


}
