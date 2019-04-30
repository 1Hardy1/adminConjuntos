package ingsw.pdd.conjuntos.rep;

public abstract class Novedad {	
		private Reporte news;
		Reporte peticion= new Peticion().informa(news);
		Reporte queja= new Queja().informa(news);
		Reporte reclamo= new Reclamo().informa(news);

}