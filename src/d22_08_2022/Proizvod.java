package d22_08_2022;

public class Proizvod {
	String sifraProizvoda;
	String nazivProizvoda;
	double cenaPoKg;
	
	public Proizvod(String sifraProizvoda, String nazivProizvoda, double cenaPoKg) {
		this.sifraProizvoda = sifraProizvoda;
		this.nazivProizvoda = nazivProizvoda;
		this.cenaPoKg = cenaPoKg;
	}

	public String getSifraProizvoda() {
		return sifraProizvoda;
	}

	public void setSifraProizvoda(String sifraProizvoda) {
		this.sifraProizvoda = sifraProizvoda;
	}

	public String getNazivProizvoda() {
		return nazivProizvoda;
	}

	public void setNazivProizvoda(String nazivProizvoda) {
		this.nazivProizvoda = nazivProizvoda;
	}
	
	public double getCenaKg() {
		return this.cenaPoKg;
	}
	
	public double getCenaLb() {
		return this.cenaPoKg / 2.2046;
	}
	
	public void print() {
		System.out.println(this.sifraProizvoda + " - " + this.nazivProizvoda);
	}
}
