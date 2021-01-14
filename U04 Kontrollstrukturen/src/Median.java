
public class Median {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Median");
		System.out.println("======");
		
		//Eingabe der Werte
		int zahl1 = TestScanner.readInt("1. Zahl: ");
		int zahl2 = TestScanner.readInt("2. Zahl: ");
		int zahl3 = TestScanner.readInt("3. Zahl: ");
		
		//Variable wird deklariert und initialisiert
		int median = 0;
		
		//Ermittlung des Medians
		if (zahl1 <= zahl2 && zahl2 <= zahl3 || zahl2 >= zahl2 && zahl2 >= zahl3) {
			median = zahl2;
		}
		
		if (zahl2 <= zahl1 && zahl1 <= zahl3 || zahl2 >= zahl1 && zahl1 >= zahl3) {
			median = zahl1;
		}
		
		if (zahl1 <= zahl3 && zahl3 <= zahl2 || zahl1 >= zahl3 && zahl3 >= zahl2) {
			median = zahl3;
		}
		
		//Ausgabe des Medians
		System.out.println();
		System.out.println("Der Median lautet " + median);
	}

}
