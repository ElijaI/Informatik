
public class ISOLatin1Zeichensatz {

	public static void main(String[] args) {
		
		//Deklarieren und initialisieren der Variablen
		char zeichen = 'a';
		
		//Schleife zur Ausgabe der Zeichen
		for (int i = 33; i <= 256; i = i + 1) {
			zeichen = (char)i;
			printZahl(i);
			System.out.print(" " + zeichen);
			if (i % 8 == 0) {
				System.out.println();
			}
		}
		
	}
	
	//Klasse zur ausgabe der Zahlen mit einrückung
	public static void printZahl(int zahl) {
		if (zahl < 100) {
			System.out.print("  " + zahl);
		} else if (zahl < 260) {
			System.out.print(" " + zahl);
		} 
	}

}
