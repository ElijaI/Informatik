
public class Quersumme {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Quersumme");
		System.out.println("=========");
		
		//Einlesen der Zahl
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
		
		//Variablen werden deklariert und initialisiert
		int i = 1;
		int zahl1 = 0;
		
		//Der Teiler für die eingegebene Zahl wird bestimmt
		while (zahl / i > 1) {
			i = i * 10;
		}
		
		System.out.println();
		System.out.println("Die Quersumme lautet: ");
		
		int qusumme = 0;
		
		//Dei einzelnen Zahlen werden Ausgegeben
		while (zahl >= 1) {
			zahl1 = zahl / i;
			qusumme = qusumme + zahl1;
			System.out.print(zahl1);
			zahl = zahl % i;
			i = i / 10;
			if (zahl > 1) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + qusumme);
		
	}
	
}

