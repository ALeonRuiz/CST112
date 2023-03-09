package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a name, age, GPA, and major: ");
		String name = scanner.next();
		int age = scanner.nextInt();
		double gpa = scanner.nextDouble();
		String major = scanner.next();
		
//		double average = (double)(n1 + n2 + n3) / 3;
//		System.out.printf("%10.2f", average);
		System.out.printf("%10s%10d%10.2f%10s%n", name, age, gpa, major);
		
		
	}

}
