public class ZahlenratenUmgekehrt {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Umgekehrtes Zahlenraten");
		System.out.println("=======================");
		System.out.println("Suchen Sie sich eine Zahl im Intervall [0, 1000] aus. Ich werde sie finden");
		
		//Deklarieren und initialisieren der Variablen
		int hilfe = 0;
		int tipp = 500;
		int max = 1000;
		int min = 0;
		
		//Erraten der Zahl
		do {
			
			//Ausgabe deiner zufälligen Zahl in einem bestimmten Wertebereich
			tipp = (max + min) / 2;
			System.out.println("Mein Tipp: " + tipp);
			
			//Erhähen oder verringern des Wertebereichs
			hilfe = TestScanner.readInt("Zahl kleiner (0), größer (1), gefunden (2) ");
			switch (hilfe) {
				case 0: {
					max = tipp;
					break;
				}
				case 1: {
					min = tipp;
					break;
				}
				case 2: {
					break;
				}
				default: {
					System.out.println("Geben Sie eine der vorgegebenen Zahlen ein");
				}
			}
			
		} while (hilfe != 2);
		
		//Ausgabe wenn die Zahl gefunden wurde
		System.out.println("Ich habe die Zahl gefunden!");
	}

}
