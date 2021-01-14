
public class WuerfelSimulation {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Würfelsimulation");
		System.out.println("================");
		
		//Deklarieren und initialisieren der Variablen
		final int MAX = 1000000000;
		int a1 = 0;
		int a2 = 0;
		int a3 = 0;
		int a4 = 0;
		int a5 = 0;
		int a6 = 0;
		
		//Ausgabe von bitte warten
		System.out.println("Bitte warten");
		
		//Zählen der gewürfelten Zahlen
		for(int i = 1; i <= MAX; i++) {
			
			//Würfeln der Zahl
			int wuerfel = (int)Math.floor(Math.random()*6)+1;
			
			//Erhöhen der gewürfelten Zahl
			if (wuerfel == 1) {
				a1++;
			} else if (wuerfel == 2) {
				a2++;
			} else if (wuerfel == 3) {
				a3++;
			} else if (wuerfel == 4) {
				a4++;
			} else if (wuerfel == 5) {
				a5++;
			} else if (wuerfel == 6) {
				a6++;
			}
			
			//Erhöhen des Ladebalkens
			if (i % (MAX / 30) == 0) {
				System.out.print(".");
			}
			
		}
		
		//Ausgabe der Ergebnisse
		System.out.println();
		System.out.println();
		System.out.println("Anzahl 1: " + a1);
		System.out.println("Anzahl 2: " + a2);
		System.out.println("Anzahl 3: " + a3);
		System.out.println("Anzahl 4: " + a4);
		System.out.println("Anzahl 5: " + a5);
		System.out.println("Anzahl 6: " + a6);
		System.out.println();
		System.out.println("Anzahl Würfe: " + MAX);
		
	}
}
