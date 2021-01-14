public class Primfaktorenzerlegung {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Primfaktorenzerlegung");
		System.out.println("=====================");
		
		//Eingabe der Zahl
		int n = TestScanner.readInt("Geben Sie die Zahl ein: ");
		while (n < 1) {
			System.out.println("Zahl muss größer als 1 sein");
			n = TestScanner.readInt("Geben Sie die Zahl ein: ");
		}
		System.out.println();
		
		//Deklarieren und Initialisieren der Variablen
		int teiler = 2;
		int erg = n;
		
		//Ermittlen und Ausgabe der Primfaktoren
		System.out.println("Die Zerlegung lautet: ");
		while (n > 1) {
			if (n % teiler == 0) {
				n = n / teiler;
				System.out.print(teiler);
				if (n > 1) {
					System.out.print(" * ");
				}
			} else {
				teiler = teiler + 1;
			}
		}
		System.out.println(" = " + erg);
	}

}
