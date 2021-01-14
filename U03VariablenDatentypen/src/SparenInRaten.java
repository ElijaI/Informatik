public class SparenInRaten {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Sparen in Raten");
		System.out.println("===============");
		
		//Deklarieren und initialisieren durch die TestScanner Methode
		int guthabenJahresanfang = TestScanner.readInt("Geben Sie das Guthaben am Jahresanfang ein: ");
		int monatsrate = TestScanner.readInt("Geben Sie die Monatsrate ein: ");
		double jahreszinssatz = TestScanner.readDouble("Geben Sie den Jahreszinssatz ein: ");
		
		//Variabel des Zinssatzes
		int i = 12;
		double gesamtzinsen = 0.;
		while (i >= 1) {
			gesamtzinsen = gesamtzinsen + jahreszinssatz * i/12;
			i = i - 1;
		}
		
		//Halbierung von gesamtzinsen
		gesamtzinsen = gesamtzinsen / 2;
		
		//Variable zur berechnung des Guthabens am Jahresende
		double guthabenJahresende = guthabenJahresanfang + (guthabenJahresanfang * jahreszinssatz) / 100 + 12 * monatsrate + gesamtzinsen;
		
		//Ausgabe des Ergebnis
		System.out.println("Das Guthaben am Ende des Jahres beträgt " + Math.floor(guthabenJahresende * 100) / 100.0);
		
	}
	
}