package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weight: ");
		double weight = scanner.nextDouble();
		System.out.println("Enter the height: ");
		double height = scanner.nextDouble();
		
		double bmi = weight / (height * height);
		System.out.println("Your BMI is: " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("Underweight");
		}else if(bmi >= 18.5 && bmi < 25.0) {
			System.out.println("Normal weight");
		} else if(bmi >= 25.0 && bmi < 30.0) {
			System.out.println("Overweight");
		} else {
			System.out.println("Obese");
		}
	}

}
