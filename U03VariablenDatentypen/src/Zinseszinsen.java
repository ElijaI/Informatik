
public class Zinseszinsen {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Zinseszinsen");
		System.out.println("============");
		
		//Deklarieren und initialisieren der Variablen
		double erg = 0;
		double zinssatz = 0;
		int i = 0;
		
		//Einlesen des Anfangskapital
		double anfkap = readDouble("Geben Sie das Anfangskapital ein: ");
		
		//Einlesen des Zinssatz
		double wertung = readDouble("Geben Sie den Zinssatz ein: ");
		
		//Einlesen der Jahre
		double jahre = readDouble("Geben Sie die Jahre ein: ");
		
		//Errechnen des Zinseszins
		erg = anfkap;
		while (i < jahre) {
			zinssatz = (erg / 100) * wertung;
			erg = erg + zinssatz;
			
			i = i + 1;
		}
		
		//Ausgabe des Ergebnis
		System.out.println();
		System.out.println("Das Endkapital nach " + jahre + " Jahren beträgt " + (int)Math.floor(erg));
		
	}
	
	//Klasse zur einlesung einer Eingabe
	public static double readDouble(String text) {	    
		System.out.print(text);
		return (new java.util.Scanner(System.in)).nextDouble();
		  }
}
