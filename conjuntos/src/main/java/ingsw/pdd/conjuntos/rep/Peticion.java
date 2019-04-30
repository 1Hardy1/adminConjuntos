package ingsw.pdd.conjuntos.rep;

public class Peticion extends Reporte {
	
	public  Reporte informa(Reporte news) {	
		generarPeticion();
		//novedad puesta por el usuario en GUI
		return news;
	}

}
