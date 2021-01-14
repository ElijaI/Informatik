public class PerfekteZahlen {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("PerfekteZahlen");
		System.out.println("==============");
		
		//Deklarieren und Initialisieren der Variablen
		int n = 1;
		int teiler = 1;
		int summe = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		
		//Schleife wiederholt sich bis die 5 Zahlen ermittelt wurden
		while (i <= 5) {
			
			//Ermittlung der Summe
			while (n > teiler) {
				if (n % teiler == 0) {
					summe = summe + teiler;
					j++;
				}
				teiler++;
			}
			
			//Vergleich von der Summe mit der Zahl
			if (summe == n) {
				
				//Ausgabe der Teiler
				System.out.print(n + " = ");
				teiler = 1;
				while (n > teiler) {
					if (n % teiler == 0) {
						System.out.print(teiler );
						if (j - 1 > k) {
							System.out.print(" + ");
							k++;
						}
						summe = summe + teiler;
					}
					teiler++;
				}
				
				//Da eine Perfekte-Zahl gefunden wurde wird i um 1 erhöht
				System.out.println();
				i++;
			}
			
			//Die Zahl wird erhöht und die Variablen werden zurückgesetzt
			n++;
			teiler = 1;
			summe = 0;
			j = 0;
			k = 0;
		}
		
	}

}