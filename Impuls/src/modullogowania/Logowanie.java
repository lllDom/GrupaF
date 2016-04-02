package modullogowania;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Logowanie extends Application{

	@Override
	public void start(Stage primaryStage){
		try {
			korzen = FXMLLoader.load(getClass().getResource(logowanie));
			scena = new Scene(korzen);
			primaryStage.setScene(scena);
			primaryStage.show();
		} catch (IOException e) {
			System.out.println("Nie znaleziono pliku FXML");
		}
	}
	public static void main(String [] args) {
		launch(args);
	}

	private Parent korzen;
	private Scene scena;
	private String logowanie = "Logowanie.fxml";
}