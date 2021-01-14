
public class GgTEuklid {

	public static void main(String[] args) {
		
		//Ausgabe der �berschrift
		System.out.println("GgT von Euklid");
		System.out.println("==============");
		
		//Einlesen der beiden Zahlen
		int zahl1 = TestScanner.readInt("Erste Zahl: ");
		int zahl2 = TestScanner.readInt("Zweite Zahl: ");
		
		//Deklarieren und initialisieren der Variablen
		int grosezahl = 0;
		int kleinezahl = 0;
		int ggT = 0;
		int rest = 1;
		int rest2 = 0;
		
		//Ermittlen der gr��eren Zahl
		if (zahl1 >= zahl2) {
			grosezahl = zahl1;
			kleinezahl = zahl2;
		}
		
		//Ermittlung von dem ggT
		if (grosezahl % kleinezahl == 0) {
			ggT = kleinezahl;
		} else {
			rest = grosezahl % kleinezahl;
			ggT = kleinezahl;
			while (rest != 0) {
				rest2 = rest;
				rest = ggT % rest;
				ggT = rest2;
			}
		}
		
		//Ausgabe von dem Ergebnis
		System.out.println();
		System.out.println("Der gr��te gemeinsame Teiler lautet " +ggT);
		
	}

}