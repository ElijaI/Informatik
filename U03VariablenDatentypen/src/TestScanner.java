/**
  * Diese Klasse ermöglicht das Austesten der Klasse Scanner. Genauere Informationen
  * über die Klasse java.util.Scanner finden Sie in der Java API-Dokumentation
  * @author Michael Wild
  * @see java.util.Scanner
  * @see java.lang.System.in
  */

public class TestScanner {
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
    System.out.println("TestScanner");
    System.out.println("===========");
  	int i = readInt ("Geben Sie einen int-Wert ein: ");
    double d = readDouble ("Geben Sie einen double-Wert ein: ");
    System.out.println("i = " + i + ", d = " + d);
  }
}
