public class GameOfLife {
	boolean[][] feld = { { false, false, false, false, false },
			{ false, false, true, false, false },
			{ false, false, true, false, false },
			{ false, false, true, false, false },
			{ false, false, false, false, false } };
	public static void main(String[] args) {
		GameOfLife myGame = new GameOfLife();
		for (int i = 0; i < 10; i++) {
			myGame.nextGeneration();
			myGame.print();
			System.out.println();
		}
	}
	void print() {
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				if (feld[i][j] == true)
					System.out.print("o ");
				else
					System.out.print(". ");
			}
			System.out.println();
		}
	}
	void nextGeneration() {
		/* ... */ 
	}
}