package polaczenie;
/**
 * @author GrupaF
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/** Klasa Polaczenia z baza danych. */
public class Polaczenie {
	/** Prywatny konstruktor klasy PolaczenieZBD. */
	private Polaczenie(){}

	/**
	 * Metoda wezInstancje sprawdza warunek. Czy wewnetrzna instancja klasy PolaczenieZBD
	 * jest wartosci null. Je¿eli tak to inicjalizuje instancje nowym obiektem tej klasy.
	 * @return zainicjalizowany obiekt tej klasy typy PolaczenieZBD.
	 */
	public static Polaczenie wezInstancje(){
		if (instancja == null){
			instancja = new Polaczenie();
		}
		return instancja;
	}

	/**
	 * Metoda polacz() laczy sie z baza danych.
	 * @exception ClassNotFoundException w razie nie znalezienia sterownika.
	 * @exception SQLException Gdy podano zle dane.
	 */
	public static void polacz(){
		try {
			Class.forName(nazwaSterownika);
			polaczenie = DriverManager.getConnection(url, nazwaUzytkownika, haslo);

			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Polaczono z Baza danych!");
			alter.showAndWait();

		} catch (ClassNotFoundException e) {
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Nie znaleziono sterownika!");
			alter.showAndWait();
		} catch (SQLException ex) {
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Podano zle dane polaczenia!");
			alter.showAndWait();
		}
	}

	public static void ponowniePolacz(){
		try {
			Class.forName(nazwaSterownika);
			polaczenie = DriverManager.getConnection(url, nazwaUzytkownika, haslo);

			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Polaczono z Baza danych!");
			alter.showAndWait();

		} catch (ClassNotFoundException e) {
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Nie znaleziono sterownika!");
			alter.showAndWait();
		} catch (SQLException ex) {
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Podano zle dane polaczenia!");
			alter.showAndWait();
		}
	}

	/**
	 * Metoda rozlacz() konczy polaczenie z baza danych.
	 * @exception ClassNotFoundException w razie nie znalezienia sterownika.
	 * @exception SQLException gdy podano zle dane.
	 */
	public static void rozlacz(){
		try {

			Class.forName(nazwaSterownika);
			polaczenie.close();
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Pomyslnie zakonczono polaczenie!");
			alter.showAndWait();

		} catch (ClassNotFoundException e) {
			alter = new Alert(AlertType.INFORMATION);
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Nie znaleziono sterownika!");
			alter.showAndWait();
		} catch (SQLException ex) {
			alter.setTitle("Komunikat!");
			alter.setHeaderText(null);
			alter.setContentText("Podano zle dane polaczenia!");
			alter.showAndWait();
		}
	}

	private static String nazwaSterownika = "org.postgresql.Driver";
	private static String url = "jdbc:postgresql://localhost:5432/baza";
	private static String nazwaUzytkownika = "postgres";
	private static String haslo = "haslo";
	private static Connection polaczenie = null;
	private static Polaczenie instancja = null;
	private static Alert alter;
}