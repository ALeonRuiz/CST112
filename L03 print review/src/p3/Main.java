package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the rate of increase: ");
		double rate = scanner.nextDouble();

		scanner.nextLine();// consumes the enter key signal left from the last statement

		System.out.println("Enter dish 1:");
		String dish1 = scanner.nextLine();

		System.out.println("Enter dish 2:");
		String dish2 = scanner.nextLine();

		System.out.println("Enter dish 3:");
		String dish3 = scanner.nextLine();

		System.out.println("Enter price 1:");
		double price1 = scanner.nextDouble() * (1 + rate);

		System.out.println("Enter price 2:");
		double price2 = scanner.nextDouble() * (1 + rate);

		System.out.println("Enter price 3:");
		double price3 = scanner.nextDouble() * (1 + rate);

		int itemNumber = 0;
		String line = "----------------------------------------------------------";
		String format = "%5d.%10s%10.2f%4s%5d.%10s%10.2f%n";

		System.out.println("\t\t\tABC Pizzaria");
		System.out.println("\t\t\t(631)123-4567");
		System.out.println(line);
		System.out.printf(format, ++itemNumber, dish1, price1, "  |", ++itemNumber, dish2, price2);// post-increment
		System.out.println(line);
		System.out.printf(format, ++itemNumber, dish3, price3, "  |", ++itemNumber, dish1, price1);
		System.out.println(line);
		System.out.printf(format, ++itemNumber, dish2, price2, "  |", ++itemNumber, dish3, price3);
		System.out.println(line);

	}

}
