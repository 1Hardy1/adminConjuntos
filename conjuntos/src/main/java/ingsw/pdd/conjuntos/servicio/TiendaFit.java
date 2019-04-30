package ingsw.pdd.conjuntos.servicio;

public class TiendaFit extends GimnasioDecorator{
	
	public TiendaFit(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+25000;
	}

}
