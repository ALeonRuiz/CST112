package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("It's an even number.");
		} else {
			System.out.println("It's an odd number.");
		}
	}

}
