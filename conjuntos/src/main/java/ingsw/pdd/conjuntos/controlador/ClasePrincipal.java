package ingsw.pdd.conjuntos.controlador;

import java.io.*;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ClasePrincipal extends Application
{
	public static Stage stage;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/view/principal.fxml"));
	        Scene scene = new Scene(root);
	        stage = primaryStage;
	        primaryStage.setScene(scene);
	        primaryStage.show();
	}
	
    public static void main( String[] args )
    {
    	launch(args);
    }
    
    public static  void cerrarVentana() {
       	
        stage.close();

    }

}
