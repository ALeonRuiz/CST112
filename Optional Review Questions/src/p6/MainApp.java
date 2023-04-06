package p6;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		int n = getNumber();
		int total = addAll(n);
		System.out.println("The total is: " + total);
	}

	private static int addAll(int n) {
		int total = 0;
		for(int i = 1; i <= n; i++) {
			total = total + i;
		}
		return total;
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return scanner.nextInt();
	}
}
