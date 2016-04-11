package login.modul;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Login extends Application{

	@Override
	public void start(Stage glownaScena){
		this.glownaScena = glownaScena;
		this.glownaScena.setTitle("Komunikat");
		zaladujOkno();
	}

	private void zaladujOkno(){
		try {
			korzen = FXMLLoader.load(getClass().getResource(komunikat));
			scena = new Scene(korzen);
			glownaScena.setScene(scena);
			glownaScena.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String [] args) {
		launch(args);
	}

	public Scene getScena() {
		return scena;
	}

	private Stage glownaScena;
	private Parent korzen;
	private Scene scena;
	private String komunikat = "widok/Login.fxml";
}