public class MeinZahlensystemwandler {
	/**
	 * Wandelt das Zeichen nr in eine Zahl um, wobei die Groß-/Klein-schreibung
	 * ignoriert wird: '0' ergibt 0, '1' ergibt 1, ... '9' ergbit 9, 'A' ergibt 10,
	 * 'B' ergibt 11, ..., 'Z' ergibt 35 Sollte ein ungültiges Zeichen übergeben
	 * werden, so gibt die Methode -1 zurück
	 * 
	 * @param nr
	 *            das umzuwandelnde Zeichen
	 * @return die Zahl für die das Zeichen steht
	 */
	public static int getDigit(char nr) {
		int ret = -1;
		if (Character.isDigit(nr) || Character.isLetter(nr)) {
			nr = Character.toLowerCase(nr);
			if (Character.isDigit(nr) && nr - 48 <= 10) {
				ret = nr - 48;
			}
			if (Character.isLetter(nr)) {
				ret = nr - 87;
			}
		}
		return ret;
	}

	/**
	 * Wandelt die Nummer der Ziffer nr in ein Zeichen um: 0 ergibt '0', 1 ergibt
	 * '1', ..., 9 ergibt '9', 10 ergibt 'A', 11 ergibt 'B', ..., 35 ergibt 'Z'
	 * Sollte eine ungültige Nummer übergeben werden, so gibt die Methode einen
	 * Stern '*' zurück
	 * 
	 * @param nr
	 *            die Nummer welche in ein Zeichen umgewandelt werden soll
	 * @return das Zeichen das für die Nummer steht
	 */
	public static char getDigit(int nr) {
		char ret = 0;
		if (nr >= 0 && nr <= 35) {
			if (nr < 10) {
				ret = (char) (nr + 48);
			} else {
				ret = (char) (nr + 55);
			}
		} else {
			ret = '*';
		}
		return ret;
	}

	/**
	 * Wandelt die Zahl num mit der Basis basis in eine Dezimalzahl um und liefert
	 * diese zurück. Falls die übergebene Zahl num gleich null oder deren Länge
	 * gleich 0 ist oder die Basis kleiner als 2 ist, wird -1 zurück geliefert. Wenn
	 * eine Ziffer der übergebenen Zahl nicht zur Basis pass, wird ebenfalls -1
	 * zurück geliefert Beispiel: numToDec("01110110", 2) ergibt 118
	 * numToDec("170712", 8) ergibt 61898 numToDec("170712", 7) ergibt -1
	 * 
	 * @param num
	 *            die umzuwandelnde Zahl als String übergeben
	 * @param basis
	 *            die Basis der umzuwandelnden Zahl
	 * @return das Ergebnis im Dezimalsystem
	 */
	public static int numToDec(String num, int basis) {
		int ret = -1;
		boolean fehler = false;
		// Überprüfen ob die Ziffer nicht zur Basis passt
		for (int i = 0; i < num.length(); i++) {
			if (getDigit(num.charAt(i)) >= basis) {
				fehler = true;
			}
		}
		if (num != null && num.length() > 0 && basis >= 2 && !fehler) {
			ret = 0;
			int j = 0;
			for (int i = num.length() - 1; i >= 0; i--) {
				ret = ret + (getDigit(num.charAt(i)) * (int) Math.pow(basis, j));
				j++;
			}
		}
		return ret;
	}

	/**
	 * Wandelt die Dezimalzahl dec in eine Zahl mit der Basis basis um und gibt
	 * diese zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein und
	 * die Basis muss größer als 1 sein, ansonsten wird null zurück geliefert.
	 * Beispiel: decToNum(118,2) ergibt 1110110 decToNum(61898,8) ergibt 170712
	 * 
	 * @param dec
	 *            die umzuwandelnde Dezimalzahl
	 * @param basis
	 *            nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 */
	public static String decToNum(int dec, int basis) {
		String ret = null;
		int rest = 0;
		int erg = 0;
		int laenge = 1;
		if (dec >= 0 && basis > 1) {
			while (dec > 0) {
				rest = dec % basis;
				dec = dec / basis;
				erg = (int) (erg + rest * laenge);
				laenge = laenge * 10;
			}
			ret = "";
			ret = ret + erg;
		}
		return ret;
	}

