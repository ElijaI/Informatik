
public class QuersummenQuersumme {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Quersummenquersumme");
		System.out.println("===================");
				
		//Einlesen der Zahl
		int zahl = TestScanner.readInt("Geben Sie die Zahl ein: ");
				
		//Variablen werden deklariert und initialisiert
		int i = 1;
		int zahl1 = 0;
				
		//Der Teiler für dei eingegebene Zahl wird bestimmt
		while (zahl / i > 1) {
			i = i * 10;
		}
				
		System.out.println();
		System.out.println("Die Quersummenquersumme lautet: ");
				
		int qusumme = 0;
				
		//Die einzelnen Zahlen werden Ausgegeben
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
		
		//Ausgabe des Ergebnis
		System.out.print(" = " + qusumme);
		System.out.print(" = ");
		
		//Variablen werden neu initialisiert
		i = 1;
		zahl1 = 0;
		
		//Der Teilder für dei Quersumme wird bestimmt
		while (qusumme / i > 1) {
			i = i * 10;
		}
		
		//Die einzelnen Zahlen werden Ausgegeben
		int ququsumme = 0;
		while (qusumme >= 1) {
			zahl1 = qusumme / i;
			ququsumme = ququsumme + zahl1;
			System.out.print(zahl1);
			qusumme = qusumme % i;
			i = i / 10;
			if (qusumme > 1) {
				System.out.print(" + ");
			}
		}
		
		//Die Quersumme der Quersumme wird ausgegeben
		System.out.print(" = " + ququsumme);
		
	}

}
