package d25_08_2022;

public class ListicMain {
	public static void main(String[] args) {
		
		Kombinacija kombinacija1 = new Kombinacija("2123", 1, 2, 3, 4, 5, 6, 7);
		Kombinacija kombinacija2 = new Kombinacija("3213", 1, 2, 3, 4, 5, 6, 7);
		
//		kombinacija.print();
//		System.out.println(prosledjena.daLiJeIstaKombinacija(kombinacija));
		
		
		Listic listic = new Listic();
		listic.dodajKombinaciju(kombinacija1);
		listic.dodajKombinaciju(kombinacija2);
		
		System.out.println(listic.dobitna(kombinacija2));
		listic.print();
	}
}
