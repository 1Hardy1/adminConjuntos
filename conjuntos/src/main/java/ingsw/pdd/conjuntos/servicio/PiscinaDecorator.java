package ingsw.pdd.conjuntos.servicio;

public class PiscinaDecorator extends DecoratorFactory implements  Alquiler{

	private Alquiler alquiler;
	
	public PiscinaDecorator() {
		
	}
	
	public PiscinaDecorator(Alquiler alquiler) {
		setAlquiler(alquiler);
	}

	public Alquiler getAlquiler() {
		return alquiler;
	}

	public void setAlquiler(Alquiler alquiler) {
		this.alquiler = alquiler;
	}

	@Override
	public int getPrecio() {
		// TODO Auto-generated method stub
		return 0;
	}


}
