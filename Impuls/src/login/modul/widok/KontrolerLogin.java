package login.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

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

	}
}