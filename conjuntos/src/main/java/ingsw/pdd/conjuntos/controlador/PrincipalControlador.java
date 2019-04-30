package ingsw.pdd.conjuntos.controlador;

import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class PrincipalControlador {
	
	@FXML
	private Button btnIniciar;

	@FXML
	private Button btnRegistrar;



	@FXML
	void clickBtnIniciar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnIniciar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/view/IniciarSesion.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setFullScreen(true);
		
	
	}

	@FXML
	void clickBtnRegistrar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnRegistrar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/view/registrar.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
}
