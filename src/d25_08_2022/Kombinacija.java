package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {
	private String idKombinacije;
	private ArrayList<Integer> nizBrojeva = new ArrayList<>();

	public Kombinacija(String idKombinacije, int jedan, int dva, int tri, int cetiri, int pet, int sest, int sedam) {
		this.idKombinacije = idKombinacije;
		this.nizBrojeva.add(jedan);
		this.nizBrojeva.add(dva);
		this.nizBrojeva.add(tri);
		this.nizBrojeva.add(cetiri);
		this.nizBrojeva.add(pet);
		this.nizBrojeva.add(sest);
		this.nizBrojeva.add(sedam);

	}

	public String getIdKombinacije() {
		return idKombinacije;
	}

	public ArrayList<Integer> getNizBrojeva() {
		return nizBrojeva;
	}

	public boolean daLiJeIstaKombinacija(Kombinacija k) {
		for (int i = 0; i < this.nizBrojeva.size(); i++) {
			if (this.nizBrojeva.get(i) != k.nizBrojeva.get(i)) {
				return false;
			}
		}
		return true;
	}
	
	public void print() {
		System.out.println("ID: " + this.idKombinacije);
		System.out.print("brojevi: ");
		for (int i = 0; i < this.nizBrojeva.size(); i++) {
			System.out.print(this.nizBrojeva.get(i) + " ");
		}
		System.out.println();
	}

}
