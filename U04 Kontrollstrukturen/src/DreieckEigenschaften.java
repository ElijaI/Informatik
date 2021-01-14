
public class DreieckEigenschaften {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Eigenschaften eines Dreieckes");
		System.out.println("=============================");
		
		//Deklarieren und initialisieren der Variablen
		double a = 0;
		double b = 0;
		double c = 0;
		int umfang = 0;
		double fl = 0;
		double kathete1 = 0;
		double kathete2 = 0;
		double hypotenuse = 0;
		int abbrechen = 0;
		
		//Einlesen der Seiten
		do {
		do {
		a = TestScanner.readDouble("Seite a: ");
		b = TestScanner.readDouble("Seite b: ");
		c = TestScanner.readDouble("Seite c: ");
		if (b + c < a || a + c < b || a + b < c) {
			System.out.println("Unmögliches Dreieck");
			System.out.println();
		}
		} while (b + c < a || a + c < b || a + b < c);
		System.out.println();
		
		//Ermitteln des Umfangs
		umfang = (int)(a + b + c);
		System.out.println("Umfang: " + umfang);
		
		//Ermitteln der Fläche
		fl = (1 / 4.) * Math.sqrt((a + b + c) * (-a + b + c) * (a - b + c) * (a + b - c));
		System.out.println("Fläche: " + fl);
		
		//Ermitteln der Hypotenuse
		if (a > b && a > c) {
			hypotenuse = a;
			kathete1 = b;
			kathete2 = c;
		}
		if (b > a && b > c) {
			hypotenuse = b;
			kathete1 = a;
			kathete2 = c;
		}
		if (c > a && c > b) {
			hypotenuse = c;
			kathete1 = a;
			kathete2 = b;
		}
		
		//Ermitteln um welches Dreieck es sich handelt
		
		//Überprüfen ob es ein Gleichseitiges Dreieck ist
		if (a == b && b == c) {
			System.out.println("Gleichseitiges Dreieck");
			
			//Überprüfen ob es ein Gleichschenkliges Dreieck ist
		} else if (a == b || a == c || b == c) { 
			System.out.println("Gleichschenkliges Dreieck");
			
			//Überprüfen ob es ein Pythagoreisches oder Rechtwinklliges Dreieck ist
		} else if (Math.pow(kathete1, 2) + Math.pow(kathete2, 2) == Math.pow(hypotenuse, 2)) {
			if (Math.round(a) == a && Math.round(b) == b && Math.round(c) == c) {
				System.out.println("Pythagoreisches Dreieck");
				System.out.println("Hypotenuse: " + hypotenuse);
			} else {
				System.out.println("Rechtwinkliges Dreieck");
				System.out.println("Hypotenuse: " + hypotenuse);
			}
		}
		
		System.out.println();
		abbrechen = TestScanner.readInt("Nochmal (0), Beenden (1)");
		System.out.println();
		
		} while (abbrechen == 0);
		}

}