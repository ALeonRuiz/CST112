package p1_intro;

import java.util.Scanner;

public class TemperatureConverterApp {

	public static void main(String[] args) {
		double celsius = getCelsius();
		double fahrenheit = convertToFahrenheit(celsius);
		showFahrenheit(fahrenheit);
	}
	
	// displays the fahrenheit value converted
	public static void showFahrenheit(double f) {
		System.out.println("The corresponding temperature is: " + f + " in fahrenheit");
	}
	
	// write a method asking the user for a temperature in celsius
	// and then returning it to the caller
	public static double getCelsius() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a temperature in celsius: ");
		return kb.nextDouble();
	}
	
	// write a method that takes in a celsius value and returns fahrenheit
	// c * (9/5) + 32
	public static double convertToFahrenheit(double c) {
		return c * (1.0*9/5) + 32;
	}
}
