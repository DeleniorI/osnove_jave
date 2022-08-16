package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning klima1 = new SmartAirConditioning();
		SmartAirConditioning klima2 = new SmartAirConditioning();
		
		klima1.marka = "Samsung";
		klima1.mod = "greje";
		klima1.temperatura = 23.7;
		
		klima2.marka = "Galanz";
		klima2.mod = "hladi";
		klima2.temperatura = 18.0;
		
		// Pozivanje metoda
		klima1.stampaj();
		boolean temp1 = klima1.jeVecaNapolju(30);
		System.out.println("Prva klima: " + temp1);
		
		System.out.println(); // new line zbog preglednosti
		
		klima2.stampaj();
		boolean temp2 = klima2.jeVecaNapolju(12);
		System.out.println("Druga klima: " + temp2);

		
		
		
		
		
		
	}

}
