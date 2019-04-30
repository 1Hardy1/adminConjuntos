package ingsw.pdd.conjuntos.servicio;

public class Balon extends SinteticaDecorator{
	
	public Balon(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+3000;
	}


}
