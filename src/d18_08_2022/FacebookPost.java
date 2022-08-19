package d18_08_2022;

public class FacebookPost {
	String imePrezimePrvi;
	String imePrezimeDrugi;
	String tekst;
	int brojLajkova;
	int brojDeljenja;

	public void like() {
		this.brojLajkova = this.brojLajkova + 1;

	}

	public void dislike() {
		if (this.brojLajkova > 0) {
			this.brojLajkova = this.brojLajkova - 1;

		} else {
			this.brojLajkova = 0;
		}
	}
	public void share() {
		this.brojDeljenja = this.brojDeljenja + 1;
	}
	
	public void print() {
		System.out.println(imePrezimePrvi + " >>>>> " + imePrezimeDrugi);
		System.out.println(tekst);
		System.out.println("Likes: " + brojLajkova + " | " + "Shares: " + brojDeljenja);
	}
}
