package ingsw.pdd.conjuntos.servicio;

public  class GimnasioDecorator extends DecoratorFactory implements  Alquiler{

	private Alquiler alquiler;
	
	public GimnasioDecorator() {
		
	}
	
	public GimnasioDecorator(Alquiler alquiler) {
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
