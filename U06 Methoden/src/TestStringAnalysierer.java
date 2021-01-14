/**
 * Verwenden Sie diese Klasse zum Testen der Klasse MeinStringAnalysierer
 * @author Michael Wild
 */
public class TestStringAnalysierer
{
	public static void main(String[] args) {
		System.out.println("hatNurZiffern(\"1242332322129\") ergibt " +
				MeinStringAnalysierer.hatNurZiffern("1242332322129"));
		System.out.println("hatNurZiffern(\"124233232X129\") ergibt " +
				MeinStringAnalysierer.hatNurZiffern("124233232X129"));
		System.out.println("hatNurZiffern(null) ergibt " +
				MeinStringAnalysierer.hatNurZiffern(null));
		System.out.println("umdrehenString(\"Rudi\") ergibt " +
				MeinStringAnalysierer.umdrehenString("Rudi"));
		System.out.println("umdrehenString(null) ergibt " +
				MeinStringAnalysierer.umdrehenString(null));
		System.out.println("loeschenLeerzeichen(\"Susi Sorglos sitzt\") ergibt " +
				MeinStringAnalysierer.loeschenLeerzeichen("Susi Sorglos sitzt"));
		System.out.println("loeschenLeerzeichen(null) ergibt " +
				MeinStringAnalysierer.loeschenLeerzeichen(null));
		System.out.println("istPalindrom(\"Otto\") ergibt " +
				MeinStringAnalysierer.istPalindrom("Otto"));
		System.out.println("istPalindrom(\"Ei nie\") ergibt " +
				MeinStringAnalysierer.istPalindrom("Ei nie"));
		System.out.println("istPalindrom(\"Ein Neger mit Gazelle zagt im Regen nie\") ergibt " +
				MeinStringAnalysierer.istPalindrom("Ein Neger mit Gazelle zagt im Regen nie"));
		System.out.println("istPalindrom(\"\") ergibt " +
				MeinStringAnalysierer.istPalindrom(""));
		System.out.println("links(15,3) ergibt \"" +
				MeinStringAnalysierer.links(15,3) + "\"");
		System.out.println("links(150,3) ergibt \"" +
				MeinStringAnalysierer.links(150,3) + "\"");
		System.out.println("links(1500,3) ergibt \"" +
				MeinStringAnalysierer.links(1500,3) + "\"");
		System.out.println("rechts(15,3) ergibt \"" +
				MeinStringAnalysierer.rechts(15,3) + "\"");
		System.out.println("rechts(150,3) ergibt \"" +
				MeinStringAnalysierer.rechts(150,3) + "\"");
		System.out.println("rechts(1500,3) ergibt \"" +
				MeinStringAnalysierer.rechts(1500,3) + "\"");
		System.out.println("ZaehleBuchstaben(\"Hallo Müller06\") ergibt " +
				MeinStringAnalysierer.zaehleBuchstaben("Hallo Müller06"));
		System.out.println("ZaehleBuchstaben(null) ergibt " +
				MeinStringAnalysierer.zaehleBuchstaben(null));
		System.out.println("zaehleNichtBuchstaben(\"Hallo Müller06\") ergibt " +
				MeinStringAnalysierer.zaehleNichtBuchstaben("Hallo Müller06"));
		System.out.println("zaehleNichtBuchstaben(null) ergibt " +
				MeinStringAnalysierer.zaehleNichtBuchstaben(null));
		System.out.println("zaehleZeichen(\"Alle Bananen sind krumm!\", 'a') ergibt " +
				MeinStringAnalysierer.zaehleZeichen("Alle Bananen sind krumm!", 'a'));
		System.out.println("zaehleZeichen(null, 'a') ergibt " +
				MeinStringAnalysierer.zaehleZeichen(null, 'a'));
		System.out.println("zaehleZeichen(\"Alle Bananen sind krumm!\", 'x') ergibt " +
				MeinStringAnalysierer.zaehleZeichen("Alle Bananen sind krumm!", 'x'));
		System.out.println("loescheZeichenAnPosition(\"Peters@platz\", 6) ergibt " +
				MeinStringAnalysierer.loescheZeichenAnPosition("Peters@platz", 6));
		System.out.println("loescheZeichenAnPosition(\"Peters@platz\", 60) ergibt " +
				MeinStringAnalysierer.loescheZeichenAnPosition("Peters@platz", 60));
		System.out.println("loescheZeichenAnPosition(null, 6) ergibt " +
				MeinStringAnalysierer.loescheZeichenAnPosition(null, 60));
		System.out.println("loescheZeichen(\"Ein Keller\", 'e') ergibt " +
				MeinStringAnalysierer.loescheZeichen("Ein Keller", 'e'));
		System.out.println("loescheZeichen(\"Ein Keller\", 'x') ergibt " +
				MeinStringAnalysierer.loescheZeichen("Ein Keller", 'x'));
		System.out.println("loescheZeichen(null, 'x') ergibt " +
				MeinStringAnalysierer.loescheZeichen(null, 'x'));
		System.out.println("loescheStringAnPosition(\"Hallo Leute!\", 6, 5) ergibt " +
				MeinStringAnalysierer.loescheStringAnPosition("Hallo Leute!", 6, 5));
		System.out.println("loescheStringAnPosition(\"AG\", 0, 2) ergibt " +
				MeinStringAnalysierer.loescheStringAnPosition("AG", 0, 2));
		System.out.println("loescheStringAnPosition(\"AG\", 30, 1) ergibt " +
				MeinStringAnalysierer.loescheStringAnPosition("AG", 30, 1));
		System.out.println("loescheString(\"HHallallo Leute-HALLHallo\", \"Hall\")) ergibt " +
				MeinStringAnalysierer.loescheString("HHallallo Leute-HALLHallo", "Hall"));
		System.out.println("loescheString(\"HHall\", \"Hall\")) ergibt " +
				MeinStringAnalysierer.loescheString("HHall", "Hall"));
		System.out.println("loescheString(\"HallHall\", \"Hall\")) ergibt " +
				MeinStringAnalysierer.loescheString("HallHall", "Hall"));
	}
}
