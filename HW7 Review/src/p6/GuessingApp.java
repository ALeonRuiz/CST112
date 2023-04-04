package p6;

import java.util.Scanner;

public class GuessingApp {

	public static void main(String[] args) {
		startTheGame();
	}
	
	public static void startTheGame() {
		int rand = getRandomNumber();
		while(true) {
			int user = getUserNumber();
			if(isFound(rand, user)) {
				System.out.println("You guessed it.");
				break;
			} else {
				if(isTooBig(rand, user)) {
					System.out.println("Your guess is too big!");
				} else {
					System.out.println("Your guess is too small!");
				}
			}
		}
	}
	
	public static boolean isTooBig(int random, int user) {
		return user > random;
	}
	
	public static boolean isFound(int random, int user) {
		return random == user;
	}
	
	public static int getRandomNumber() {
		return (int)(Math.random() * 100);
	}
	
	public static int getUserNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a whole number: ");
		int n = scanner.nextInt();
		return n;
	}

}
