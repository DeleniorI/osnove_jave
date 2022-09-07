package d06_09_2022;

public class Tetrapak extends Ambalaza {
	private boolean seReciklira;
	private double osnovnaCena;

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean seReciklira,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina);
		this.seReciklira = seReciklira;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isSeReciklira() {
		return seReciklira;
	}

	public void setSeReciklira(boolean seReciklira) {
		this.seReciklira = seReciklira;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		if (this.seReciklira) {
			return this.tezinaPakovanja() * 1.5 + this.osnovnaCena;
		} else {
			return this.osnovnaCena;
		}
	}

	@Override
	public void print() {
		System.out.println("Tetrapak: ");
		System.out.println(this.barkod);
		System.out.println(this.nazivArtikla + " - " + this.cenaArtikla() + " rsd");
		System.out.println(this.tezinaPakovanja() + " g");

	}

}
