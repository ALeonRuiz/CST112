package p3_calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("Enter a math expression: ");
			double n1 = scanner.nextDouble();
			char operator = scanner.next().charAt(0);
			double n2 = scanner.nextDouble();
			System.out.print(n1 + " " + operator + " " + n2 + " = ");
			switch (operator) {
			case '+':
				System.out.println(n1 + n2);
				break;
			case '-':
				System.out.println(n1 - n2);
				break;
			case '*':
				System.out.println(n1 * n2);
				break;
			case '/':
				System.out.println(n1 / n2);
				break;
			default:
				System.out.println("Invalid operator");
			}
			System.out.println();
		}

	}

}
