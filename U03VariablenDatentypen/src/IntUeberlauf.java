
public class IntUeberlauf {

	public static void main(String[] args) {
		
		//Initialisieren der gr��t m�glichen Zahl von int
		int a = 2147483647;
		
		//Ausgabe dieser Zahl
		System.out.println(a);
		
		//Erh�hung der Zahl um eins, dammit es den Wertebereich sprengt
		a = a + 1;
		
		//Erneute ausgabe der Zahl
		System.out.println(a);
	}

}
