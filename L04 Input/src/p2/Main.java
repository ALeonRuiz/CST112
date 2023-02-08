package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your first name, last name, gpa, age, and major: ");
		String firstName = scanner.next();
		String lastName = scanner.next();
		double gpa = scanner.nextDouble();
		int age = scanner.nextInt();
		String major = scanner.next();
		
		System.out.printf("%10s%10s%10.2f%10d%10S%n", firstName, lastName, gpa, age, major);
	}

}
