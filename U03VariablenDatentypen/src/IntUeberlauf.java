
public class IntUeberlauf {

	public static void main(String[] args) {
		
		//Initialisieren der größt möglichen Zahl von int
		int a = 2147483647;
		
		//Ausgabe dieser Zahl
		System.out.println(a);
		
		//Erhöhung der Zahl um eins, dammit es den Wertebereich sprengt
		a = a + 1;
		
		//Erneute ausgabe der Zahl
		System.out.println(a);
	}

}
