package d25_08_2022;

import java.util.ArrayList;

public class Listic {
	ArrayList<Kombinacija> nizKombinacija = new ArrayList<>();

	public void dodajKombinaciju(Kombinacija k) {
		this.nizKombinacija.add(k);
	}

	public boolean dobitna(Kombinacija dobitnaKombinacija) {
		for (int i = 0; i < nizKombinacija.size(); i++) {

			if (!this.nizKombinacija.get(i).daLiJeIstaKombinacija(dobitnaKombinacija)) {
				return false;
			}
		}

		return true;

	}

	public void print() {
		for (int i = 0; i < this.nizKombinacija.size(); i++) {
			this.nizKombinacija.get(i).print();
		}
	}
}
