
public class UmrechnungVonZehn {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Umrechnung vom Zehnersystem");
		System.out.println("===========================");
		
		//Eingabe der Zahl
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		
		//Eingabe der Basis und überprüfung ob sie zwischen 2 und 9 ist
		int basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		while (basis < 2 || 9 < basis) {
			System.out.println("Basis muss zwischen 2 und 9 liegen");
			basis = TestScanner.readInt("Geben Sie die Basis ein: ");
		}
		
		//Deklarieren und initialisieren der Variablen
		int rest = 0;
		int erg = 0;
		int laenge = 1;
		
		
		//Ermittlung des Ergebnis
		while (zahl > 0) {
			rest = zahl % basis;
			zahl = zahl / basis;
			erg = (int)(erg + rest * laenge);
			laenge = laenge * 10;
		}
		
		//Ausgabe von dem Ergebnis
		System.out.println();
		System.out.println("Die Zahl im " + basis + "-ersystem lautet " + erg);
		
	}
}