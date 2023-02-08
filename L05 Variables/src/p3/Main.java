package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// casting
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter a real number with fraction: ");
//		double number = scanner.nextDouble();
//		int wholeNumber = (int)number;
//		
//		System.out.printf("%10.2f%10d%n", number, wholeNumber);

//		System.out.println("Enter a whole number: ");
//		int wholeNumber = scanner.nextInt();
//		
//		double realNumber = wholeNumber;
//		System.out.printf("%10d%10.2f%n", wholeNumber, realNumber);
//		int n1 = 7;
//		int n2 = 2;
//
//		System.out.println(1.0 * 7 / 2);
//		System.out.println(7 * 1.0 / 2);
//		System.out.println(7 / 1.0 / 2);
////		System.out.println(7 / 2 * 1.0);
//		System.out.println((double)7 / 2);
//		System.out.println((double)(7 / 2));

		System.out.println(Math.random()); // a random number 0.0 -- 1.0, not including 1.0
		System.out.println(10 + (int)(Math.random() * 11));
	}

}
