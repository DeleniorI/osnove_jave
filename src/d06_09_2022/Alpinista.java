package d06_09_2022;

public class Alpinista extends Planinar {
	
	private int poeni;

	
	
	public Alpinista(int id, String imePrezime, int poeni) {
		super(id, imePrezime);
		this.poeni = poeni;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	

	@Override
	public double clanarina() {
		return 1500 - this.poeni * 50;
	}

	@Override
	public boolean usepsanUspon(Planina planina) {
		return planina.getVisina() <= 4000;
	}
	
	@Override
	public void print() {
		System.out.println("Alpinista: " + "id: " + this.id);
		System.out.println("Ime: " + this.imePrezime);
		System.out.println("Broj poena: " + this.poeni);
	}
	
}
