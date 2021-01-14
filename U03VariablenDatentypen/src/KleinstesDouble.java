
public class KleinstesDouble {

	public static void main(String[] args) {
		
		//Variablen deklarieren und initialisieren
		double a = 1;
		double b = 1;
		
		//Die Schleife halbeirt die Zahl jedesmal und speichert sie in b bis a 0 ist
		while (a > 0) {
			
			a = a / 2;
			
			if (a != 0) {
				b = a;
			}
			
		}
		
		//b wird ausgegeben
		System.out.println(b);
	}

}
