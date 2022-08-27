package d26_08_2022_drugi_zadatak;

import java.util.ArrayList;

public class Igrac extends Osoba {
	private int broj;
	private String pozicija;
	private boolean kapiten;
	ArrayList<Karton> nizKartona = new ArrayList<>();

	public Igrac() {

	}

	public Igrac(String imePrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
		super(imePrezime, jmbg, godinaRodjenja);
		this.broj = broj;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
		this.nizKartona = nizKartona;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	public void dodajKarton(Karton k) {
		this.nizKartona.add(k);
	}

	public int brojZutih() {
		int brojac = 0;
		for (int i = 0; i < this.nizKartona.size(); i++) {
			if (this.nizKartona.get(i).getTipKartona().equals("zuti")) {
				brojac++;
			} 

		}
		return brojac;
		
	}
	
	public int brojCrvenih() {
		int brojac = 0;
		for(int i = 0; i < this.nizKartona.size(); i++) {
			if(this.nizKartona.get(i).getTipKartona().equals("crveni")) {
				brojac++;
			}
		}
		return brojac;
	}
	@Override
	public void print() {
		super.print();
		System.out.println("Broj koji igrac nosi: " + this.broj);
		System.out.println("Pozicija koju igra: " + this.pozicija);
		System.out.println("Igrac je kapiten: " + this.kapiten);
		System.out.println("Kartoni: ");
		System.out.println("Zutih kartona: " + brojZutih());
		System.out.println("Crvenih kartona: " + brojCrvenih());
		
		
	}

}
