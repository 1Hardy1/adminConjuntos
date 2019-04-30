package ingsw.pdd.conjuntos.rep;

public class Queja extends Reporte{

	public  Reporte informa(Reporte news) {	
		generarQueja();
		//novedad puesta por el usuario en GUI
		return news;
	}
}
