public class Mastermind {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Mastermind");
		System.out.println("==========");
		
		//Initialisieren und deklarieren der Variablen
		int farben = 6;
		int stellen = 4;
		int schwarz = 0;
		int i = 1;
		boolean ende = false;
		
		System.out.println("Anzahl Farben: ");
		System.out.print("=======================> ");
		String code = erzeugeCode(stellen, farben);
		String tipp = "";
		
		//Das Programm wird solange ausgeführt, bis ende true ist
		while (ende == false) {
			
			while (schwarz < 4) {
				tipp = eingabeTipp(stellen);
				tipp.toUpperCase();
				// sorgt für die korrekte Ausgabe und das schreiben der schwarz und weis Werte
				System.out.print(i + "): " + tipp + " = (w: " + ermittleWeiss(code, tipp) + ", s: "
						+ ermittleSchwarz(code, tipp) + "): ");
				schwarz = ermittleSchwarz(code, tipp);
				i++;
				// sorgt dafür dass es endet sobald ende geschrieben wird
				if (tipp.equals("ENDE")) {
					schwarz = 6;
					ende = true;
					System.out.println("Ende");
				}
			}
			// sorgt für korrekte Ausgabe wenn der Code gefunden wurde
			if (schwarz == 4) {
				System.out.println("Code gefunden");
				System.out.print("=======================> ");
			}
			schwarz = 0;
			i = 1;

		}

	}

	/**
	 * Die Methode gibt eine zufällige kombination aus Buchstaben zurück, wobei
	 * keine Farbe doppelt vorhanden sein darf. Wie viele verschiedene Farben und
	 * wie lange der Code sein soll wird der Methode übergeben. Ist die
	 * Stellenanzahl größer als die Farbanzahl oder die Farbanzahl größer als 26
	 * wird null zurückgegeben.
	 * 
	 * @param stellen
	 *            ist wie lang der Code sein soll
	 * @param anzahl
	 *            ist die Anzahl an Farben die möglich sind
	 * @return den Farbcode
	 */
	public static String erzeugeCode(int stellen, int farben) {
		String ret = null;
		if (stellen <= farben && farben < 27) {
			boolean nochmal = true;
			while (nochmal == true) {
				int doppelt = 0;
				nochmal = false;
				ret = "";
				for (int i = 0; i < stellen; i++) {
					double zahl = Math.random() * 1000 % farben;
					ret = ret + (char) (zahl + 65);
				}
				for (int i = 0; i < stellen; i++) {
					for (int j = 0; j < stellen; j++) {
						if (ret.charAt(i) == ret.charAt(j)) {
							doppelt++;
						}
					}
					if (doppelt > 1) {
						nochmal = true;
					}
					doppelt = 0;
				}
			}
		}
		return ret;
	}

	/**
	 * Die Methode kontrolliert bei einem übergebenen String ob Buchstaben doppelt
	 * vorhanden sind und gibt true zurück, wenn Buchstaben doppelt vorhanden sind
	 * und false, falls keine doppelten Buchstaben sind. Wenn der String null ist
	 * oder die Länge kleiner als 1 ist wird false zurückgegeben.
	 * 
	 * @param combi
	 *            welcher auf doppelte Buchstaben kontrolliert wird
	 * @return true oder false
	 */
	public static boolean enthaeltDoppelte(String combi) {
		boolean ret = false;
		if (combi != null && combi.length() > 0) {
			combi.toUpperCase();
			int oft = 0;
			for (int i = 0; i < combi.length(); i++) {
				oft = 0;
				for (int j = 0; j < combi.length(); j++) {
					if (combi.charAt(i) == combi.charAt(j)) {
						oft++;
					}
				}
				if (oft > 1) {
					ret = true;
				}
			}
		}
		return ret;
	}

	/**
	 * Der Benutzer gibt ein Buchstabenkombination ein. Falls die Kombination zu
	 * kurz oder zu lang ist oder doppelte Buchstaben enthält, wird der Benutzer
	 * aufgefordert erneut eine Kombination einzugeben. Wenn der Benutzer Ende
	 * eingibt, wird die Eingabe ausgegeben und die Eingabe wird abgebrochen. Die
	 * Eingabe wird in Großbuchstaben konvertiert.
	 * 
	 * @param laenge
	 *            die Laenge welche die Eingaben haben sollen
	 * @return Tipp des Benutzers
	 */
	public static String eingabeTipp(int laenge) {
		String ret = "";
		boolean richtig = false;
		ret = TestScannerErweitert.readString("Ihr Tipp:");
		ret = ret.toUpperCase();
		while (richtig == false) {
			if (ret.equals("ENDE")) {
				richtig = true;
			} else {
				if (ret.length() != laenge || enthaeltDoppelte(ret) == true) {
					ret = TestScannerErweitert.readString("Ihr Tipp:");
					ret = ret.toUpperCase();
				} else {
					richtig = true;
				}
			}
		}
		return ret;
	}

	/**
	 * Vergleicht den Tipp mit dem zu erratenen Code und gibt an wie viele
	 * Buchstaben an der selben Stelle sind. Haben die beiden übergebenen Strings
	 * nicht die geliche Länge wird -1 zurückgeliefert Wird "ABCD" und "BACF"
	 * übergeben, so liefert die Methode 1 zurück
	 * 
	 * @param code
	 *            ist der zu erratene Code
	 * @param tipp
	 *            ist der vom Benutzer abgegebene Tipp
	 * @return wie viele Buchstaben gleich an gleicher Stelle sind
	 */
	public static int ermittleSchwarz(String code, String tipp) {
		int ret = -1;
		if (code.length() == tipp.length()) {
			ret = 0;
			for (int i = 0; i < code.length(); i++) {
				if (code.charAt(i) == tipp.charAt(i)) {
					ret++;
				}
			}
		}
		return ret;
	}

	/**
	 * Vergleicht den Tipp mit dem zu erratenen Code und gibt an wie viele
	 * Buchstaben richtig sind, sich aber an der falschen Stelle befinden. Haben die
	 * beiden übergebenen Strings nicht die gleiche Länge wird -1 zurückgeliefert
	 * Wird "ABCD" und "BACF" übergeben, so liefert die Methode 2 zurück
	 * 
	 * @param code
	 *            ist der zu erratene Code
	 * @param tipp
	 *            ist der vom Benutzer abgegebene Tipp
	 * @return wie viele Buchstaben richtig aber an falscher Stelle sind
	 */
	public static int ermittleWeiss(String code, String tipp) {
		int ret = -1;
		if (code.length() == tipp.length()) {
			ret = 0;
			for (int i = 0; i < tipp.length(); i++) {
				for (int j = 0; j < code.length(); j++) {
					if (tipp.charAt(i) == code.charAt(j) && i != j) {
						ret++;
					}
				}
			}
		}
		return ret;
	}
}