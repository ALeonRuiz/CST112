package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		System.out.println("Enter your GPA: ");
		double gpa = scanner.nextDouble();
		
		scanner.nextLine();
		
		System.out.println("Enter your major: ");
		String major = scanner.nextLine();
		
		System.out.printf("%-10S%10S%10S%n", "Name", "gpa", "Major");
		System.out.println("---------------------------------------------");
		System.out.printf("%-10s%10.2f%10S%n", name, gpa, major);
	}

}
