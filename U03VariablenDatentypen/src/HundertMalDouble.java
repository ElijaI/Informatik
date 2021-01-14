
public class HundertMalDouble {

	public static void main(String[] args) {
		
		//Initialisieren und Deklarieren der Variablen
		double erg = 0;
		int i = 1;
		
		//Schleife die 0,1 hundert mal addiert
		while (i <= 100) {
			erg = erg + 0.1;
			i = i + 1;
		}
		
		//Ausgabe der Zahl
		System.out.println(erg);
	}

}
