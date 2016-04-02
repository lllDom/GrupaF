package modullogowania;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import polaczenie.PolaczenieZBD;

public class Controller implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		buttonZalogujSie.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				polaczenie = PolaczenieZBD.wezInstancje();
				login = poleLoginLogowanie.getText();
				haslo = poleHasloLogowanie.getText();
			}
		});
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