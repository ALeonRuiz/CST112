package p7;

import java.util.Scanner;

public class LetterPositionApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = kb.nextLine();
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		
		if (number <= name.length() && number > 0)
			System.out.println(name.charAt(number - 1));
		else {
			System.out.println("There is no such letter in the name.");
		}
	}

}
