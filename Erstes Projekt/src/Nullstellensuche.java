
public class Nullstellensuche {

	public static void main(String[] args) {
		
		//Eingabe der Werte
		int a = TestScanner.readInt("a = ");
		int b = TestScanner.readInt("b = ");
		int c = TestScanner.readInt("c = ");
		
		double d = Math.pow(b, 2) - 4 * a * c;
		
		//Errechnung des Ergebnis
		if (d >= 0) {
			if (d == 0) {
				System.out.println("Eine Lösung:");
				System.out.println("x= " + (-b + Math.sqrt(d)) / (2 * a));
			}
			else {
				System.out.println("Zwei Lösungen:");
				System.out.println("x1= " + (-b + Math.sqrt(d)) / (2 * a));
				System.out.println("x1= " + (-b - Math.sqrt(d)) / (2 * a));
			}
		}
		else {
			System.out.println("Keine Lösung");
		}
	}
}