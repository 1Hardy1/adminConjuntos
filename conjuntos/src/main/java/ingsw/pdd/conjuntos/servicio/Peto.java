package ingsw.pdd.conjuntos.servicio;

public class Peto extends SinteticaDecorator{

	
	public Peto(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+1000;
	}

}
