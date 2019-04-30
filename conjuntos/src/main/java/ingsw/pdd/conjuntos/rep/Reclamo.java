package ingsw.pdd.conjuntos.rep;

public class Reclamo extends Reporte{
	
	public  Reporte informa(Reporte news) {	
		generarReclamo();
		//novedad puesta por el usuario en GUI
		return news;
	}

}
