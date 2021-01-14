public class SatellitenZeit
{

	public static void main(String[] args) {
		
		//Ausgabe der Überschrift
		System.out.println("Satellitenzeit");
		System.out.println("==============");
		
		//Einleden der Sekunden
		int gesamtSekunden = TestScanner.readInt("Geben Sie die Sekunden ein: ");
		
		//Formel für tage, stunden, minuten, sekunden werden im Datentyp double impliziert
		double tage = Math.floor(gesamtSekunden/60/60/24);
		double stunden = Math.floor(gesamtSekunden/60.0/60-24.0);
		double minuten = Math.floor((gesamtSekunden/60.0/60-24-stunden)*60);
		double sekunden = Math.ceil((gesamtSekunden/60.0-gesamtSekunden/60)*60);
		
		//Falls stunden, minuten oder sekunden unterhalb null sind werden sie mit null üeberschrieben
		if (stunden<0) {
			stunden = 0;
		}
		if (minuten<0) {
			minuten = 0; 
		}
		if (sekunden<0) {
			sekunden = 0;
		}
		
		//Falls sekunden größer ist als 59
		if (sekunden>59) {
			//Neue Varaible vom Datentyp double, dient dazu, dass man die Kommastelle berechnen kann
			double uebersekunden = 0D;
			//sekunden werden um 60 halbiert
			sekunden = sekunden/60;
			//Man bekommt eine Kommastelle für sekunden heraus
			uebersekunden = uebersekunden + (sekunden-Math.floor(sekunden));
			//Zahl wird abgerundet
			Math.floor(sekunden);
			//minuten werden um sekunden erhöht 
			minuten = minuten + sekunden;
			sekunden = 0;
			//Man mulitipliziert die Dezimalstelle mit 60 und schreibt sie in sekunden hinein
			sekunden = sekunden + uebersekunden*60;
		}
		
		//Falls minuten größer ist als 59
		if (minuten>59) {
			double ueberminuten = 0D;
			minuten = minuten/60;
			ueberminuten = ueberminuten + (minuten-Math.floor(minuten));
			Math.floor(minuten);
			//stunden werden mit den berechneten minuten addiert
			stunden = stunden + minuten;
			minuten = 0;
			minuten = minuten + ueberminuten*60;
		}
		
		//Falls stunden größer ist als 23
		if (stunden > 23) {
			double ueberstunden = 0D;
			stunden = stunden/24;
			ueberstunden = ueberstunden + (stunden-Math.floor(stunden));
			Math.floor(stunden);
			//Tager werden mit den berechneten stunden addiert
			tage = tage + stunden;
			stunden = 0;
			stunden = stunden + ueberstunden*24;
		}
		
		//Man gibt das Ergebnis für tage, stunden, minuten und sekunden als einen primitiven Datentyp integer aus
		System.out.print("d "+(int)tage+" h "+(int)stunden+" m "+(int)minuten+" s "+(int)sekunden);
	}

}