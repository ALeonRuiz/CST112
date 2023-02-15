package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two letter grades (A, B, C, D, or F: ");
		String g1 = scanner.next();
		String g2 = scanner.next();
		
		if(g1.compareTo(g2) < 0) {
			System.out.println("Your grades are getting worse.");
		} else if(g1.compareTo(g2) == 0) {
			System.out.println("Your grades are the same.");
		} else {
			System.out.println("your grades are improving.");
		}
	}

}
