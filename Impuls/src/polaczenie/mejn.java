package polaczenie;

public class mejn {

	public static void main(String[] args) {
		PolaczenieZBD polaczenie = PolaczenieZBD.wezInstancje();

		polaczenie.polacz();
		System.out.println("Cos Tam");
		polaczenie.rozlacz();
	}

}
