package miniProjekat30_08_2022;

public class Player {
	private String imePrezime;

	public Player(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public String getImePrezime() {
		return imePrezime;
	}

	public void setImePrezime(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	public void print() {
		System.out.println(this.imePrezime);
	}
	
	
}
