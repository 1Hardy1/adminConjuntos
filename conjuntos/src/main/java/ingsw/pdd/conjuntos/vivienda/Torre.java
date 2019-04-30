package ingsw.pdd.conjuntos.vivienda;

import java.util.ArrayList;



public class Torre {

	private int numero;
	private Vivienda vivienda;
	private ArrayList<Casa> casas;

	


	public Torre(int numero, Vivienda vivienda) {
		super();
		this.numero = numero;
		this.vivienda = vivienda;

	}

	public Torre(int numero, Vivienda vivienda, ArrayList<Casa> casas) {
		super();
		this.numero = numero;
		this.vivienda = vivienda;
		this.casas = casas;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Vivienda getViviedna() {
		return vivienda;
	}


	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}


	public ArrayList<Casa> getcasas() {
		return casas;
	}


	public void setCasas(ArrayList<Casa> casas) {
		this.casas = casas;
	}


	@Override
	public String toString() {
		return "Torre [numero=" + numero + ", vivienda=" + vivienda + ", casas=" + casas.toString() + "]";
	}


}
