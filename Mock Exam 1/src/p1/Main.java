package p1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		final double TAX_RATE1 = 0.1;
		final double TAX_RATE_CEILING_FOR_SINGLE = 32000;
		final double TAX_RATE2 = 0.25;
		final double TAX_RATE_CEILING_FOR_NON_SINGLE = 64000;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Are you single? (Y or N) ");
		String maritalStatus = scanner.nextLine();
		System.out.println("Enter the income: ");
		double income = scanner.nextDouble();
		double taxRate;
		
		if (maritalStatus.equalsIgnoreCase("Y")) {
			if (income <= TAX_RATE_CEILING_FOR_SINGLE) {
				taxRate = TAX_RATE1;
			} else {
				taxRate = TAX_RATE2;
			}
		} else {
			if(income <= TAX_RATE_CEILING_FOR_NON_SINGLE) {
				taxRate = TAX_RATE1;
			} else {
				taxRate = TAX_RATE2;
			}
		}
		double tax = taxRate * income;
		// output
		System.out.println("Your tax rate is: " + String.format("%1d%%", (int)(taxRate * 100)));
		System.out.println("The amount of tax you owe is: " + String.format("$%-10.2f", tax));
	}

}
