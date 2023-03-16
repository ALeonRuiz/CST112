package p1;

import java.util.Scanner;

public class MajorAndYearApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.print("Enter two characters: ");
			String reply = kb.nextLine().toUpperCase();
			char c1 = reply.charAt(0);
			char c2 = reply.charAt(1);

			if (Character.isUpperCase(c1) && Character.isDigit(c2)) {
				if (c1 == 'M') {
					System.out.print("Mathematics ");
				} else if (c1 == 'C') {
					System.out.print("Computer Science ");
				} else if (c1 == 'I') {
					System.out.print("Information Technology ");
				} else {
					System.out.print("Invalid Major ");
				}
				switch (c2) {
				case '1':
					System.out.println("Freshman");
					break;
				case '2':
					System.out.println("Sophomore");
					break;
				case '3':
					System.out.println("Junior");
					break;
				case '4':
					System.out.println("Senior");
					break;
				default:
					System.out.println("Invalid year");
				}
				
			} else {
				System.out.println("Invalid Entry!");
			}
		}
	}

}
