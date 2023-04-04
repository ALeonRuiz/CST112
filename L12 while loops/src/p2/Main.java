package p2;

public class Main {

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("hi");
			int rand = (int)(Math.random() * 10) + 1;
			if(rand == 5) {
				continue;
			}
			System.out.println("Bye\n");
		}
	}

}
