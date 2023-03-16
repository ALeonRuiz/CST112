package p2;

import java.util.Scanner;

public class SubstringApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter String s1: ");
		String s1 = kb.nextLine();
		System.out.print("Enter String s2: ");
		String s2 = kb.nextLine();
		
		if(s1.indexOf(s2) != -1) {
			System.out.println(s2 + " is a substring of " + s1);
		} else {
			System.out.println(s2 + " is NOT a substring of " + s1);
		}
		
//		if(s1.contains(s2)) {
//			System.out.println(s2 + " is a substring of " + s1);
//		} else {
//			System.out.println(s2 + " is NOT a substring of " + s1);
//		}
	}

}
