package p8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.println("How many numbers total? ");
		int n = kb.nextInt();
		int total = 0;
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter number " + i + ": ");
			int number = kb.nextInt();
			total = total + number;
		}
		double average = total * 1.0 / n;
		System.out.println("The average is: " + average);
	}

}
