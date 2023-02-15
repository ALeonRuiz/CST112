package p3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// send a prompt
		System.out.println("Enter the radius of a circle: ");
		double radius = scanner.nextDouble();

		if (radius < 0) {
			System.out.println("Incorrect radius entered.");
		} else {
			double area = 3.14 * radius * radius;
			
			System.out.printf("The area of radius " + radius + 
					" is: %-10.2f%n",  area);
			
			System.out.println("The area of radius " + radius + 
					String.format(" is: %-10.2f%n", area));
		}

	}

}
