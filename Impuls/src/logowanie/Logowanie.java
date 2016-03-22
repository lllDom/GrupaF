package logowanie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Logowanie {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/baza";
		String username = "postgres";
		String pass = "student";

		Connection conn = null;
		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, username, pass);
			System.out.println("Pomyslnie polaczono");

			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("Nie znaleziono sterownika");
		} catch (SQLException e) {
			System.out.println("Nieprawidlowe polaczenie");
		}

	}

}
