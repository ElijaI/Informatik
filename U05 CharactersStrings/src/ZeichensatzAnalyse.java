
public class ZeichensatzAnalyse {

	public static void main(String[] args) {
		
		//Deklarieren und initialisieren der Variablen
		char zeichen = 'a';
		int anzahl = 0;
		
		//Ausgabe der Buchstaben
		System.out.println("isLetter");
		for (int i = 32; i <= 256; i = i + 1) {
			zeichen = (char)i;
			if (Character.isLetter(zeichen)) {
				System.out.print(zeichen + " ");
				anzahl = anzahl + 1;
			}
			//Neue Zeile alle 30 Zeichen
			if (anzahl == 30) {
				System.out.println();
				anzahl = 0;
			}
		}
		System.out.println();
		anzahl = 0;
		
		//Ausgabe der Zahlen
		System.out.println("isDigit");
		for (int i = 32; i <= 256; i = i + 1) {
			zeichen = (char)i;
			if (Character.isDigit(zeichen)) {
				System.out.print(zeichen + " ");
				anzahl = anzahl + 1;
			}
			//Neue Zeile alle 30 Zeichen
			if (anzahl == 30) {
				System.out.println();
				anzahl = 0;
			}
		}
		System.out.println();
		anzahl = 0;
		
		//Ausgabe der Wortzwischenräume 
		System.out.println("isWhitespace");
		for (int i = 32; i <= 256; i = i + 1) {
			zeichen = (char)i;
			if (Character.isWhitespace(zeichen)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		anzahl = 0;
		
		//Ausgabe der Kleinbuchstaben
		System.out.println("isLowerCase");
		for (int i = 32; i <= 256; i = i + 1) {
			zeichen = (char)i;
			if (Character.isLowerCase(zeichen)) {
				System.out.print(zeichen + " ");
				anzahl = anzahl + 1;
			}
			//Neue Zeile alle 30 Zeichen
			if (anzahl == 30) {
				System.out.println();
				anzahl = 0;
			}
		}
		System.out.println();
		anzahl = 0;
		
		//Ausgabe der Großbuchstaben
		System.out.println("isUpperCase");
		for (int i = 32; i <= 256; i = i + 1) {
			zeichen = (char)i;
			if (Character.isUpperCase(zeichen)) {
				System.out.print(zeichen + " ");
				anzahl = anzahl + 1;
			}
			//Neue Zeile alle 30 Zeichen
			if (anzahl == 30) {
				System.out.println();
				anzahl = 0;
			}
		}
		System.out.println();
		anzahl = 0;
		
	}

}
