package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String wordPool = "How are you? Fine, thanks!";
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter a word: ");
		String word = scanner.nextLine().toUpperCase();

		boolean isInPool = wordPool.toUpperCase().indexOf(word) != -1;
//		if(isInPool) {
//			System.out.println("In the pool.");
//		} else {
//			System.out.println("NOT in the pool.");
//		}
		
		//Types allowed in switch case: int, char, String, enum, 
		// double, boolean

		switch (String.valueOf(isInPool)) {
		case "true":
			System.out.println("In the pool.");
			break;
		case "false":
			System.out.println("NOT in the pool.");
			break;
		default:
			System.out.println("Not valid.");
		}

	}

}
