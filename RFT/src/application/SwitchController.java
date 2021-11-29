package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SwitchController {
	
	private Parent root;
	private Stage stage;
	private Scene scene;
	private String css = this.getClass().getResource("style.css").toExternalForm();
	
	//Váltás a Fõoldalra. Authentikáció
	public void SwitchToHomeScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Váltás a Tantárgy Felvétele oldalra
	public void SwitchToApplyScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("AppSubject.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Váltás a Felvett Tantárgyak oldalra
	public void SwitchToTakenScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("TakenSubject.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Váltás a bejelentkezõ oldalra. Kilépés az adatbázisból
	public void SwitchToLoginScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Tantárgy felvétele metódus
	public void ApplySubject() {
		
	}
	
	//Tantárgy leadása metódus
	public void UnsubSubject() {
		
	}
}
