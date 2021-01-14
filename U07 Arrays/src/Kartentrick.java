
public class Kartentrick {

	public static void main(String[] args) {

		do {
			int[][] karten = null;
			karten = fuellen(karten, 0);
			ausgeben(karten);
			int spalte = readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			spalte = readInt("Spalte der Karte: ");
			karten = fuellen(karten, spalte);
			ausgeben(karten);
			System.out.println("Karte " + karten[3][1] + " wurde gewählt");
		} while (Character.toLowerCase(readChar("Nochmals (j/n)? ")) == 'j');

	}

	/**
	 * Methode zum füllen und neu anordnen des Arrays karten. Wenn spalte 0 ist wird
	 * das Array zum ersten mal gefüllt. Wenn danach eine Zahl zwischen 1 und 3
	 * eingegeben wird werden die Spalten zusammen getan, wobei die Spalte mit der
	 * eingegebenen Zahl in der Mitte ist, und dann reihenweise Ausgegeben wird.
	 * 
	 * @param karten
	 *            Ein leeres oder bereits durch die Methode gefülltes
	 *            zweidimensionalse Array.
	 * @param spalte
	 *            Die Spalte in der sich die gesuchte Zahl befindet. Falls spalte 0
	 *            ist wird das Array gefüllt.
	 * @return Das gefüllte oder neu angeordnetes Array
	 */
	public static int[][] fuellen(int[][] karten, int spalte) {
		int[][] ret = new int[7][3];
		int[] helparray = new int[3];

		switch (spalte) {

		// Wenn spalte 0 ist, wird das Array gefüllt
		case 0: {
			for (int i = 0; i < ret.length; i++) {
				for (int j = 0; j < ret[i].length; j++) {
					switch (j) {
					case 0: {
						ret[i][j] = i + 1;
						break;
					}
					case 1: {
						ret[i][j] = i + 8;
						break;
					}
					case 2: {
						ret[i][j] = i + 15;
						break;
					}
					}
				}
			}

			break;
		}

		/*
		 * Die Spalten werden je nach dem welche Zahl eingegeben wird geordnet. Dabei
		 * ist die eingegebene Zahl die Spalte die in der Mitte sein soll.
		 */
		case 1: {
			helparray[0] = 2;
			helparray[1] = 0;
			helparray[2] = 1;
			break;
		}
		case 2: {
			helparray[0] = 0;
			helparray[1] = 1;
			helparray[2] = 2;
			break;
		}
		case 3: {
			helparray[0] = 1;
			helparray[1] = 2;
			helparray[2] = 0;
			break;
		}
		}

		// Die Karten werden neu zeilenweis in das Array gespeichert
		if (spalte != 0) {
			int k = 0;
			int l = 0;
			for (int i = 0; i < helparray.length; i++) {
				for (int j = 0; j < karten.length; j++) {
					ret[k][l] = karten[j][helparray[i]];
					if (l == 2) {
						l = 0;
						k++;
					} else {
						l++;
					}
				}
			}
		}
		return ret;

	}

	/**
	 * Gibt das übergebene zweidimensionale Array aus. Dabei werden die Zahlen
	 * linksbündig ausgegeben.
	 * 
	 * @param karten
	 *            Auszugebendes zweidimensionales Array
	 */
	public static void ausgeben(int[][] karten) {
		for (int i = 0; i < karten.length; i++) {
			for (int j = 0; j < karten[i].length; j++) {
				System.out.print(" ");
				if (karten[i][j] < 10) {
					System.out.print(" ");
				}
				System.out.print(karten[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * Erlaubt die Eingabe eines char-Wertes vom Standardeingabegerät. Die Methode
	 * gibt zuerst den übergebene Text aus und wartet in derselben Zeile auf die
	 * Eingabe eines Textes. Es wird solange gewartet bis der Text eingegeben und
	 * die Eingabetaste gedrückt wird. Danach wird das erste Zeichen des Textes
	 * zurück gegeben
	 * 
	 * @param text
	 *            der auszugebende Text
	 * @return das über die Standardeingabe eingelesene erste Zeichen
	 */
	public static char readChar(String text) {
		System.out.print(text);
		return (new java.util.Scanner(System.in).next().charAt(0));
	}

	/**
	 * Erlaubt die Eingabe eines int-Wertes vom Standardeingabegerät. Die Methode
	 * gibt zuerst den übergebene Text aus und wartet in derselben Zeile auf die
	 * Eingabe des int-Wertes. Es wird solange gewartet bis eine Zahl eingegeben und
	 * die Eingabetaste gedrückt wird.
	 * 
	 * @param text
	 *            der auszugebende Text
	 * @return die über die Standardeingabe eingelesene Zahl
	 */
	public static int readInt(String text) {
		System.out.print(text);
		return (new java.util.Scanner(System.in)).nextInt();
	}

}
