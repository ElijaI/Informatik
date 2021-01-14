public class TextStatistik {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Textstatistik");
		System.out.println("=============");
		
		//Einlesen vom dem Text um überprüfen ob er mindestens ein Zeichen enthällt
		String text = TestScannerErweitert.readString("Text: ");
		text = text.trim();
		text = text.toLowerCase();
		while (text.length() < 1) {
			System.out.println("Text muss mindestens ein Zeichen enthalten");
			text = TestScannerErweitert.readString("Text: ");
		}
		
		//Deklarieren und initialisieren der Variablen
		int selbstlaute = 0;
		int buchstaben = 0;
		int leerzeichen = 0;
		int zeichen = text.length();
		char c = 'a';
		
		//Ermitteln der Selbstlaute
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				c = text.charAt(i);
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					selbstlaute++;
				}
			}
		}
		
		//Ermitteln der Buchstaben
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLetter(text.charAt(i))) {
				buchstaben++;
			}
		}
		
		//Ermitteln der Leerzeichen
		for (int i = 0; i < text.length(); i++) {
			if (Character.isWhitespace(text.charAt(i))) {
				leerzeichen++;
			}
		}
		
		//Ausgabe der Zahlen
		System.out.println();
		System.out.println("Anzahl Selbstlaute:" + selbstlaute);
		System.out.println("Anzahl Buchstaben: " + buchstaben);
		System.out.println("Anzahl Leerzeichen: " + leerzeichen);
		System.out.println("Anzahl Zeichen: " + zeichen);
		
	}

}