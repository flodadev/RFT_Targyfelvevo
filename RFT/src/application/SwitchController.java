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
	
	//V�lt�s a F�oldalra. Authentik�ci�
	public void SwitchToHomeScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//V�lt�s a Tant�rgy Felv�tele oldalra
	public void SwitchToApplyScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("AppSubject.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//V�lt�s a Felvett Tant�rgyak oldalra
	public void SwitchToTakenScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("TakenSubject.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//V�lt�s a bejelentkez� oldalra. Kil�p�s az adatb�zisb�l
	public void SwitchToLoginScene(ActionEvent event) throws IOException{
		root = FXMLLoader.load(getClass().getResource("Login.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		scene.getStylesheets().add(css);
		stage.setScene(scene);
		stage.show();
		
	}
	
	//Tant�rgy felv�tele met�dus
	public void ApplySubject() {
		
	}
	
	//Tant�rgy lead�sa met�dus
	public void UnsubSubject() {
		
	}
}
