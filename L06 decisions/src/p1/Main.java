package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int number = scanner.nextInt();
		
		boolean x = 5 <= number;
		
		if(x) {
			System.out.println("The number is great than or equal to 5.");
		} else {
			System.out.println("The number is less than 5.");
		}
		
	}

}
