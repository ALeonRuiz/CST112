package p1;

public class MainApp {

	public static void main(String[] args) {
		int n = 1;
		int total = 0;
		while (n <= 100) {
			total += n;
			n++;
		}
		System.out.println("The total is: " + total);
	}

}
