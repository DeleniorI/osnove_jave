package d06_09_2022;

public class AmbalazaMain {

	public static void main(String[] args) {
		
		Ambalaza tetrapak = new Tetrapak("3215-213", "Mleko", 500, 550, true, 120);
		Ambalaza staklenaFlasa = new StaklenaAmbalaza("1234-4321", "Voda", 800 , 1000, 50, true, 110);
		SuperKartica sk = new SuperKartica("1236-42144-3212", "Ilija Nestorovic", 174);		
		
		Korpa korpa = new Korpa();
		korpa.dodajAmbalazu(tetrapak);
		korpa.dodajAmbalazu(staklenaFlasa);
		
		
		
		tetrapak.print();
		staklenaFlasa.print();
	
		System.out.println("Ukupna cena korpe: " + korpa.ukupnaCenaKorpe(sk));
	}

}
