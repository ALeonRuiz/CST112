package p4_dice;

import java.util.Scanner;

public class DiceApp {

	public static void main(String[] args) {
		// Continuously playing the game by asking the user to guess a number
		// if the number matches the one randomly generated, stop the game
		// display congratulations. If 0 is entered, the game also stops.
		Scanner kb = new Scanner(System.in);
		while (true) {

			int rand = (int) (Math.random() * 6) + 1;
			System.out.println("The dice is casted. Guess the number: ");
			int guess = kb.nextInt();
			if (guess == 0) {
				System.out.println("You stopped the game.");
				break;
			}
			if (guess == rand) {
				System.out.println("Congratulations.");
				break;
			} else {
				System.out.println("The guess is incorrect.\n");
			}
		}
	}

}
