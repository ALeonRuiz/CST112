package p1_intro;

import java.util.Scanner;

public class GreetingsApp {

	public static void main(String[] args) {
		int number = getNumber();
		show(number);// number is called argument
		
	}
	
	// display hi the number of times the user specified
	public static void show(int n) {
		for(int i = 0; i < n; i++) {
			System.out.println("Hi");
		}
	}
	
	public static int getNumber() {
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		return kb.nextInt();
	}

}
