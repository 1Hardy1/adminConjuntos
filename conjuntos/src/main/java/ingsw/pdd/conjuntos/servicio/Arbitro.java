package ingsw.pdd.conjuntos.servicio;

public class Arbitro extends SinteticaDecorator{
	
	public Arbitro(Alquiler alquiler) {
		super(alquiler);
	}
	
	public int getPrecio() {
		return getAlquiler().getPrecio()+25000;
	}

}
