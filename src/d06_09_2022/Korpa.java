package d06_09_2022;

import java.util.ArrayList;

public class Korpa {
	private ArrayList<Ambalaza> nizAmbalaza = new ArrayList<>();

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.nizAmbalaza.add(ambalaza);
	}

	public void izbaciAmbalazu(String barkod) {
		for (int i = this.nizAmbalaza.size(); i >= 0; i++) {
			if (this.nizAmbalaza.get(i).getBarkod().equals(barkod)) {
				this.nizAmbalaza.remove(i);
			}
		}
	}

	private double cenaSvihPopust(double popust) {
		double zbir = 0;
		for (int i = 0; i < this.nizAmbalaza.size(); i++) {
			zbir += this.nizAmbalaza.get(i).cenaArtikla();
		}
		return zbir - popust;
	}

	public double ukupnaCenaKorpe(SuperKartica sk) {

		return cenaSvihPopust(sk.getPopust());

	}

}
