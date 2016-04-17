package polaczenie;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.scene.control.Alert;


public class Polaczenie {
	private Polaczenie(){}

	public static Polaczenie wezInstancje(){
		if (instancja == null){
			instancja = new Polaczenie();
		}
		return instancja;
	}
	public static Connection wezPolaczenie() {
		return polaczenie;
	}

	public static Connection wezPolaczenieZBazaDanych(){
		polaczenie = null;

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			polaczenie = DriverManager.getConnection(url, nazwaUzytkownika, hasloUzytkownika);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return polaczenie;
	}

	public boolean czyAktywnePolaczenie(){
		try {
			if(polaczenie.isClosed()){
				return false;
			}else{
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public void polacz(){
		try {
			Class.forName("org.postgresql.Driver");
			polaczenie = DriverManager.getConnection(url, nazwaUzytkownika, hasloUzytkownika);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void rozlacz(){
		try {
			polaczenie.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void polaczPonownie(){
		if(czyAktywnePolaczenie()){
			return;
		}else{
			polacz();
		}
	}

	public void wezAdmina(String login, String haslo){
		Connection pol = wezPolaczenieZBazaDanych();
		try {
			PreparedStatement pre = pol.prepareStatement("SELECT login, haslo FROM Dane_osobowe JOIN Admin USING (id_dana_osobowa) WHERE login = ? AND haslo = ?");
			pre.setString(1, login);
			pre.setString(2, haslo);
			ResultSet rs = pre.executeQuery();

			while(rs.next()){
				String log = rs.getString("login");
				System.out.println(log);
				String has = rs.getString("haslo");
				System.out.println(has);
			}
			rs.close();
			pre.close();
			pol.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void wezKierownika(String login, String haslo){
		Connection pol = wezPolaczenieZBazaDanych();
		try {
			PreparedStatement pre = pol.prepareStatement("SELECT login, haslo FROM Dane_osobowe JOIN Szefowie USING (id_dana_osobowa) WHERE login = ? AND haslo = ?");
			pre.setString(1, login);
			pre.setString(2, haslo);
			ResultSet rs = pre.executeQuery();

			while(rs.next()){
				String log = rs.getString("login");
				System.out.println(log);
				String has = rs.getString("haslo");
				System.out.println(has);
			}
			rs.close();
			pre.close();
			pol.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void wezPracownika(String login, String haslo){
		Connection pol = wezPolaczenieZBazaDanych();
		try {
			PreparedStatement pre = pol.prepareStatement("SELECT login, haslo FROM Dane_osobowe JOIN Pracownicy USING (id_dana_osobowa) WHERE login = ? AND haslo = ?");
			pre.setString(1, login);
			pre.setString(2, haslo);
			ResultSet rs = pre.executeQuery();

			while(rs.next()){
				String log = rs.getString("login");
				System.out.println(log);
				String has = rs.getString("haslo");
				System.out.println(has);
			}
			rs.close();
			pre.close();
			pol.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static String url = "jdbc:postgresql://localhost:5432/baza";
	private static String nazwaUzytkownika = "postgres";
	private static String hasloUzytkownika = "haslo";
	private static Connection polaczenie = null;
	private static Polaczenie instancja = null;
	private static Alert alert;
}