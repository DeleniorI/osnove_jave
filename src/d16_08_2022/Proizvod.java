package d16_08_2022;

public class Proizvod {
	String naziv;
	double cena;
	double tezina;

	// Stampa proizvod
	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);
	}

	public double konvertuj(String jedinica) {
		if (jedinica.equals("kg")) {
			return this.tezina / 1000;
		} else if (jedinica.equals("t")) {
			return this.tezina / 1000000;
		} else {
			return 0;
		}

	}
}
