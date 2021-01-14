/**
 * Rohdatei zur Programmieraufgabe "Textverarbeitung"
 * @author Michael Wild
 */
public class Textverarbeitung
{
	public static void main(String[] args) {
		// Länge auf welche die Zeilen abgeschnitten und auf die Blocksatz 
		// eingestellt wird
		final int LAENGE = 30;
		System.out.println("Textverarbeitung");
		System.out.println("================");
		String s1 = readString("1. Zeile: ");
		String s2 = readString("2. Zeile: ");
		String s3 = readString("3. Zeile: ");
		String s4 = readString("4. Zeile: ");
		
		// Ermittlung der abgeschnittenen Zeilen
		s1 = abschneiden(s1,LAENGE);
		s2 = abschneiden(s2,LAENGE);
		s3 = abschneiden(s3,LAENGE);
		s4 = abschneiden(s4,LAENGE);
		System.out.println(">>Abschneiden");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

		// Entfernen der Leerzeichen pro Zeile
		s1 = leerzeichenEntfernen(s1);
		s2 = leerzeichenEntfernen(s2);
		s3 = leerzeichenEntfernen(s3);
		s4 = leerzeichenEntfernen(s4);
		System.out.println(">>Leerzeichen entfernen");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// Einstellen des Blocksates
		System.out.println(">>Blocksatz");
		s1 = blocksatz(s1,LAENGE);
		s2 = blocksatz(s2,LAENGE);
		s3 = blocksatz(s3,LAENGE);
		s4 = blocksatz(s4,LAENGE);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

	/**
	 * Schneidet den übergebenen String s auf eine Länge von l zurecht
	 * und gibt den abgeschnittenen String zurück. Sollte der String weniger
	 * als l Zeichen lang sein, so wird der String unverändert zurück gegeben.
	 * Die Methode kann nur funktionieren, falls s nicht null und falls
	 * l > 0 ist, ansonsten wird null als Ergebnis zurück geliefert
	 * @param s der abzuschneidende String
	 * @param l Laenge die der zurückzuliefernde String haben soll
	 * @return der auf die Länge l gekürzte String oder null falls s gleich null 
	 * oder l <= 0 ist
	 */
	public static String abschneiden(String s, int l) {
		String ret = null;
		
		//Überprüfen ob s nicht null und größer als 0 ist
		if (s.length() > 0 && s != null) {
			
			//Kürzen und rückgabe falls s länger als l ist wenn nicht dann 
			if (s.length() > l) {
				ret = s.substring(0, l);
			} else {
				ret = s;
			}
		} 
		return ret;
	}
	
	/**
	 * Entfernt vom übergebenen String s alle überflüssigen Leerzeichen, die 
	 * nicht nur am Beginn und am Ende sondern auch zwischen den Worten im
	 * String vorhanden sein können. Falls für s null übergeben wird, dann 
	 * liefert die Methode null zurück
	 * @param s String der die zu entfernen Leerzeichen enthält
	 * @return den String, der weder am Anfang noch am Ende Leerzeichen
	 * enthält und der auch zwischen den Worten nur jeweils ein Leerzeichen
	 * enthält. Insbesondere liefert die Methode null zurück, falls ihr null
	 * übergeben wurde
	 */
	public static String leerzeichenEntfernen(String s) {
		String ret = null;
		char buchstabe = 0;
		String rueckgabe = "";
		
		if (s != null) {
			s = s.trim();
			for (int i = 0; i < s.length(); i++) {
				if(Character.isWhitespace(s.charAt(i)) && Character.isWhitespace(s.charAt(i + 1))) {
					
				} else {
					buchstabe = s.charAt(i);
					rueckgabe = rueckgabe + buchstabe;
				}
			}
			ret = rueckgabe;
		}
		return ret;
	}
	
	/**
	 * Stellt auf den übergebenen String s einen Blocksatz der Länge l ein.
	 * Sollte der String s gleich null oder länger als l Zeichen sein oder
	 * sollte der String keine Leerzeichen enthalten über die der Blocksatz
	 * gebildet werden kann, so wird null als Ergebnis geliefert. Der Blocksatz 
	 * wird so gebildet, dass die fehlenden Leerzeichen bis zu Länge l 
	 * gleichmäßig auf die bereits vorhandenen Leerzeichen aufgeteilt werden. 
	 * Bevor der Blocksatz eingestellt wird, werden beim vorhandenen String alle 
	 * unnötigen Leerzeichen weggestrichen
	 * @param s String auf den der Blocksatz eingestellt werden soll
	 * @param l die Länge des Blocksatzes
	 * @return den String, auf den der Blocksatz eingestellt wurde
	 */
	public static String blocksatz(String s, int l) {
		String ret = null;
        int leerzeichen = 0;
        
        if (s.length() < 1) {
            ret = null;
        }
        
        for (int i = 0; i < s.length(); i++) {
            if (Character.isWhitespace(s.charAt(i))) {
                leerzeichen++;
            }
        }
        
        if (leerzeichen == 0) {
            s = null;
        }
        else {
            leerzeichen = (l - s.length())+1;
            String s2 = "";
            int i = 0;
            int j = 0;
            while (i < s.length()) {
            	
                if (Character.isWhitespace(s.charAt(i))) {
                    s2 = s.substring(0, i + 1);
                    
                    if (j <= leerzeichen){
                        s2 = s2 + " ";
                        j++;
                    }
                    
                    s = s2 + s.substring(i+1);
                    
                    i++;
                }
                
                if (i == s.length()-1 && j <= leerzeichen) {
                    i = 0;
                }
                i++;
            }
            
            ret = s;
        }
		return ret;
	}

	public static String readString(String text) {
    System.out.print(text);
    return (new java.util.Scanner(System.in).nextLine());
  }
}
