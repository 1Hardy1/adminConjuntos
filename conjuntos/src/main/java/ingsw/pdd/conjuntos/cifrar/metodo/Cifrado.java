package ingsw.pdd.conjuntos.cifrar.metodo;


import ingsw.pdd.conjuntos.cifrar.impl.*;

public class Cifrado {
	
	public static String claveCifrada(String mensaje) {
		String passwordCifrado = null;
    	
        IMessageEncrypt aesImpl = new EncryptDatos(new AESEncryptAlgorithm());
		try {
			passwordCifrado = aesImpl.encryptMessage(mensaje);
			} catch (Exception e) {
			e.printStackTrace();
		}
		return passwordCifrado;
	}

	public static String claveDecifrada(String mensaje) {
		String contraseñaDescifrada=null;
		IMessageEncrypt aesImpl = new EncryptDatos(new AESEncryptAlgorithm());
		try {
			
			contraseñaDescifrada =aesImpl.decryptMessage(mensaje);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return contraseñaDescifrada;
	}

}
