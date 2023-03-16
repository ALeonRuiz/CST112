package p5;

import java.util.Scanner;

public class VowelApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		String letter = kb.nextLine().toUpperCase();

		if (Character.isUpperCase(letter.charAt(0))) {
			switch (letter) {
			case "A", "E", "I", "O", "U", "Y":
				System.out.println("It's a vowel!");
				break;
			default:
				System.out.println("It's a consonant.");
			}
		} else {
			System.out.println("It's not even a letter!");
		}
	}

}
