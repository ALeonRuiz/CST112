package p1;

import java.util.Scanner;

public class MainApp2 {

	public static void main(String[] args) {
		int n = getNumber();
		printEvenNumbers(n);
	}

	public static void printEvenNumbers(int num) {
		for (int i = 1; i <= num; i++) {
			if (isOdd(i)) {
				System.out.println(i);
			}
		}
	}

	public static boolean isOdd(int n) {
		return n % 2 != 0;
//		if (n % 2 != 0) {
//			return true;
//		} else {
//			return false;
//		}
	}

	public static int getNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		return scanner.nextInt();
	}

}
