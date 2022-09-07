package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	private String imePrezime;
	private ArrayList<Sektor> nizSektora = new ArrayList<>();

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public ArrayList<Sektor> getNizSektora() {
		return nizSektora;
	}

	public void zaposliUSektor(Sektor sektor) {
		this.nizSektora.add(sektor);
	}

	public abstract double plataRadnika();

}
