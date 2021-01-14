import java.lang.reflect.Array;

public class KleinsteGroessteZahl {

	public static void main(String[] args) {

		//Deklarieren und initialisieren der Variablen
		int[] zahlenfolge = {3, 9, 6, 4};
		int n = Array.getLength(zahlenfolge);
		int i = 0;
		float mw = 0;
		int kz = 1000;
		int gz = 0;
		
		//Ermittlung der gößten und kleinseten Zahl
		while (i < n) {
			
			if (kz > zahlenfolge[i]) {
				kz = zahlenfolge[i];
			}
			
			if (gz < zahlenfolge[i]) {
				gz = zahlenfolge[i];
			}
			
			mw = mw + zahlenfolge[i];
			
			i = i + 1;
			
		}
		
		mw = mw / n;
		
		//Ausgabe des Ergebnisses
		System.out.println("Die kleinste Zahl ist " + kz);
		System.out.println("Die größte Zahl ist " + gz);
		System.out.println("Der Mittelwert ist " + mw);
	}

}
