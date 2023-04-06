package p7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter number " + (i + 1) + ": ");
			int number = scanner.nextInt();
			if(number > max) {
				max = number;
			}
			if(number < min) {
				min = number;
			}
		}
		System.out.println("The largest number is: " + max);
		System.out.println("The smallest number is: " + min);
	}

}
