
public class Weihnachtsbaum {

	public static void main(String[] args) {
		
		//Deklarieren und initialisieren der Variable
		int ster = 1;
		
		//Schleife zur Ausgabe des Baumes
		for (int i = 14; i >= 0; i--) {
			printLeerzeichen(i);
			printSterne(ster * 2 - 1);
			printLeerzeichen(i);
			System.out.println();
			ster++;
		}
		
		//Schleife zur Ausgabe des Stammes
		for (int i = 1; i <= 3; i++) {
			printLeerzeichen(13);
			printSterne(3);
			printLeerzeichen(13);
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
