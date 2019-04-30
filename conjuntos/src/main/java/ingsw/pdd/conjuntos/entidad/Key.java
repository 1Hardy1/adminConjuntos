package ingsw.pdd.conjuntos.entidad;


public class Key extends Administrador{
	
	private int llave;
	private static Key Key=null;
	
	private Key() {
		
	}
	
	public static Key getInstance() {
		if(Key==null) {
			Key=new Key();
		}
		return Key;
	}

	public int getLlave() {
		return llave;
	}

	public void setLlave(int llave) {
		this.llave = llave;
	}
	
	

}
