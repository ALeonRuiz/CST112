package p2;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name: ");
		String name = scanner.nextLine();
		System.out.println("Hi, " + name);
		System.out.println("Bye, " + name);
		
		System.out.println("Enter a GPA: ");
		double gpa = scanner.nextDouble();
		System.out.println(name + ", your GPA is " + gpa);
		
		System.out.println("Enter the curve amount: ");
		double curveAmount = scanner.nextDouble();
		double originalGPA = gpa;
		gpa = gpa + curveAmount;
		System.out.println("The initial GPA: " + originalGPA);
		System.out.println("The curved GPA: " + gpa);
		scanner.nextLine();
		System.out.println("Enter a major: ");
		String major = scanner.nextLine();
		
		System.out.println();
		System.out.printf("%-10s%10.2f%10.2f%10S%n", name, originalGPA, gpa, major);
		
	}

}
