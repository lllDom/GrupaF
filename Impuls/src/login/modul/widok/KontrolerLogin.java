package login.modul.widok;

import java.net.URL;
import java.util.ResourceBundle;

import admin.modul.Admin;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import polaczenie.Polaczenie;
import pracownik.modul.Pracownik;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;
import kierownik.modul.Kierownik;


public class KontrolerLogin implements Initializable{

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		poleLoginLogowanie.setText("");
		poleHasloLogowanie.setText("");
	}

	@FXML
	private TextField poleLoginLogowanie;

	@FXML
	private PasswordField poleHasloLogowanie;

	@FXML
	private Button buttonZalogujSie;

	@FXML
	private void zalogujSie(){
		login = poleLoginLogowanie.getText();
		haslo = poleHasloLogowanie.getText();
		if(login.equals("") && haslo.equals("")){
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Pola puste login i haslo!");
			alter.showAndWait();
		}else if(login.equals("") || haslo.equals("")){
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Login lub haslo jest puste!");
			alter.showAndWait();
		}else{
			Polaczenie pol = Polaczenie.wezInstancje();
			boolean warunek = pol.wezPracownika(login, haslo);
			boolean warunek2 = pol.wezKierownika(login, haslo);
			boolean warunek3 = pol.wezAdmina(login, haslo);

			if(warunek){
				Pracownik pr = new Pracownik();
				pr.start(new Stage());
			}else if(warunek2){
				Kierownik kierownik = new Kierownik();
				kierownik.start(new Stage());
			}else if (warunek3){
				Admin admin = new Admin();
				admin.start(new Stage());
			}else{
				alter = new Alert(AlertType.INFORMATION);
				alter.setTitle("Komunikat!");
				alter.setHeaderText(null);
				alter.setContentText("Podales zle dane sprobuj ponownie!");
				alter.showAndWait();
			}
		}
	}

	private String login;
	private String haslo;
	private Alert alter;
}