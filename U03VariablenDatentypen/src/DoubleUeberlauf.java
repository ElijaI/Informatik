
public class DoubleUeberlauf {

	public static void main(String[] args) {
		
		//Größtmögliche double
		double a = 1999999999;
		int i = 1;
	
		//Schleife zur Erhöhung der double bis sie den Wertebereich sprengt
		while (i < 100000) {
			
			a = a * 1E100;
			System.out.println(a);
		}
	}

}
