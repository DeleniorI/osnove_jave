package miniProjekat30_08_2022;

import java.util.Scanner;

public class XandOGameMain {

	public static void main(String[] args) {

		Player p1 = new Player("Ilija Nestorovic");
		Player p2 = new Player("Nikola Nikolic");

		XandOGame xo = new XandOGame(p1, p2);
		Scanner s = new Scanner(System.in);

		xo.startGame();

		while (!xo.isGameOver() && !xo.isWinnerX(p1) && !xo.isWinnerO(p2)) {

			System.out.print("Unesite poziciju: ");
			int pozicija = s.nextInt();
			if (xo.isValidMove(pozicija) && xo.isFieldFree(pozicija)) {
				xo.makeAMove(pozicija);
				if (xo.isWinnerX(p1)) {
					System.out.println("Pobednik je igrac: " + p1.getImePrezime() + " sa brojem: " + xo.gameScore());
					xo.isWinnerX(p1);

				} else if (xo.isWinnerO(p2)) {
					System.out.println("Pobednik je igrac: " + p2.getImePrezime() + " sa brojem: " + xo.gameScore());
					xo.isWinnerO(p2);

				} else if (xo.isGameOver()) {
					System.out.println("Igra je zavrsena nereseno " + xo.gameScore());
					xo.isGameOver();

				}
				
				xo.playNext();
				xo.print();
				
			} else {
				
				System.out.println("Niste uneli validnu poziciju. ");
			}
		}

	}

}
