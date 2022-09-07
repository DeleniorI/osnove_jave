package d06_09_2022;

public class StaklenaAmbalaza extends Ambalaza {

	private double kaucija;
	private boolean sePlacaKaucija;
	private double osnovnaCena;
	
	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double kaucija, boolean sePlacaKaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.kaucija = kaucija;
		this.sePlacaKaucija = sePlacaKaucija;
		this.osnovnaCena = osnovnaCena;
	}
	
	

	public double getKaucija() {
		return kaucija;
	}



	public void setKaucija(double kaucija) {
		this.kaucija = kaucija;
	}



	public boolean getSePlacaKaucija() {
		return sePlacaKaucija;
	}



	public void setSePlacaKaucija(boolean sePlacaKaucija) {
		this.sePlacaKaucija = sePlacaKaucija;
	}



	public double getOsnovnaCena() {
		return osnovnaCena;
	}



	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}



	@Override
	public double cenaArtikla() {
		if(this.sePlacaKaucija) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else {
			return this.osnovnaCena * 1.2;
		}
	}

	@Override
	public void print() {
		System.out.println("Staklena flasa:");
		System.out.println(this.barkod);
		System.out.println(this.nazivArtikla + " - " + this.cenaArtikla() + " rsd");
		System.out.println(this.tezinaPakovanja() + " g");


	}

}
