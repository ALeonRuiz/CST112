package p2_switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your letter grade: ");
		String grade = scanner.nextLine();
		
		if(grade.equalsIgnoreCase("A")) {
			System.out.println("Your score is between 90 and 100");
		} else if(grade.equalsIgnoreCase("B")) {
			System.out.println("Your score is between 80 and 90");
		} else if (grade.equalsIgnoreCase("C")) {
			System.out.println("Your score is between 70 and 80");
		} else if (grade.equalsIgnoreCase("D")) {
			System.out.println("Your score is between 60 and 70");
		} else if(grade.equalsIgnoreCase("F")){
			System.out.println("Your score is under 60");
		} else {
			System.out.println("The letter grade is invalid.");
		}
		
//		if(grade =="A") {
//			System.out.println("Your score is between 90 and 100");
//		} else if(grade == "B") {
//			System.out.println("Your score is between 80 and 90");
//		} else if (grade == "C") {
//			System.out.println("Your score is between 70 and 80");
//		} else if (grade == "D") {
//			System.out.println("Your score is between 60 and 70");
//		} else if(grade == "F"){
//			System.out.println("Your score is under 60");
//		} else {
//			System.out.println("The letter grade is invalid.");
//		}
	}

}
