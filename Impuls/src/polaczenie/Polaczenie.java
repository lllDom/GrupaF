package polaczenie;
/**
 * @author GrupaF
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
			System.out.println("Polaczono");

		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono sterownika");
		} catch (SQLException ex) {
			System.out.println("Podano zle dane polaczenia");
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
			System.out.println("Zakonczono pomyslnie polaczenie");

		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono sterownika");
		} catch (SQLException ex) {
			System.out.println("Podano zle dane polaczenia");
		}
	}

	private static String nazwaSterownika = "org.postgresql.Driver";
	private static String url = "jdbc:postgresql://localhost:5432/baza";
	private static String nazwaUzytkownika = "postgres";
	private static String haslo = "haslo";
	private static Connection polaczenie = null;
	private static Polaczenie instancja = null;
}