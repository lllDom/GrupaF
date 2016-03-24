package polaczenie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PolaczenieZBD {
	private static PolaczenieZBD instancja = null;

	private PolaczenieZBD(){}

	public static PolaczenieZBD wezInstancje(){
		if (instancja == null){
			instancja = new PolaczenieZBD();
		}
		return instancja;
	}

	public static void polacz(){
		try {
			Class.forName(NazwaSterownika);

			polaczenie = DriverManager.getConnection(Url, NazwaUzytkownika, Haslo);
			System.out.println("Połączono");

		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono sterownika");
		} catch (SQLException ex) {
			System.out.println("Podano zle dane polaczenia");
		}
	}

	public static void rozlacz(){
		try {

			Class.forName(NazwaSterownika);
			polaczenie.close();
			System.out.println("Zakonczono pomyslnie polaczenie");

		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono sterownika");
		} catch (SQLException ex) {
			System.out.println("Podano zle dane polaczenia");
		}
	}

	private static String NazwaSterownika = "org.postgresql.Driver";
	private static String Url = "jdbc:postgresql://localhost:5432/baza";
	private static String NazwaUzytkownika = "postgres";
	private static String Haslo = "haslo";
	private static Connection polaczenie = null;
}