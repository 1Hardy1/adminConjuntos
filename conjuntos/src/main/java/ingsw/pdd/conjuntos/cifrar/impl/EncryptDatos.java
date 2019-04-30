package ingsw.pdd.conjuntos.cifrar.impl;

import ingsw.pdd.conjuntos.cifrar.metodo.*;

	
	public class EncryptDatos implements IMessageEncrypt{
	    private IEncryptAlgorithm encryptAlgorith;
	  
	    public EncryptDatos(IEncryptAlgorithm encryptAlgorith){
	        this.encryptAlgorith = encryptAlgorith;
	    }

	    @Override
	    public String encryptMessage(String password)throws Exception {
	        return encryptAlgorith.cifrarMensaje(password);
	    }
	   
		@Override
		public String decryptMessage(String mensaje) {
			return encryptAlgorith.descifrarMensaje(mensaje);
		}

}
