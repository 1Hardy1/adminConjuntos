package ingsw.pdd.conjuntos.controlador;

import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class IniciarSesionControlador {
	
	@FXML
	private Button btnIniciar;

	@FXML
	private Button btnVolver;
	
	@FXML
	private TextField txtUsuario;
	
	@FXML
	private TextField txtContraseña;

	
	@FXML
	void clickBtnIniciar(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnIniciar.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/view/menuprincipal.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		stage.setFullScreen(true);
	}

	@FXML
	void clickBtnVolver(ActionEvent event) throws IOException {
		Stage stage = (Stage) btnVolver.getScene().getWindow();
		Parent root = FXMLLoader.load(getClass().getResource("/view/Sprincipal.fxml"));
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}	
	
}
