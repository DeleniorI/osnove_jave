package d19_08_2022;

public class FacebookPost {
	
	private String imePrezimePrvi;
	private String imePrezimeDrugi;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;
	
	public FacebookPost() {
		
	}
	
	public FacebookPost(String imePrezimePrvi, String imePrezimeDrugi, String tekst) {
		this.imePrezimePrvi = imePrezimePrvi;
		this.imePrezimeDrugi = imePrezimeDrugi;
		this.tekst = tekst;
	}
	
	public void like() {
		this.brojLajkova = this.brojLajkova + 1;
	}
	public void dislike() {
		if(this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;
		} else {
			this.brojLajkova = 0;
		}
	}
	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	
	public void stampaj() {
		System.out.println(this.imePrezimePrvi + " >>> " + this.imePrezimeDrugi);
		System.out.println(this.tekst);
		System.out.println("Likes: " + this.brojLajkova + " | " + "Shares: " + this.brojDeljenja + "\n");
		
		
	}
	
}
