package d22_08_2022;

public class Vaga {
	String mernaJedinica;
	Proizvod proizvod;
	
	public Vaga() {
		
	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}
	
	public double sracunajCenu(double tezina) {
		if(this.mernaJedinica.equals("kg")) {
			return this.proizvod.getCenaKg() * tezina;
		} else if (this.mernaJedinica.equals("lb")) {
			return this.proizvod.getCenaLb() * tezina;
		} else {
			return 0;
		}
	}
	
	public void print(double tezina) {
		this.proizvod.print();
		if(this.mernaJedinica.equals("kg")) {
			System.out.println(this.proizvod.getCenaKg() + this.mernaJedinica + " x " + tezina);
		} else if (this.mernaJedinica.equals("lb")) {
			System.out.println(this.proizvod.getCenaLb() + this.mernaJedinica + " x " + tezina);
		}

		System.out.println(sracunajCenu(tezina));
		
	}
	
}
