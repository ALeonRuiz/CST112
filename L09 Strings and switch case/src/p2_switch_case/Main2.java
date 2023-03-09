package p2_switch_case;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// print a menu
		String format = "%-5d%10S%10.2f%n";
		System.out.printf(format, 1, "Beef", 19.99);
		System.out.printf(format, 2, "Fish", 29.99);
		System.out.printf(format, 3, "Chicken", 16.99);
		System.out.printf(format, 4, "Pork", 17.99);
		System.out.printf(format, 5, "Veggie", 9.99);
		System.out.println("-------------------------");
		System.out.println("Enter the item number: ");
		int choice = scanner.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("You selected Beef");
			break;
		case 2:
			System.out.println("You selected Fish");
			break;
		case 3:
			System.out.println("You selected Chicken");
			break;
		case 4:
			System.out.println("You selected Pork");
			break;
		case 5:
			System.out.println("You selected Veggie");
			break;
		default: // catch all
			System.out.println("Invalid selection");
		}
	}

}
