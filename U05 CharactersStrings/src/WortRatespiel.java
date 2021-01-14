public class WortRatespiel {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Wortratespiel");
		System.out.println("=============");
		
		//Deklarieren und initialisieren der Variablen
		String tipp = "";
		String tippbuchstabe = "";
		String ausgabe = "";
		boolean punkt = true;
		int schritte = 0;
		char abbrechen = 0;
		
		do {
			//Eingabe des gesuchten Worts
			String geswort = TestScannerErweitert.readString("Gesuchtes Wort: ");
			geswort = geswort.toUpperCase();
			
			//Ausgabe der ersten Punkte anhand der länge des gesuchten Wortes
			System.out.print("Ihr Wort: ");
			for (int i = 0; i < geswort.length(); i++) {
				System.out.print(".");
			}
			System.out.println();
		
			do {
				//Eingabe der Tippbuchstaben oder Wort
				tipp = "";
				tipp = tipp + TestScannerErweitert.readString("Buchstabe/Wort: ");
				tipp = tipp.toUpperCase();
			
				//Überprüfung ob das Wort erraten wurde
				if (!tipp.equals(geswort)) {
					System.out.print("Ihr Wort: ");	
			
					//Wenn es nur ein Buchstabe ist soll dieser in tippbuchstabe initialisiert werden
					if (tipp.length() <= 1) {
						tippbuchstabe = tippbuchstabe + tipp;
					}
			
					//Ermitteln ob der Eingegebene Buchstabe in dem gesuchten Wort ist
					for (int i = 0; i < geswort.length(); i++) {
						for (int j = 0; j < tippbuchstabe.length(); j++) {
							if (tippbuchstabe.charAt(j) == geswort.charAt(i)) {
								ausgabe = ausgabe + geswort.charAt(i);
								punkt = false;
							}	
						}
					
						//Wenn kein Buchstabe gefunden wurde soll ein Punkt ausgegeben werden
						if (punkt) {
							ausgabe = ausgabe + ".";
						}
						punkt = true;
					
						//Ausgabe des Tipps wenn das Wort noch nicht gefunden wurde
						System.out.print(ausgabe);
						ausgabe = "";
					}
					
					//Neue Zeile
					System.out.println();
				}
				
				//Erhöhen der schritte
				schritte++;
				
				//Ausgabe wie viele Schritte gebraucht wurden
				if (tipp.equals(geswort)) {
					System.out.println("Sie haben in " + schritte + " Schritte das Wort erraten!");
				}
				
			} while (!tipp.equals(geswort));
			
			//Abfrage zum widerholen
			do {
				abbrechen = TestScannerErweitert.readChar("Nochmal (j/n)? ");
				if (abbrechen != 'j' && abbrechen != 'n') {
					System.out.println("Geben sie entweder j oder n ein");
				}
			}while (abbrechen != 'j' && abbrechen != 'n');
				
			
		}while(abbrechen == 'j');
	}
}