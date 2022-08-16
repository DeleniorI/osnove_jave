package d15_08_2022;



//	(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
//
//	Primer izvrsenja: 
//	izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
//	izbroji(-5, 1) ima za rezultlat 5 . Kako? -5 -4 -3 -2 -1 0 1

	//  Napomena: Resiti bez koriscenja petlji. 




public class Zadatak6 {

	public static void main(String[] args) {
		
		brojCelihBrojeva(-11, -1);

	}
	
	public static void brojCelihBrojeva(int a, int b) {
		int brojac = b - a - 1;
		
		System.out.println("Rezultat je: " + brojac);
	}

}
