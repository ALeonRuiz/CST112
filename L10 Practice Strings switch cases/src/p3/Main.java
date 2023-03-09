package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a single digit whole number");
		int n = scanner.nextInt();
		
		String result = switch(n) {
		case 1, 3, 5, 7, 9 -> "ODD";
		case 2, 4, 6, 8 -> "EVEN";
		default -> "Neither";
		};
		
		System.out.println(n + " is a(n) " + result + " number.");
	}

}
