package modullogowania;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import polaczenie.PolaczenieZBD;

public class KontrolerLogowania implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		poleLoginLogowanie.setText("");
		poleHasloLogowanie.setText("");
	}

	@FXML
	private void zalogujSie(){
		System.out.println(poleLoginLogowanie.getText());
		System.out.println(poleHasloLogowanie.getText());
	}
	@FXML
	private TextField poleLoginLogowanie;
	@FXML
	private PasswordField poleHasloLogowanie;
	@FXML
	private Button buttonZalogujSie;


	private static PolaczenieZBD polaczenie;
	private static String login;
	private static String haslo;
}