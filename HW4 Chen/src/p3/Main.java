package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter three integers: ");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		
		if((n1 <= n2 && n2 <= n3) || (n1 >= n2 && n2 >= n3)) {
			System.out.println("In Order");
		} else {
			System.out.println("Not in Order");
		}
	}

}
