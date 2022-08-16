package d15_08_2022;

//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
//Metoda nista ne vraca.

public class Zadatak4 {

	
	public static void main(String[] args) {

		podaciKorisnik("150123512344", "Ilija", "Nestorovic", 1998, true);
		podaciKorisnik("123543412364", "Marko", "Markovic", 1908, false);

	}
	
	public static void podaciKorisnik(String jmbg, String ime, String prezime, int godinaRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + jmbg);
		System.out.println("Ime: " + ime);
		System.out.println("Prezime: " + prezime);
		System.out.println("God. rodjenja: " + godinaRodjenja);
		System.out.println("Aktivan: " + aktivan);
		System.out.println();
	}

}
