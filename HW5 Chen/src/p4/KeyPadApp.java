package p4;

import java.util.Scanner;

public class KeyPadApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = kb.nextLine().toLowerCase();
		String number = "";
		switch (letter) {
		case "a", "b", "c":
			number = "2";
			break;
		case "d", "e", "f":
			number = "3";
			break;
		case "g", "h", "i":
			number = "4";
			break;
		case "j", "k", "l":
			number = "5";
			break;
		case "m", "n", "o":
			number = "6";
			break;
		case "p", "q", "r", "s":
			number = "7";
			break;
		case "t", "u", "v":
			number = "8";
			break;
		case "w", "x", "y", "z":
			number = "9";
			break;
		default:
			number = "Invalid key entered.";
		}
		System.out.println("The corresponding number: " + number);
	}

}
