package p2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter three strings: ");
		String s1 = scanner.next();
		String s2 = scanner.next();
		String s3 = scanner.next();
		
		String smallest;
		String largest;
		String medium;
		
		if(s1.compareTo(s2) <= 0 && s1.compareTo(s3) <= 0) {
			smallest = s1;
			if(s2.compareTo(s3) >= 0) {
				largest = s2;
				medium = s3;
			} else {
				largest = s3;
				medium = s2;
			}
		}  else if(s2.compareTo(s1) <= 0 && s2.compareTo(s3) <= 0) {
			smallest = s2;
			if(s1.compareTo(s3) >= 0) {
				largest = s1;
				medium = s3;
			} else {
				largest = s3;
				medium = s1;
			}
		} else {
			smallest = s3;
			if(s1.compareTo(s2) >= 0) {
				largest = s1;
				medium = s2;
			} else {
				largest = s2;
				medium = s1;
			}
		}
		
		System.out.println(smallest + " " + medium + " " + largest);
	}

}
