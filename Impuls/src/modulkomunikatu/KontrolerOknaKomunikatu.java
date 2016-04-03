package modulkomunikatu;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class KontrolerOknaKomunikatu implements Initializable{
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		poleKomunikat.setText(domyslnyTekst);
	}
	@FXML
	private void zamknijOkno(){
		scena = (Stage) buttonZamknijKomunikat.getScene().getWindow();
		scena.close();
	}

	public void ustawOpisKomunikatu(String komunikat){
		poleKomunikat.setText(komunikat);
	}
	@FXML
	private Label poleKomunikat;

	@FXML
	private Button buttonZamknijKomunikat;

	private static Stage scena;
	private static String domyslnyTekst = "Domyslny tekst";
}