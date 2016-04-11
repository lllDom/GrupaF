package komunikat.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import komunikat.modul.Komunikat;

public class KontrolerKomunikat implements Initializable{

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
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

	public Komunikat wezKomunikat() {
		return komunikat;
	}
	public void ustawKomunikat(Komunikat komunikat) {
		this.komunikat = komunikat;
	}

	private Stage glowneOkno;
	private Komunikat komunikat;
}