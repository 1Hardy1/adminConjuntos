package ingsw.pdd.conjuntos.rep;

public abstract class Reporte {
	
	public void generarPeticion() {
		Reporte peticion= new Peticion();
	}
	public void generarQueja() {
		Reporte queja= new Queja();
	}
	public void generarReclamo() {
		Reporte reclamo= new Reclamo();
	}
	

}
