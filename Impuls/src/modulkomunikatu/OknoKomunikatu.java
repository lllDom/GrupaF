package modulkomunikatu;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OknoKomunikatu extends Application{

	@Override
	public void start(Stage primaryStage){
		try {
			korzen = FXMLLoader.load(getClass().getResource(komunikat));
			scena = new Scene(korzen);
			primaryStage.setScene(scena);
			primaryStage.show();
		} catch (IOException wyjatek) {
			wyjatek.printStackTrace();
		}
	}

	public static void main(String [] args) {
		launch(args);
	}

	private Parent korzen;
	private Scene scena;
	private String komunikat = "OknoKomunikatu.fxml";
}