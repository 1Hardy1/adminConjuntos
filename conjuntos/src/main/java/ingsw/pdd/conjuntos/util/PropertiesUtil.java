package ingsw.pdd.conjuntos.util;

import java.io.InputStream;
import java.util.Properties;


public class PropertiesUtil {
	
	public static Properties loadProperty(String arc){
		 try {
	            Properties properties = new Properties();
	            InputStream inputStream = PropertiesUtil.class.getClassLoader().getResourceAsStream(arc);
	            properties.load(inputStream);
	            return properties;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
   }

}
