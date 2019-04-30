package ingsw.pdd.conjuntos.servicio;

public class Entrenador extends GimnasioDecorator{
	
	public Entrenador(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+30000;
	}

}
