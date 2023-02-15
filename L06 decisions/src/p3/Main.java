package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num1 = (int)(Math.random() * 11);
		int num2 = (int)(Math.random() * 11);
		int key = num1 + num2;
		
		System.out.println("Enter your answer to the following problem:");
		System.out.println(num1 + " + " + num2 + " = ");
		int userAnswer = scanner.nextInt();
		if(userAnswer == key) {
			System.out.println("Correct!");
		} else {
			System.out.println("Incorrect!");
		}
	}

}
