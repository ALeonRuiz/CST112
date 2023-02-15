package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three test scores: ");
		int s1 = scanner.nextInt();
		int s2 = scanner.nextInt();
		int s3 = scanner.nextInt();
		
		double average = (s1 + s2 + s3) * 1.0 / 3;
		
		String letterGrade;
		
		if(average >= 90) {
			letterGrade = "A";
		} else if(average >= 80) {
			letterGrade = "B";
		} else if(average >= 70) {
			letterGrade = "C";
		} else if(average >= 60) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		
		System.out.printf("The average is: %-10.2f%n", average);
		System.out.println("The average is: " + String.format("%-10.2f%n", average));
		System.out.println("The letter grade is " + letterGrade);
	}

}
