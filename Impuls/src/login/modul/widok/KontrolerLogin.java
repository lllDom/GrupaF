package login.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import polaczenie.Polaczenie;
import javafx.scene.control.Alert.AlertType;


public class KontrolerLogin implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		poleLoginLogowanie.setText("");
		poleHasloLogowanie.setText("");
	}

	@FXML
	private TextField poleLoginLogowanie;

	@FXML
	private PasswordField poleHasloLogowanie;

	@FXML
	private Button buttonZalogujSie;

	@FXML
	private void zalogujSie(){
		login = poleLoginLogowanie.getText();
		haslo = poleHasloLogowanie.getText();
		if(login.equals("") && haslo.equals("")){
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Pola puste login i haslo!");
			alter.showAndWait();
		}else if(login.equals("") || haslo.equals("")){
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Login lub haslo jest puste!");
			alter.showAndWait();
		}else{
			Polaczenie pol = Polaczenie.wezInstancje();
			pol.polacz();
		}
	}

	private String login;
	private String haslo;
	private Alert alter;
}