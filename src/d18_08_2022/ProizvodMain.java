package d18_08_2022;

public class ProizvodMain {

	public static void main(String[] args) {

		Proizvod proizvod = new Proizvod();

		proizvod.naziv = "Mleko";
		proizvod.cena = 150;
		proizvod.tezina = 101;
		proizvod.stampaj();
		proizvod.povecajCenu(100);
		proizvod.stampaj();
		double cenaSaPopustom = proizvod.vratiCenuSaPopustom(20);
		System.out.println("Cena sa popustom je: " + cenaSaPopustom);
		int cenaPostarine = proizvod.racunajPostarinu();
		System.out.println("Cena postarine je: " + cenaPostarine);

	}

}
