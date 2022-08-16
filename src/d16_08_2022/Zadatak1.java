package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod cokolada = new Proizvod();
		Proizvod hleb = new Proizvod();

		cokolada.naziv = "Milka Oreo";
		cokolada.cena = 200.00;
		cokolada.tezina = 100.00;

		hleb.naziv = "Razani hleb";
		hleb.cena = 50.00;
		hleb.tezina = 250.00;

		cokolada.stampaj();
		hleb.stampaj();
		
		cokolada.konvertuj("kg");
		hleb.konvertuj("t");

	}

}
