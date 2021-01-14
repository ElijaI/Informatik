public class TestArray {

	public static void main(String[] args) {

		// Testen der printIntArray Methode
		System.out.println("Testen der printIntArray Methode");
		int[] a = { 1, 12, 5, 3, 6 };
		printIntArray("a = ", a);
		System.out.println();

		// Testen der randomIntArray Methode
		System.out.println("Testen der randomIntArray Methode");
		a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		printIntArray("", randomIntArray(50, -1, 1));
		System.out.println();

		// Testen der getMinimum, getMaximum und getMittelwert Methode
		System.out.println("Testen der getMinimum, getMaximum und getMittelwert Methode");
		a = randomIntArray(5, -5, 20);
		printIntArray("a = ", a);
		System.out.println("Kleinste Zahl: " + getMinimum(a));
		System.out.println("Größte Zahl: " + getMaximum(a));
		System.out.println("Mittelwert: " + getMittelwert(a));
		System.out.println();

		// Testn der indexOf Methode
		System.out.println("Testen der indexOf Methode");
		a = randomIntArray(10, 0, 15);
		printIntArray("a = ", a);
		System.out.println("7 ist an dem Index " + indexOf(a, 7));
		System.out.println("16 ist an dem Index " + indexOf(a, 16));
		System.out.println("8 ab der Position 5 ist an dem Index " + indexOf(a, 8, 5));
		System.out.println();

		// Testen der getMinPos Methode
		System.out.println("Testen der getMinPos Methode");
		a = randomIntArray(5, 1, 10);
		printIntArray("a = ", a);
		System.out.println("Die die Position der kleinste Zahl ab der Position 2 ist " + getMinPos(a, 2));
		System.out.println();

		// Testen der addZahl Methode
		System.out.println("Testen der addZahl Methode");
		a = randomIntArray(10, 0, 9);
		printIntArray("a = ", a);
		addZahl(a, 100);
		printIntArray("a + 100 = ", a);
		System.out.println();

		// Testen der swap Methode
		System.out.println("Testen der swap Methode");
		a = randomIntArray(3, 1, 10);
		printIntArray("a = ", a);
		swap(a, 0, 2);
		printIntArray("aswap = ", a);
		System.out.println();

		// Testen der sortMinArray Methode
		System.out.println("Testen der sortMinArray Methode");
		a = randomIntArray(50, 1, 100000);
		printIntArray("a = ", a);
		sortMinArray(a);
		printIntArray("asortiert = ", a);
		System.out.println();

		// Testen der delDoppelte Methode
		System.out.println("Testen der delDoppelte Methode");
		a = randomIntArray(50, 0, 10);
		printIntArray("a = ", a);
		a = delDoppelte(a);
		printIntArray("adeldoppelte = ", a);
		System.out.println();
	}

	/**
	 * Die Methode gibt den Text des Arguments msg und das übergebene Array in
	 * Java-Notation aus
	 * 
	 * @param msg
	 *            Text des Arguments
	 * @param a
	 *            Das auszugebene Array
	 */
	public static void printIntArray(String msg, int[] a) {
		System.out.print(msg);
		System.out.print("{");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");
	}

	/**
	 * Generiert ein Array mit "anzahl" Elementen, wobei jedes eine Zufällige Zahl
	 * zwischen "von" bis "bis" ist
	 * 
	 * @param anzahl
	 *            Die Anzahl der Elemente im Array
	 * @param von
	 *            Die Untergrenze der zufälligen Zahl
	 * @param bis
	 *            Die Obergrenze der zufälligen Zahl
	 * @return Das Array das mit zufälligen Zahlen gefüllt ist
	 */
	public static int[] randomIntArray(int anzahl, int von, int bis) {
		int[] ret = new int[anzahl];
		for (int i = 0; i < ret.length; i++) {
			ret[i] = (int) (Math.random() * ((bis - von) + 1)) + von;
		}
		return ret;
	}

	/**
	 * Gibt die kleinste Zahl von dem Array a zurück
	 * 
	 * @param a
	 *            Das Array in dem die kleinste Zahl gesucht wird
	 * @return Die kleinste Zahl im Array
	 */
	public static int getMinimum(int[] a) {
		int ret = a[0];
		for (int i = 1; i < a.length; i++) {
			if (ret > a[i]) {
				ret = a[i];
			}
		}
		return ret;
	}

	/**
	 * Gibt die größte Zahl von dem Array a zurück
	 * 
	 * @param a
	 *            Das Array in dem die größte Zahl gesucht wird
	 * @return Die großte Zahl im Array
	 */
	public static int getMaximum(int[] a) {
		int ret = a[0];
		for (int i = 1; i < a.length; i++) {
			if (ret < a[i]) {
				ret = a[i];
			}
		}
		return ret;
	}

	/**
	 * Gibt den Mittelwert der Zahlen von dem Array a zurück
	 * 
	 * @param a
	 *            Das Array in dem der Mittelwert gesucht wird
	 * @return Der Mittelwert des Arrays
	 */
	public static double getMittelwert(int[] a) {
		double ret = 0;
		for (int i = 0; i < a.length; i++) {
			ret = ret + a[i];
		}
		ret = ret / a.length;
		return ret;
	}

	/**
	 * Die Methode sucht die Zahl z im Array a und gibt die Position zurück an
	 * welcher die Zahl zum ersten Mal vorkommt. Falls z nicht gefunden werden kann,
	 * wird -1 zurückgegeben.
	 * 
	 * @param a
	 *            Das Array in dem die Zahl gesucht werden soll
	 * @param z
	 *            Die gesucht Zahl
	 * @return Der Index an dem die Zahl gefunden wurde
	 */
	public static int indexOf(int[] a, int z) {
		int ret = -1;
		boolean ermittelt = false;
		for (int i = 0; i < a.length; i++) {
			if (z == a[i] && !ermittelt) {
				ret = i;
				ermittelt = true;
			}
		}
		return ret;
	}

	/**
	 * Die Methode die Zahl z im Array a ab der Position pos und gibt die Position
	 * zurück. Falls z nicht gefunden werden kann oder pos größer als die Länge von
	 * a ist, wird -1 zurückgegeben werden.
	 * 
	 * @param a
	 *            Das Array in dem die Zahl gesucht werden soll
	 * @param z
	 *            Die gesucht Zahl
	 * @param pos
	 *            Die Position an der gestartet werden soll
	 * @return Der Index an dem die Zahl gefunden wurde
	 */
	public static int indexOf(int[] a, int z, int pos) {
		int ret = -1;
		boolean ermittelt = false;
		if (pos < a.length) {
			for (int i = pos; i < a.length; i++) {
				if (z == a[i] && !ermittelt) {
					ret = i;
					ermittelt = true;
				}
			}
		}
		return ret;
	}

	/**
	 * Methode welche im Array a ab der Position pos inklusive die Position des
	 * Minimums zurückgibt. Falls pos größer als die Länge von a ist, wird -1
	 * zurückgegeben.
	 * 
	 * @param a
	 *            Das Array in dem die Position der kleinsten Zahl gesucht werden
	 *            soll
	 * @param pos
	 *            Die Position an der gestartet werden soll
	 * @return Die Position der kleinsten Zahl im Array
	 */
	public static int getMinPos(int[] a, int pos) {
		int ret = -1;
		if (pos < a.length) {
			ret = a[pos];
			for (int i = pos + 1; i < a.length; i++) {
				if (ret > a[i]) {
					ret = a[i];
				}
			}
			ret = indexOf(a, ret, pos);
		}
		return ret;
	}

	/**
	 * Erhöht jedes Element von a um die Zahl z
	 * 
	 * @param a
	 *            Das Array in dem jedes Element die Zahl z erhöht werden soll
	 * @param z
	 *            Die Zahl um die die Elemente erhöht werden sollen
	 */
	public static void addZahl(int[] a, int z) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] + z;
		}
	}

	/**
	 * Vertauscht das Element a[i] mit dem Element a[j]. Falls i oder j größer als
	 * die Länge von a ist, wird das Array nicht verändert.
	 * 
	 * @param a
	 *            Das Array in dem die Elemente vertauscht werden sollen
	 * @param i
	 *            Position des zu vertauschenden Elementes
	 * @param j
	 *            Zweite Position des zu vertauschenden Elementes
	 */
	public static void swap(int[] a, int i, int j) {
		if (i < a.length && j < a.length) {
			int zahli = a[i];
			a[i] = a[j];
			a[j] = zahli;
		}
	}

	/**
	 * Sortiert die Zahlen in dem Array a von der kleinsten bis zur größten.
	 * 
	 * @param a
	 *            Der zu sortierende Array
	 */
	public static void sortMinArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			swap(a, i, getMinPos(a, i));
		}
	}

	/**
	 * Löst aus dem Array a alle doppelten Zahlen und gibt ein neues, von doppelt
	 * vorkommenden Zahlen gesäubertes Array zurück.
	 * 
	 * @param a
	 *            Zu säuberndes Array
	 * @return Gesäubertes Array
	 */
	public static int[] delDoppelte(int[] a) {
		int[] ret = null;
		int[] temparr = new int[a.length];
		boolean vorhanden = false;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < temparr.length; j++) {
				if (a[i] == temparr[j]) {
					vorhanden = true;
				}
			}
			if (vorhanden == false) {
				temparr[k] = a[i];
				k++;
			}
			vorhanden = false;
		}
		ret = new int[k];
		for (int i = 0; i < k; i++) {
			ret[i] = temparr[i];
		}
		return ret;
	}

}