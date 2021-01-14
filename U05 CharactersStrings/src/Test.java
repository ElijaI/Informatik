public class Test {

	public static void main(String[] args) {
		
		final int LAENGE = 30;
		String s = "Hallo i bims der Elija";
		char buchstabe = 0;
		int laenge = s.length();
		int laengediff = LAENGE - s.length();
		int j = 0;
		
		for(int i = 0; i <= laengediff; i++) {
			while(j < laenge) {
				buchstabe = s.charAt(j);
				if (i >= laengediff) {
					break;
				} else {
				}
			}
		}
		System.out.println(s);
	}

}