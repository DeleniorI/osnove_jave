package d18_08_2022;

public class SmartAirConditioningMain {

	public static void main(String[] args) {
		SmartAirConditioning klima = new SmartAirConditioning();
		
		klima.marka = "Galanz";
		klima.potrosnjaHladi = 1;
		klima.potrosnjaGreje = 2;
		klima.temperatura = 20;
		klima.mod = "hladi";
		
		klima.stampaj();
		System.out.println(klima.mesecnaPotrosnja());
		System.out.println(klima.potrosnjaNovca());
		
		
		
	}

}
