package d06_09_2022;

public class SuperKartica {
	private String brojKartice;
	private String imePrezime;

	private double popust;

	public SuperKartica() {

	}

	public SuperKartica(String brojKartice, String imePrezime, double popust) {
		super();
		this.brojKartice = brojKartice;
		this.imePrezime = imePrezime;
		this.popust = popust;
	}

	public String getBrojKartice() {
		return brojKartice;
	}

	public void setBrojKartice(String brojKartice) {
		this.brojKartice = brojKartice;
	}

	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}

	public double getPopust() {
		return popust;
	}

	public void setPopust(double popust) {
		this.popust = popust;
	}

	public void print() {
		System.out.println(this.brojKartice + ", " + this.imePrezime);
	}



}