	/**
	 * Wandelt die Hexadezimalzahl hex in eine Dezimalzahl um und gibt diese zurück.
	 * Falls die übergebene Zahl hex gleich null oder deren Länge gleich 0 ist oder
	 * keine Zahl oder Buchstabe, wird -1 zurück geliefert.
	 * 
	 * @param hex
	 * 			die umzuwandelnde Hexadezimalzahl
	 * @return 
	 * 			die umgewandelte Zahl
	 */
	public static int hexToDec(String hex) {
		int ret = -1;
		int pot = 0;
		char ziffer = 0;
		boolean fehler = false;
		
		for (int i = 0; i < hex.length(); i++) {
			ziffer = hex.charAt(i);
			if (!(Character.isLetter(ziffer) || Character.isDigit(ziffer)) || getDigit(ziffer) > 15) {
				fehler = true;
			}
		}

		if (hex != null && !hex.isEmpty() && !fehler) {
			ret = 0;
			for (int i = hex.length() - 1; i >= 0; i--) {
				ret = ret + getDigit(hex.charAt(i)) * (int) Math.pow(16, pot);
				pot++;
			}
		}

		return ret;
	}
	
	/**
	 * Wandelt die Dezimalzahl dec in eine Hexadezimalzahl um und gibt diese zurück. Falls die übergebene Zahl kleine als 0 ist wird -1 zur
	 * 
	 * @param dec
	 * 			die umzuwandelnde Dezimalzahl
	 * @return
	 * 			die umgewandelte Zahl
	 */
	public static String decToHex(int dec) {
		String ret = null;
		int basis = 16;
		int rest = 0;
		if (dec >= 0) {
			ret = "";
			while (dec > 0) {
				rest = dec % basis;
				dec = dec / basis;
				ret = ret + getDigit(rest);
				}
			ret = MeinStringAnalysierer.umdrehenString(ret);
		}
		return ret;
	}
	
	/**
	 * Wandelt die Dualzahl dec in eine Dezimalzahl um und gibt diese zurück.
	 * Falls die übergebene Zahl dual gleich null oder deren Länge
	 * gleich 0 ist, wird -1 zurück geliefert. Wenn
	 * eine Ziffer der übergebenen Zahl größer als 1 ist, wird ebenfalls -1
	 * zurück geliefert.
	 * 
	 * @param dual
	 * 			die umzuwandelnde Dualzahl
	 * 
	 * @return 
	 * 			die umgewandelte Zahl
	 */
	public static int dualToDec(String dual) {
		int ret = 0;
		ret = numToDec(dual, 2);
		return ret;
	}
	
	/**
	 * Wandelt die Dezimalzahl dec in eine Dualzahl um und gibt
	 * diese zurück. Dabei muss die Dezimalzahl dec größer oder gleich 0 sein, ansonsten wird null zurück geliefert.
	 * 
	 * @param dec
	 *            die umzuwandelnde Dezimalzahl
	 * @param basis
	 *            nach welcher umgewandelt wird
	 * @return die umgewandelte Zahl
	 * 
	 */
	public static String decToDual(int dec) {
		String ret = null;
		ret = decToNum(dec, 2);
		return ret;
	}
	
	/**
	 * Die eingegebene Zahl num im Zahlensystem basis wird ins Zahlensystem basiserg umgewandelt.
	 * Wenn die eingegebene Zahl <= 0 ist wird null ausgegeben, das selbe passiert wenn null im
	 * String steht.
	 * Beispiel:numToNum("8899", 9, 3) ergibt 22222222
	 * numToNum("118", 10, 2) ergibt 1110110
	 * numToNum("17773", 12, 8) ergibt 102207
	 * @param num die Zahl die umgewandelt wird
	 * @param basis das Zahlensystem der Zahl
	 * @param ziel das Zahlensystem in welche es umgewandelt werden soll
	 * @return die umgewandelte Zahl
	 */
	public static String numToNum(int basis, String num,  int basiserg) {
		String ret = null;
		int dec = numToDec(num, basis);
		if (basiserg < 16) {
			ret = decToNum(dec, basiserg);
		} else {
			ret = decToHex(dec);
		}
		return ret;
	}
	
}