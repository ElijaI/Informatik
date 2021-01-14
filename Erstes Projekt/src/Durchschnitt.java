
public class Durchschnitt {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Gesamtdurchschnitt");
		System.out.println("==================");
		System.out.println();
		
		//Deklarieren und initialisieren der Variablen
		double gesdurch = 0;
		double note = 0;
		double i = 0;
		
		//Eingabe der Noten
		while (true) {
			note = TestScanner.readDouble("Note: ");
			System.out.println();
			gesdurch = gesdurch + note;
			i++;
			if (note == 0) {
			break;
			}
		}
		
		//Errechnung des durchschnitts
		i = i - 1;
		gesdurch = gesdurch / i;
		gesdurch = Math.floor(gesdurch * 100) / 100;
		
		//Ausgabe
		System.out.println();
		System.out.print("Der Durchschnitt ist: ");
		System.out.println(gesdurch);
	}

}