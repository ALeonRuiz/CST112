package p1;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int number = scanner.nextInt();
		int start = 1;
		
		do {
			if(start % 2 == 0) {
				System.out.println(start);
			}
			start++;
			
		} while(start <= number);
		
//		while(start <= number) {
//			if(start %2 == 0) {
//				System.out.println(start);
//			}
//			start++;// start = start + 1;
//		}

//		for (int i = 1; i <= number; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}
	}

}
