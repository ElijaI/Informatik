
public class Zahlenraten {

	public static void main(String[] args) {
		
		//Ausgabe der �berschrift
		System.out.println("Zahlenraten");
		System.out.println("===========");
		System.out.println("Ich habe mir eine Zahl im Intervall [0, 1000] ausgedacht. Versuchen Sie diese zu erraten");
		
		//Deklarieren und initialisieren der Variablen
		int erdenktezahl = (int)(Math.random()*1000);
		int tipp = 0;
		
		//Die Schleife wiedeholt sich bis die Zahl gefunden wurde
		do {
			
			//Einlesen der Eingabe
			tipp = TestScanner.readInt("Ihr Tipp: ");
			
			//�berpr�fung ob die Zahl gr��er oder kleiner ist
			if (tipp < erdenktezahl) {
				System.out.println("Ihre Zahl ist zu klein");
			} else if (tipp > erdenktezahl) {
				System.out.println("Ihre Zahl ist zu gro�");
			}
			
		} while (erdenktezahl != tipp);
		
		//Ausgabe wenn die Zahl gefunden wurde
		System.out.println("Mein Kompliment! Sie haben die Zahl gefunden");
	}

}
