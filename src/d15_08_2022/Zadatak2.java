package d15_08_2022;

public class Zadatak2 {
//	Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost. 
//	Metoda od parametara prima ime i prezime (2 parametra) i vraca jedan 
//	string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//	Primer poziva: Ako se metoda pozvoe za ime=”Milan” i prezime=”Jovanovic”, 
//	metoda vraca “Milan Jovanovic”

	public static void main(String[] args) {
		imePrezime("Ilija", "Nestorovic");
		
	}
	
	public static String imePrezime (String ime, String prezime) {
		return ime + " " + prezime;
	}
}
