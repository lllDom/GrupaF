package komunikat.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class KontrolerKomunikat implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		poleKomunikat.setText(komunikat);
	}

	@FXML
	private Label poleKomunikat;

	@FXML
	private Button buttonZamknijKomunikat;

	@FXML
	private void zamknijOkno(){
		glowneOkno = (Stage) buttonZamknijKomunikat.getScene().getWindow();
		glowneOkno.close();
	}

	private Stage glowneOkno;
	private String komunikat = "Domyslny komunikat";
}