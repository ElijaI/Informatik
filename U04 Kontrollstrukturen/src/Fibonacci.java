
public class Fibonacci {

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Fibonacci-Zahlen");
		System.out.println("================");
		
		//Initialisieren und deklarieren der Variablen
		int n = 0;
		int n1 = 0;
		int n2 = 1;
		int fibzahl = 0;
		int i = 1;
		
		//Einlesen der Zahl und überprüfen ob sie größer Null ist
		while (true) {
			n = TestScanner.readInt("Die wievielte Zahl? ");
			if (n >= 0) {
				break;
			} else {
				System.out.println("Die Zahl muss größer oder gleich Null sein");
			}
		}
		
		//Ermittlung der Fibonaccizahl
		if (n == 0) {
			fibzahl = 0;
		} else if (n == 1) {
			fibzahl = 1;
		} 
		
		while (n > i) {
			fibzahl = n1 + n2;
			n1 = n2;
			n2 = fibzahl;
			i++;
		}
		
		//Ausgabe der Fibonaccizahl
		System.out.println();
		System.out.println("Die " + n + ". Fibonacci-Zahl lautet " + fibzahl);
	}

}
