

public class Summierer {
	public static void main(String[] args) {
		Summierer summierer = new Summierer();
		int startWert = Integer.parseInt(args[0]);
		System.out.println("Ergebnis mit for-Schleife: "
				+ summierer.forSumme(startWert));
		System.out.println("Ergebnis kleiner Gauss: "
				+ summierer.kleinerGauss(startWert));
		System.out.println("Ergebnis rekursiv: "
				+ summierer.rekursiveSumme(startWert));
	}
	
	int forSumme(int startWert){
		int ergebnis = 0; 
		for (i = 0; i < startWert; i++){
			ergebnis = ergebnis + i; 
		}
		return ergebnis; 
	}
	
	
	int rekursiveSumme(int startWert) { /* ... */ }
	
	
	int kleinerGauss(int startWert) { /* ... */ }
}