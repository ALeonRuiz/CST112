package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter three numbers: ");
		double n1 = scanner.nextDouble();
		double n2 = scanner.nextDouble();
		double n3 = scanner.nextDouble();
		System.out.print("\nThe largest number is ");
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println(n1);
		} else if(n2 >= n1 && n2 >= n3) {
			System.out.println(n2);
		} else {
			System.out.println(n3);
		}
	}

}
