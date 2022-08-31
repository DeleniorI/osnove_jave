package miniProjekat30_08_2022;

import java.util.ArrayList;

public class XandOGame {
	private ArrayList<String> table = new ArrayList<>();

	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}

	}

	public XandOGame(Player playerX, Player playerO) {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}

		this.playerX = playerX;
		this.playerO = playerO;

	}

	public ArrayList<String> getTable() {
		return table;
	}

	public void setTable(ArrayList<String> table) {
		this.table = table;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void print() {

		for (int i = 0; i < this.table.size(); i++) {

			System.out.print(this.table.get(i) + " | ");
			if (i == 2) {
				System.out.println();
			}
			if (i == 5) {
				System.out.println();
			}

		}
		System.out.println();

	}

	public void startGame() {
		for (int i = 0; i < this.table.size(); i++) {
			this.table.set(i, " ");
		}
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {

		for (int i = 0; i < this.table.size(); i++) {
			if (this.table.get(i).equals(" ")) {
				return false;
			}
		}
		return true;

	}

	public boolean isFieldFree(int pozicija) {
		for (int i = 0; i < this.table.size(); i++) {
			if (pozicija == i && (this.table.get(i).equals("x") || this.table.get(i).equals("o"))) {
				return false;
			}
		}
		return true;
	}

	public void playNext() {

		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}

	}

	public void makeAMove(int pozicija) {
		for (int i = 0; i < this.table.size(); i++) {

			this.table.set(pozicija, this.nextPlayer); // nextPlayer koristim za ubacivanje X ili O u niz

		}
	}

	public boolean isWinnerX(Player playerX) {
		// Provera horizontalne kombinacije
		for (int i = 0; i < 3; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i * 3 + j).equals("x");
			}
			if (tacno) {
				return true;
			}
		}
		// (0) (1) (2) j
		// (0) 0 3 6
		// (1) 1 4 7
		// (2) 2 5 8
		// i
		// Provera vertikalne kombinacije
		for (int i = 0; i < 3; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i + 3 * j).equals("x");
			}
			if (tacno) {
				return true;
			}
		}

		// (0) (1) (2) j
		// (0) 0 4 8
		// (1) 2 4 6

		// Provera dijagonale s leva na desno
		for (int i = 0; i < 1; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i + 4 * j).equals("x");
			}
			if (tacno) {
				return true;
			}
		}
		// (0) (1) (2) j
		// (0) 2 4 6
		// 2 + i * j + 2
		// Provera dijagonale s desna na levo
		for (int i = 0; i < 1; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get((2 + i) * j + 2).equals("x");
			}
			if (tacno) {
				return true;
			}
		}
		return false;

	}

	public boolean isWinnerO(Player playerO) {
		// Provera horizontalne kombinacije
		for (int i = 0; i < 3; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i * 3 + j).equals("o");
			}
			if (tacno) {
				return true;
			}
		}
		// (0) (1) (2) j
		// (0) 0 3 6
		// (1) 1 4 7
		// (2) 2 5 8
		// i
		// Provera vertikalne kombinacije
		for (int i = 0; i < 3; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i + 3 * j).equals("o");
			}
			if (tacno) {
				return true;
			}
		}

		// (0) (1) (2) j
		// (0) 0 4 8
		// (1) 2 4 6

		// Provera dijagonale s leva na desno
		for (int i = 0; i < 1; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get(i + 4 * j).equals("o");
			}
			if (tacno) {
				return true;
			}
		}
		// (0) (1) (2) j
		// (0) 2 4 6
		// 2 + i * j + 2
		// Provera dijagonale s desna na levo
		for (int i = 0; i < 1; i++) {
			boolean tacno = true;
			for (int j = 0; j < 3; j++) {
				tacno = tacno && this.table.get((2 + i) * j + 2).equals("o");
			}
			if (tacno) {
				return true;
			}
		}
		return false;

	}

	public boolean isValidMove(int pozicija) {
		if (pozicija >= 0 && pozicija <= 8) {

			return true;

		} else {
			return false;
		}
	}

	public int gameScore() {
		if (isWinnerX(playerX)) {
			return 1;
		} else if (isWinnerO(playerO)) {
			return 2;
		} else {
			return 0;
		}
	}
}
