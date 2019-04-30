package ingsw.pdd.conjuntos.vivienda;

import java.util.ArrayList;
import ingsw.pdd.conjuntos.impl.IBuild;

public class BuildTorre implements IBuild<Torre>{


	
	private int numero;
	private Vivienda vivienda;
	private final ArrayList<Casa> casas = new ArrayList<>();
	private Vivienda Vivienda;

	public BuildTorre setNumero(int numero) {
		this.numero=numero;
		return this;
	}
	public BuildTorre setZona(String idzona, String nombre, float administracion, ArrayList<String> numeros, float costo) {
		this.Vivienda = new Vivienda(idzona, nombre);
		return this;
	}
	
	public BuildTorre addCasas(int numero, String habitante) {
		casas.add(new Casa(habitante));
		return this;
	}
	
	@Override
	public Torre build() {		
		return new Torre(numero, vivienda, casas);
		
	}

}
