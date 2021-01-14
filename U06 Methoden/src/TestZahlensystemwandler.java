
public class TestZahlensystemwandler {

	public static void main(String[] args) {

		// Testen der readDigit(char) Methode
		System.out.println("getDigit('0') ergibt " + MeinZahlensystemwandler.getDigit('0'));
		System.out.println("getDigit('1') ergibt " + MeinZahlensystemwandler.getDigit('1'));
		System.out.println("getDigit('9') ergibt " + MeinZahlensystemwandler.getDigit('9'));
		System.out.println("getDigit('A') ergibt " + MeinZahlensystemwandler.getDigit('A'));
		System.out.println("getDigit('B') ergibt " + MeinZahlensystemwandler.getDigit('B'));
		System.out.println("getDigit('Z') ergibt " + MeinZahlensystemwandler.getDigit('Z'));
		System.out.println("getDigit('!') ergibt " + MeinZahlensystemwandler.getDigit('!'));
		System.out.println();

		// Testen der getDigit(int) Methode
		System.out.println("getDigit(0) ergibt " + MeinZahlensystemwandler.getDigit(0));
		System.out.println("getDigit(1) ergibt " + MeinZahlensystemwandler.getDigit(1));
		System.out.println("getDigit(9) ergibt " + MeinZahlensystemwandler.getDigit(9));
		System.out.println("getDigit(10) ergibt " + MeinZahlensystemwandler.getDigit(10));
		System.out.println("getDigit(11) ergibt " + MeinZahlensystemwandler.getDigit(11));
		System.out.println("getDigit(35) ergibt " + MeinZahlensystemwandler.getDigit(35));
		System.out.println("getDigit(37) ergibt " + MeinZahlensystemwandler.getDigit(37));
		System.out.println();

		// Testen der numToDec Methode
		System.out.println("numToDec(\"01110110\", 2) ergibt " + MeinZahlensystemwandler.numToDec("01110110", 2));
		System.out.println("numToDec(\"170712\", 8) ergibt " + MeinZahlensystemwandler.numToDec("170712", 8));
		System.out.println("numToDec(\"170712\", 7) ergibt " + MeinZahlensystemwandler.numToDec("170712", 7));
		System.out.println("numToDec(\"170712\", 7) ergibt " + MeinZahlensystemwandler.numToDec("", 7));
		System.out.println();

		// Testen der decToNum Methode
		System.out.println("decToNum(118, 2) ergibt: " + MeinZahlensystemwandler.decToNum(118, 2));
		System.out.println("decToNum(61898, 8) ergibt: " + MeinZahlensystemwandler.decToNum(61898, 8));
		System.out.println("decToNum(61898, 1) ergibt: " + MeinZahlensystemwandler.decToNum(61898, 1));
		System.out.println();

		// Testen der hexToDec Methode
		System.out.println("hexToDec(\"123AB\") ergibt: " + MeinZahlensystemwandler.hexToDec("123Ab"));
		System.out.println("hexToDec(\"FF\") ergibt: " + MeinZahlensystemwandler.hexToDec("FF"));
		System.out.println("hexToDec(\"123AB\") ergibt: " + MeinZahlensystemwandler.hexToDec("1!"));
		System.out.println("hexToDec(\"123AB\") ergibt: " + MeinZahlensystemwandler.hexToDec("5fg"));
		System.out.println();

		// Testen der decToHex Methode
		System.out.println("decToHex(255) ergibt: " + MeinZahlensystemwandler.decToHex(255));
		System.out.println("decToHex(0) ergibt: " + MeinZahlensystemwandler.decToHex(1000));
		System.out.println();

		// Testen der dualToDec Methode
		System.out.println("dualToDec(\"10010\") ergibt: " + MeinZahlensystemwandler.dualToDec("10010"));
		System.out.println("dualToDec(\"10010\") ergibt: " + MeinZahlensystemwandler.dualToDec("10210"));
		System.out.println("dualToDec(\"10010\") ergibt: " + MeinZahlensystemwandler.dualToDec(""));
		System.out.println();

		// Testen der decToDual Methode
		System.out.println("decToDual(123) ergibt: " + MeinZahlensystemwandler.decToDual(123));
		System.out.println("decToDual(123) ergibt: " + MeinZahlensystemwandler.decToDual(1000));
		System.out.println();
		
		//Testen der numToNum Methode
		System.out.println("numToNum(6, \"34\", 8) ergibt: " + MeinZahlensystemwandler.numToNum(6, "34", 8));
		System.out.println("numToNum(6, \"34\", 8) ergibt: " + MeinZahlensystemwandler.numToNum(12, "A2", 16));
		System.out.println("numToNum(6, \"34\", 8) ergibt: " + MeinZahlensystemwandler.numToNum(12, "12B", 14));
	}

}