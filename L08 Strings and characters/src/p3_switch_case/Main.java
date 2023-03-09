package p3_switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter y for yes or n for no: ");
		String response = scanner.nextLine();

		// y, n, Yes, yes, YES, Yup, NO!, N
		char reply = response.toLowerCase().charAt(0);

		switch (reply) {
		case 'y':
			System.out.println("You answered yes!");
			break;
		case 'n':
			System.out.println("You answered no!");
			break;
		default: //catch all
			System.out.println("You answered neither.");
		}
		
		
//		if(reply == 'y') {
//			System.out.println("You answered yes!");
//		} else if(reply == 'n') {
//			System.out.println("You answered no!");
//		} else {
//			System.out.println("You answered neither yes nor no.");
//		}
	}

}
