package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name and a GPA: ");
		String name = scanner.next();
		double gpa = scanner.nextDouble();
		
		if(gpa < 0.0 || gpa > 4.0) {
			System.out.println("Invalid GPA!");
		} else {
			System.out.println("Name: " + name + ", GPA: " + gpa);
		}
	}

}
