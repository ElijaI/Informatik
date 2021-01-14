
public class UmrechnungNachZehn {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Umrechnung ins Zehnersystem");
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
		int i = 1;
		int ziffer = 0;
		int laenge = 0;
		int erg = 0;
		
		//Ermittlung der Länge der Zahl
		while (zahl / i > 1) {
			i = i * 10;
			laenge++;
		}
		
		//Errechnung von dem Ergebnis
		while (zahl >= 1) {
			ziffer = zahl / i;
			zahl = zahl % i;
			i = i / 10;
			
			erg = erg + ziffer * (int)Math.pow(basis, laenge);
			laenge--;
		}
		
		//Ausgabe von dem Ergebnis
		System.out.println();
		System.out.println("Die Zahl im Zehnersystem lautet " + erg);
		
	}

}
