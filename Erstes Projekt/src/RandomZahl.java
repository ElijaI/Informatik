
public class RandomZahl {

	public static void main(String[] args) {
		//Ausgabe der Überschrift
		System.out.println("Zufallszahl");
		System.out.println("===========");
		System.out.println();
		
		//Einlesen des Wertebereichs
		int wertebereich = 1;
		while (wertebereich != 0) {
			wertebereich = TestScanner.readInt("Eingeben des Wertebereichs: ");
			int wuerfel = (int)Math.floor(Math.random()*wertebereich)+1;
			
			//Ausgabe der Werte
			System.out.println("Wert: " + wuerfel);
			System.out.println();
		}
	}

}
