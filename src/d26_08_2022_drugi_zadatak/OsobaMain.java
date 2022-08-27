package d26_08_2022_drugi_zadatak;

public class OsobaMain {

	public static void main(String[] args) {
		Karton zuti = new Karton("zuti");
		Karton crveni = new Karton("crveni");
		
		Igrac igrac1 = new Igrac("Ilija Nestorovic", "1505998710233", 1998, 11, "defanizvac", false);
		igrac1.dodajKarton(zuti);
		igrac1.dodajKarton(zuti);
		igrac1.dodajKarton(crveni);
		igrac1.dodajKarton(crveni);
		igrac1.dodajKarton(crveni);
		Igrac igrac2 = new Igrac("Marko Markovic", "12325123215", 1999, 7, "centarfor", true );
		igrac2.dodajKarton(zuti);
		igrac2.dodajKarton(zuti);
		igrac2.dodajKarton(zuti);
		igrac2.dodajKarton(crveni);

		igrac1.print();
		igrac2.print();
	}

}
