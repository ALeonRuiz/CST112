package p4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str = getString();
		if(isPalindrome(str)) {
			System.out.println("It is a palindrome.");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
	
	public static boolean isPalindrome(String s) {
		String revStr = "";
		for(int i = s.length()-1; i >= 0; i--) {
			revStr = revStr + s.charAt(i);
		}
		if(revStr.equals(s)) {
			return true;
		} else {
			return false;
		}
	}

	public static String getString() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		return scanner.nextLine();
	}
}
