package p1_intro;

public class Main {

	public static void main(String[] args) {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("hi");
//		}
//		int n = 5;
//		while(n < 10) {
//			System.out.println("Hi");
//			n--;
//		}
//		System.out.println("Bye");
		
		int n = 5;
		
		while(true) {
			System.out.println("hi");
			n++;
			if(n == 10) {
				break; // break allows you to get out a loop of any kind
			}
			if(n == 6) {
				continue; // continue allows to skip the remaining statements
			}				// in this iteration and start a new interation
			System.out.println("n = " + n);
		}
		
		System.out.println("Bye");
		
	}

}
