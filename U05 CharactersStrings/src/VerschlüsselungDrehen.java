
public class Verschl�sselungDrehen {

	public static void main(String[] args) {
		
		//Ausgabe der �berschrift
		System.out.println("Verschl�sselung durch Drehen");
		System.out.println("============================");
		
		do {
		//Einlesen vom dem Text um �berpr�fen ob er mindestens ein Zeichen enth�llt
		String text = TestScannerErweitert.readString("Text: ");
		text = text.trim();
		while (text.length() < 1) {
			System.out.println("Text muss mindestens ein Zeichen enthalten");
			text = TestScannerErweitert.readString("Text: ");
		}
		
		//Deklarieren und initialisieren der Variablen
		int j = text.length();
		int k = 0;
		
		//Verschl�sseln
		System.out.print("Verschl�sselt: ");
		if (j % 2 == 0) {
			j--;
			for (int i = 0; i < Math.floor((text.length() / 2.)); i++) {
				System.out.print(text.charAt(i));
				System.out.print(text.charAt(j));
				j--;	
			}	
		} else {
			j--;
			for (int i = 0; i < Math.floor((text.length() / 2.)); i++) {
				System.out.print(text.charAt(i));
				System.out.print(text.charAt(j));
				j--;
				k = j;
			}
			System.out.println(text.charAt(k));
		}
		
		//Abfrage zum widerholen des Programms
		System.out.println();
		} while (TestScannerErweitert.readChar("Nochmal (j/n)? ") == 'j');
	}

}
