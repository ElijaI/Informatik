
public class WuerfelSimulation {

	public static void main(String[] args) {
		
		//Ausgabe der �berschrift
		System.out.println("W�rfelsimulation");
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
		
		//Z�hlen der gew�rfelten Zahlen
		for(int i = 1; i <= MAX; i++) {
			
			//W�rfeln der Zahl
			int wuerfel = (int)Math.floor(Math.random()*6)+1;
			
			//Erh�hen der gew�rfelten Zahl
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
			
			//Erh�hen des Ladebalkens
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
		System.out.println("Anzahl W�rfe: " + MAX);
		
	}
}
