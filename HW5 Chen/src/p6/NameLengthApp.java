package p6;

import java.util.Scanner;

public class NameLengthApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = kb.nextLine();
		System.out.println("Enter last name: ");
		String lastName = kb.nextLine();
		
		if(firstName.length() > lastName.length()) {
			System.out.println("First name is longer");
		} else if (firstName.length() < lastName.length()) {
			System.out.println("Last name is longer");
		} else {
			System.out.println("They are of the same length.");
		}
		
	}

}
