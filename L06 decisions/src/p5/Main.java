package p5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two names: ");
		String str1 = scanner.next();
		String str2 = scanner.next();
		
		if(str1.equals(str2)) {
			System.out.println("They are equal.");
		} else {
			System.out.println("They are not equal.");
		}
		
//		if(str1.compareTo(str2) < 0) {
//			System.out.println(str1 + " is smaller than " + str2);
//		} else if(str1.compareTo(str2) == 0) {
//			System.out.println(str1 + " is equal to " + str2);
//		} else {
//			System.out.println(str1 + " is great than " + str2);
//		}
	}

}
