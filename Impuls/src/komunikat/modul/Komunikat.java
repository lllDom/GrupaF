package komunikat.modul;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import komunikat.modul.widok.KontrolerKomunikat;

public class Komunikat extends Application{

	@Override
	public void start(Stage glownaScena){
		this.glownaScena = glownaScena;
		this.glownaScena.setTitle("Komunikat");
		zaladujOkno();
	}

	private void zaladujOkno(){
		try {
			ladowacz = new FXMLLoader();
			ladowacz.setLocation(getClass().getResource(komunikat));
			wartstwa = (Pane)ladowacz.load();
			scena = new Scene(wartstwa);
			glownaScena.setScene(scena);
			glownaScena.show();
			kontroler = ladowacz.getController();
			kontroler.ustawKomunikat(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String [] args) {
		launch(args);
	}

	public Stage wezGlownaScena() {
		return glownaScena;
	}

	private Stage glownaScena;
	private String komunikat = "widok/Komunikat.fxml";
	private FXMLLoader ladowacz;
	private Pane wartstwa;
	private Scene scena;
	private KontrolerKomunikat kontroler;
}