package ingsw.pdd.conjuntos.cifrar.impl;

public interface IMessageEncrypt {
	
	public String encryptMessage(String password) throws Exception;	

	public String decryptMessage(String mensaje);

}
