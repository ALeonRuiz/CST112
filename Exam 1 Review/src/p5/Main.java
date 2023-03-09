package p5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a radius of a circle: ");
		double radius = scanner.nextDouble();
		
		if(radius >= 0) {
			System.out.println("The area: " + (3.14 * radius * radius));
		} else {
			System.out.println("Incorrect radius entered.");
		}
	}

}
