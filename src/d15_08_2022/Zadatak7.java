package d15_08_2022;


// 	(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
// 	U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.


public class Zadatak7 {

	public static void main(String[] args) {
		
		int rezultat = najmanjaVrednost(102, 11, 1);
		System.out.println("Najmanji broj je: " + rezultat);
	}
	
	public static int najmanjaVrednost(int a, int b, int c) {
		
		if (a < b && a < c) {
			return a;
		} else if (b < c) {
			return b;
		} else {
			return c;
		}
		
	}

}
