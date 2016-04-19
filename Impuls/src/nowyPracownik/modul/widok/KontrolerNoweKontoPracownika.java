package nowyPracownik.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class KontrolerNoweKontoPracownika implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		poleNowyImiePracownik.setText("");
		poleNowyNazwiskoPracownik.setText("");
		poleNowyHasloPracownik.setText("");
		poleNowyHasloPracownik.setText("");
		listaNowyTypKonta.getItems().addAll(szef,pracownik);

	}

	@FXML
	private void anulujDodaniePracownika(){
		Stage scena = (Stage) buttonNowyAnulujPracownik.getScene().getWindow();
		scena.close();
	}

	@FXML
	private void stworzKonto(){
		elementZChoiceBox = listaNowyTypKonta.getSelectionModel().getSelectedItem();
		if(poleNowyImiePracownik.getText().equals("")){
			alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Komunikat!");
			alert.setHeaderText(null);
			alert.setContentText("Nie pisales imienia!");
			alert.showAndWait();
		}else if (poleNowyNazwiskoPracownik.getText().equals("")){
			alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Komunikat!");
			alert.setHeaderText(null);
			alert.setContentText("Nie pisales nazwiska!");
			alert.showAndWait();
		}else if(poleNowyLoginPracownik.getText().equals("")){
			alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Komunikat!");
			alert.setHeaderText(null);
			alert.setContentText("Nie pisales loginu!");
			alert.showAndWait();
		}else if (poleNowyHasloPracownik.getText().equals("")){
			alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Komunikat!");
			alert.setHeaderText(null);
			alert.setContentText("Nie pisales hasla!");
			alert.showAndWait();
		}else if (null == elementZChoiceBox){
			alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Komunikat!");
			alert.setHeaderText(null);
			alert.setContentText("Nie wybrales typu konta!");
			alert.showAndWait();
		}else{

		}
	}
	@FXML
	private TextField poleNowyLoginPracownik;
	@FXML
	private TextField poleNowyHasloPracownik;
	@FXML
	private TextField poleNowyImiePracownik;
	@FXML
	private TextField poleNowyNazwiskoPracownik;
	@FXML
	private ChoiceBox<String> listaNowyTypKonta;
	@FXML
	private Button buttonNowyAnulujPracownik;
	@FXML
	private Button buttonNowyStworzPracownik;

	private Alert alert;
	private String szef= "Szef";
	private String pracownik = "Pracownik";
	private String elementZChoiceBox = null;
}
