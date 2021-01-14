public class VerschluesselungCaesar {

	public static void main(String[] args) {
		
		//Ausgabe der �berschrift
		System.out.println("Verschl�sselung nach C�sar");
		System.out.println("==========================");
		
		//Deklarieren und initialisieren der Variablen
		boolean abbrechen = false;
		
		do {
			//Entscheiden der Aufgabe
			char aufgabe= TestScannerErweitert.readChar("V>erschl�sseln, E>ntschl�sseln, A>bbruch: ");
			aufgabe = Character.toLowerCase(aufgabe);
			switch (aufgabe) {
		
				//Verschl�sseln
				case 'v': {
					
					//Einlesen des Textes
					String text = TestScannerErweitert.readString("Text: ");
					int verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
					System.out.print("Verschl�sselt: ");
					
					//Deklarieren und initialisieren der Variablen
					char buchstabe = 'a';
					int ueberlauf = 0;
				
					//Initialisieren jedes einzelnen Buchstaben
					for (int i = 0; i < text.length(); i++) {
						buchstabe = text.charAt(i);
					
						//Verschiebung des Buchstaben
						if (Character.isWhitespace(buchstabe)) {
						} else {
							buchstabe = (char)(buchstabe + verschiebung);
							if (buchstabe > 122) {
								ueberlauf = Math.abs(122 - buchstabe);
								buchstabe = 96;
								buchstabe = (char)(buchstabe + ueberlauf);
							}
							buchstabe = Character.toUpperCase(buchstabe);
							System.out.print(buchstabe);
						}
					}
					System.out.println();
					break;
				}
			
				//Entschl�sseln
				case 'e': {
					
					//Einlesen des Textes
					String text = TestScannerErweitert.readString("Text: ");
					int verschiebung = TestScannerErweitert.readInt("Verschiebung: ");
					System.out.print("Entschl�sselt: ");
				
					//Deklarieren und initialisieren der Variablen
					char buchstabe = 'a';
					int ueberlauf = 0;
				
					//Initialisieren jedes einzelnen Buchstaben
					for (int i = 0; i < text.length(); i++) {
						buchstabe = Character.toLowerCase(text.charAt(i));
					
						//Verschiebung des Buchstaben
						if (Character.isWhitespace(buchstabe)) {
						
						} else {
							buchstabe = (char)(buchstabe - verschiebung);
							if (buchstabe < 97) {
								ueberlauf = Math.abs(buchstabe - 97);
								buchstabe = 123;
								buchstabe = (char)(buchstabe - ueberlauf);
							}
							buchstabe = Character.toUpperCase(buchstabe);
							System.out.print(buchstabe);
						}
					}
					System.out.println();
					break;
				}
			
				//Abbrechen
				case 'a': {
					abbrechen = true;
					break;
				}
			
				//Falsche Eingabe
				default: {
					System.out.println("Geben Sie entweder v, e oder a ein");
				}
			}
		//Solange wiederholen bis das Programm abbrechen soll
		} while (abbrechen == false);
		
	}
	
}