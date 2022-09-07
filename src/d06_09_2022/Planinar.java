package d06_09_2022;

public abstract class Planinar {
	protected int id;
	protected String imePrezime;

	public Planinar(int id, String imePrezime) {
		super();
		this.id = id;
		this.imePrezime = imePrezime;
	}

	public int getId() {
		return id;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public abstract void print();
	
	public abstract double clanarina();
	
	public abstract boolean usepsanUspon(Planina planina);

	
}
