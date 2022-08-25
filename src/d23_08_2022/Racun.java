package d23_08_2022;
// Zadatak
// Kreirati klasu Racun koja ima:
// broj racuna (npr: 170-289328923-23)
// ime i prezime osobe
// trenutno stanje na racunu (npr: 100, 1220)
// gettere i setter za sve atribute, sem settera za stanje na racunu
// metodu koja menja stanje na racunu za prosledjenu vrednost (stanje na racunu ne moze da bude manje od nule)
// metodu koja stampa podatke o racunu u formatu:
// Ime i prezime  -  broj racuna
// stanje na racunu je (trenutno stanje) rsd.



public class Racun {
	private String brojRacuna;
	private String ime;
	private String prezime;
	private double stanje;
	

	public String getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(String brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public double getStanje() {
		return stanje;
	}
	
	public void promeniStanje(double cifra) {
		this.stanje += cifra;
		if (this.stanje < 0) {
			this.stanje = 0;
		}
		
	}
	
	public void print() {
		System.out.println(this.ime + " " + this.prezime + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.stanje + " rsd.");
		
	}

	
	
	
}
