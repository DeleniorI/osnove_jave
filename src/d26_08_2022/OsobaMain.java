package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class OsobaMain {

	public static void main(String[] args) {
		ArrayList<Igrac> nizIgraca = new ArrayList<>();
		ArrayList<Trener> nizTrenera = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		System.out.println("Unesite velicinu niza: ");
		int n = s.nextInt();
//		Igrac i = new Igrac(imePrezime, jmbg, godinaRodjenja, broj, pozicija, kapiten)
		
		for(int i = 0; i < n; i++ ) {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = s.next();
			System.out.print("Unesite jmbg: ");
			String jmbg = s.next();
			System.out.println();
			System.out.print("Unesite godinu rodjenja: ");
			int godinaRodjenja = s.nextInt();
			System.out.print("Unesite broj koji igrac nosi: ");
			int broj = s.nextInt();
			System.out.print("Unesite poziciju koju igra: ");
			String pozicija = s.next();
			System.out.print("Da li je igrac kapiten? (true/false): ");
			boolean kapiten = s.nextBoolean();
			nizIgraca.add(new Igrac(imePrezime, jmbg, godinaRodjenja, broj, pozicija, kapiten));
		
		
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime i prezime: ");
			String imePrezime = s.next();
			System.out.print("Unesite jmbg: ");
			System.out.println();
			String jmbg = s.next();
			
			System.out.print("Unesite godinu rodjenja: ");
			int godinaRodjenja = s.nextInt();
			System.out.print("Unesite godine iskustva: ");
			int godineIskustva = s.nextInt();
			System.out.print("Unesite tip trenera: ");
			String tipTrenera = s.next();
			nizTrenera.add(new Trener(imePrezime, jmbg, godinaRodjenja, godineIskustva, tipTrenera));
			
		}
		
		
		for (int i = 0; i < nizIgraca.size(); i++) {
			nizIgraca.get(i).print();
		}
		
		for (int i = 0; i < nizTrenera.size(); i++) {
			nizTrenera.get(i).print();
		}
		
		
		
		
	}

}
