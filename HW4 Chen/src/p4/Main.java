package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for the month: ");
		int m = scanner.nextInt();
		System.out.println("Enter a number for day of the month: ");
		int day = scanner.nextInt();
		String season;
		
		

		if (m == 1 || m == 2 || m == 3) {
			season = "Winter";
		} else if (m == 4 || m == 5 || m == 6) {
			season = "Spring";
		} else if(m == 7 || m == 8 || m == 9 ) {
			season = "Summer";
		} else if (m == 10 || m == 11 || m == 12) {
			season = "Fall";
		} else {
			System.out.println("The number for the month is invalid.");
			season = "invalid";
		}
		
		if(day <= 0 || day > 31) {
			System.out.println("This day entered is invalid");
		} else if (m % 3 == 0 && day >= 21) {
			if(season.equals("Winter")) {
				season = "Spring";
			} else if(season.equals("Spring")) {
				season = "Summer";
			} else if (season.equals("Summer")) {
				season = "Fall";
			} else {
				season = "Winter";
			}
		} else {
			
		}
		
		System.out.println("The season is: " + season);

	}

}
