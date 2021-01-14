/**
  * Diese Klasse ermöglicht das Austesten der Klasse Scanner. Genauere Informationen
  * über die Klasse java.util.Scanner finden Sie in der Java API-Dokumentation
  * @author Michael Wild
  * @see java.util.Scanner
  * @see java.lang.System.in
  */

public class TestScannerErweitert {

	/**
   * Erlaubt die Eingabe eines char-Wertes vom Standardeingabegerät.
   * Die Methode gibt zuerst den übergebene Text aus und wartet in derselben Zeile
   * auf die Eingabe eines Textes. Es wird solange gewartet bis der Text eingegeben
   * und die Eingabetaste gedrückt wird. Danach wird das erste Zeichen des Textes
   * zurück gegeben
   * @param text der auszugebende Text
   * @return das über die Standardeingabe eingelesene erste Zeichen
   */
	public static char readChar(String text) {
    System.out.print(text);
    return (new java.util.Scanner(System.in).next().charAt(0));
  }

	/**
   * Erlaubt die Eingabe eines Textes vom Standardeingabegerät.
   * Die Methode gibt zuerst den übergebene Text aus und wartet in derselben Zeile
   * auf die Eingabe eines Textes. Es wird solange gewartet bis der Text eingegeben
   * und die Eingabetaste gedrückt wird
   * @param text der auszugebende Text
   * @return der über die Standardeingabe eingelesene Text
   */
	public static String readString(String text) {
    System.out.print(text);
    return (new java.util.Scanner(System.in).nextLine());
  }

  /**
   * Erlaubt die Eingabe eines int-Wertes vom Standardeingabegerät.
   * Die Methode gibt zuerst den übergebene Text aus und wartet in derselben Zeile
   * auf die Eingabe des int-Wertes. Es wird solange gewartet bis eine Zahl eingegeben
   * und die Eingabetaste gedrückt wird.
   * @param text der auszugebende Text
   * @return die über die Standardeingabe eingelesene Zahl
   */
	public static int readInt(String text) {
    System.out.print(text);
    return (new java.util.Scanner(System.in)).nextInt();
  }

  /**
   * Erlaubt die Eingabe eines double-Wertes vom Standardeingabegerät.
   * @param text der auszugebende Text
   * @return die über die Standardeingabe eingelesene Zahl
   * @see readInt(String) 
   */
  public static double readDouble(String text) {
    System.out.print(text);
    return (new java.util.Scanner(System.in)).nextDouble();
  }
  
  /**
   * Diese Methode soll den Verwendungszweck der Methoden readInt und readDouble
   * erklären. Sie gibt zuerst Texte aus, welche zuerst zur Eingabe eines int-Wertes
   * und dann zur Eingabe eines double-Wertes auffordern. Nachdem die 
   * Werte eingegeben wurden, werden diese in Variablen geschrieben und deren
   * Inhalte ausgegeben
   * @param args wird nicht verwendet
   */
  public static void main(String[] args) {
    System.out.println("TestScannerErweitert");
    System.out.println("====================");
  	char c = readChar ("Geben Sie ein Zeichen ein: ");
    String s = readString ("Geben Sie einen Text ein: ");
    System.out.println("c = " + c + ", s = " + s);
  }
}
