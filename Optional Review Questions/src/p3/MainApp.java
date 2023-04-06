package p3;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		double temp = getTempInFahrenheit();
		double tempInCelsius = convertToCelsius(temp);
		showResult(tempInCelsius);
	}
	
	public static void showResult(double temp) {
		if(isBelowFreezing(temp)) {
			System.out.println("It is below freezing!");
		} else {
			System.out.println("It is not below freezing!");
		}
	}
	
	public static boolean isBelowFreezing(double tempInCelsius) {
		if(tempInCelsius <= 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static double convertToCelsius(double temp) {
		return (temp - 32) * 5 / 9;
	}

	public static double getTempInFahrenheit() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		return scanner.nextDouble();
	}

}
