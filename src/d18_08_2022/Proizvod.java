package d18_08_2022;

public class Proizvod {
	String naziv;
	double cena;
	double tezina;

	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezina);

	}

	public void povecajCenu(double povecanjeCene) {
		this.cena += povecanjeCene;
	}

	public double vratiCenuSaPopustom(double popust) {
		popust = popust / 100;
		return this.cena - (this.cena * popust);
	}

	public int racunajPostarinu() {
		if (this.tezina <= 100) {
			return 200;
		} else if (this.tezina >= 101 && this.tezina <= 500) {
			return 400;
		} else {
			return 1000;
		}

	}

}
