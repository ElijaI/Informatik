
public class FlexWeihnachtsbaum {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Der flexible Weihnachtsbaum");
		System.out.println("===========================");
		
		//Einlesen der Baum- und Stammhöhe
		int baumhoehe = TestScanner.readInt("Geben Sie die Höhe des Baumes ein: ");
		int stammhoehe = TestScanner.readInt("Geben Sie die Höhe des Stammes ein: ");
		
		//Deklarieren und initialisieren der Variable
		int ster = 1;
		
		//Schleife zur Ausgabe des Baumes
		for (int i = baumhoehe - 1; i >= 0; i--) {
			printLeerzeichen(i);
			printSterne(ster * 2 - 1);
			printLeerzeichen(i);
			System.out.println();
			ster++;
		}
		
		//Schleife zur Ausgabe des Stammes
		for (int i = 1; i <= stammhoehe; i++) {
			printLeerzeichen(baumhoehe - 2);
			printSterne(3);
			printLeerzeichen(baumhoehe - 2);
			System.out.println();
		}
		
	}
	
	//Methode zur Ausgabe der Leerzeichen
	public static void printLeerzeichen(int anzahl) {
		for (int i = 1; i <= anzahl; i++) {
			System.out.print(" ");
		}
	}
	
	//Methode zur Ausgabe der Sterne
	public static void printSterne(int anzahl) {
		for (int i = 1; i <= anzahl; i++) {
			System.out.print("*");
		}
	}
	
}
