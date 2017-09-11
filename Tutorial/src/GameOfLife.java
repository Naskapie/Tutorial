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
		boolean[][] newFeld = new boolean[feld.length][feld[0].length];
		for (int i = 0; i < feld.length; i++) { 
			for (int j = 0; j < feld[i].length; j++) {
				// Randfelder bleiben unveraendert
				if (i == 0 || j == 0 || i == feld.length - 1
						|| j == feld[0].length - 1) {
					newFeld[i][j] = feld[i][j];
				} else {
					// Berechnen der Anzahl der Nachbarn, die eigene Zelle mitgezaehlt
					int nachbarn = 0;
					for (int k = i - 1; k <= i + 1; k++) {
						for (int l = j - 1; l <= j + 1; l++) {
							if (feld[k][l] == true)
								nachbarn++;
						}
					}
					// Lebende Zellen mit 2 oder 3 Nachbarn (+ der eigenen
					// Zelle) leben weiter
					if (feld[i][j] == true && (nachbarn == 3 || nachbarn == 4)) {
						newFeld[i][j] = true;
					} else {
						// Tote Zellen mit exakt drei Nachbarn erwachen zum Leben
						if (feld[i][j] == false && nachbarn == 3) {
							newFeld[i][j] = true;
						} else {
							// Ansonsten: tot
							newFeld[i][j] = false;
						}
					}
				}
			}
		}
		feld = newFeld;
	}
}


/*

Aufgabe 4: Game of Life (20 Punkte)

Das Spiel Game of Life ist ein Ende der 60er Jahre vom Mathematiker John Horton Conway
erstmalig vorgeschlagener und detailliert untersuchter zellulärer Automat. Gegeben ist dabei ein
rechteckiges Feld mit n Zeilen und m Spalten, dessen Komponenten Zellen genannt werden. Jede
Zelle kann zwei Zustände annehmen: lebend oder tot. Die zu Beginn lebenden Zellen bilden die
Anfangsgeneration. Eine Folgegeneration entsteht nach folgenden Regeln:
 Eine lebende Zelle lebt auch in der Folgegeneration, wenn genau zwei oder drei der acht
benachbarten Zellen in der aktuellen Generation leben.
 Eine lebende Zelle stirbt in der Folgegeneration an Einsamkeit oder Überbevölkerung, wenn
in der aktuellen Generation weniger als zwei oder mehr als drei der acht Nachbarzellen
leben.
 Eine tote Zelle wird in der Folgegeneration lebendig, wenn genau drei ihrer acht Nachbarn
in der aktuellen Generation lebendig sind.
 Unabhängig von den obigen drei Regeln sind die Randzellen (also dienjenigen Zellen, die
nicht genau acht Nachbarn haben) immer tot.
Unten stehendes Programmfragment implementiert einen Teil der Funktionalität des Game of
Life. Die aktuellen Zustände der Zellen sind in der zweidimensionalen Array-Variable feld gespeichert,
der Wahrheitswert true steht dabei für eine lebende Zelle, der Wert false für eine
tote Zelle. Die Methode print() gibt die aktuelle Spielsituation auf der Konsole aus.
Ihre Aufgabe ist es, die Methode nextGeneration() derart zu implementieren, dass feld nach
Aufruf der Methode die Zellzustände der Folgegeneration entsprechend der obigen vier Regeln
beinhaltet.
Hinweise:
 Da Sie für die Berechnung aller Zellen der Folgegeneration noch Zugri auf die Zustände
der aktuellen Generation benötigen, sollten Sie die Zustände der Folgegeneration zunächst
in ein neues, zweidimensionales boolean-Array gleicher Gröÿe schreiben.
 Ihre Implementierung sollte nach Möglichkeit unabhängig von der Gröÿe der Zellkultur
funktionieren; Sie dürfen aber von einer rechteckigen Zellkultur ausgehen.
Prüfen Sie anschlieÿend durch Aufruf der main-Methode, wie sich die vorgegebene Kultur über
10 Generationen hinweg entwickelt.

   
 */

