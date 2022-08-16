package d15_08_2022;


//     Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//     Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//     / / / / /
//
//     Napomena: Metoda nista ne vraca.

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Unesite N: ");
		int brojKaraktera = s.nextInt();

		System.out.print("Unesite karakter: ");
		char karakter = s.next().charAt(0);

		printChar(brojKaraktera, karakter);
		s.close();
	}

	public static void printChar(int n, char c) {
		for (int i = 0; i < n; i++) {
			System.out.print(c + " ");

		}
	}
	

}
