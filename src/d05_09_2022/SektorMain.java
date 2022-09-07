package d05_09_2022;

public class SektorMain {

	public static void main(String[] args) {
		Sektor sektor = new Sektor();
		Sektor sektor1 = new Sektor();
		Sektor sektor2 = new Sektor();
		sektor1.setPlata(47000);
		sektor2.setPlata(100000);
		
		Magacioner magacioner = new Magacioner();
		Radnik menadzer = new Menadzer();
	
		magacioner.setImePrezime("Ilija Nestorovic");
		menadzer.setImePrezime("Marko Markovic");
		magacioner.zaposliUSektor(sektor1);
		menadzer.zaposliUSektor(sektor2);
		
		System.out.println("Ime: " + magacioner.getImePrezime());
		System.out.println("Sektor: " + magacioner.getNizSektora().get(0).getNaziv());
		System.out.println("Plata aka pare: " + magacioner.plataRadnika() + "\n\n");
		System.out.println("Ime: " + menadzer.getImePrezime());
		System.out.println("Sektor: " + menadzer.getNizSektora().get(0).getNaziv());
		System.out.println("Plata aka pare: " + menadzer.plataRadnika());
	
	
	}
}
