public class KugelBerechnung {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Kugelberechnung");
		System.out.println("===============");
		
		//Einlesen des Radius der Kugel
		double rad = readDouble("Geben Sie den Radius der Kugel ein: ");
		System.out.println();
		
		//Berechnung des Umfangs
		double umfa = 2 * Math.PI * rad;
		
		//Berechnung der Oberfläche
		double ober = 4 * Math.PI * Math.pow(rad, 2);
		
		//Berechnung des Volumens
		double volu = (4 / 3.) * Math.PI * Math.pow(rad, 3);
		
		//Ausgabe der berechneten Werte
		System.out.println("Der Umfang der Kugel beträgt: " + umfa);
		System.out.println("Die Oberfläche der Kugel beträgt: " + ober);
		System.out.println("Das Volumen der Kugel beträgt: " + volu);
		
	}
	
	
	//Klasse zur einlesung einer Eingabe
	public static double readDouble(String text) {
	    System.out.print(text);
	    return (new java.util.Scanner(System.in)).nextDouble();
	  }
}
