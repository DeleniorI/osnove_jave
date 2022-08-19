package d19_08_2022;
// Kreirati klasu FacebookPost koja ima:
//	   Od atributa:
//	ime i prezime korisnika koji je objavio post
//	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//	tekst objave
//	broj lajkova
//	broj deljenja
//	 Konstruktore:
//	difoltni konstuktor
//	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//	  Od metoda:
//	like(), koja povecava broj lajkova za 1.
//	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//	share(), koja povecava broj deljenja za 1
//	print(), koja stampa objavu u formatu:
//	(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//	(tekst objave)
//	Likes (broj lajkova) | Shares (broj deljenja)
//
//	U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//	Primer stampanja:
//	Milan Jovanovic >>> Pera Peric
//	Ovo je tekst objave
//	Likes 3 | Shares 1

public class FacebookPostMain {

	public static void main(String[] args) {
		FacebookPost post1 = new FacebookPost("Ilija Nestorovic", "Nikola Nikolic", "Alo de si bre");
		FacebookPost post2 = new FacebookPost("Marko Markovic", "Stevan Stevovic", "www.youtube.com/watch#123tdssd34");
		
		post1.like();
		post1.like();
		post1.like();
		post1.dislike();
		post1.dislike();
		post1.share();
		post1.share();
		post1.share();
		post1.stampaj();
		
		post2.like();
		post2.like();
		post2.like();
		post2.like();
		post2.dislike();
		post2.dislike();
		post2.dislike();
		post2.dislike();
		post2.dislike();
		post2.share();
		post2.share();
		post2.stampaj();
	}

}
