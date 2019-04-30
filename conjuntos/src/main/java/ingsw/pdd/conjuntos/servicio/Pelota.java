package ingsw.pdd.conjuntos.servicio;

public class Pelota extends PiscinaDecorator{

	public Pelota(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+2000;
	}

}
