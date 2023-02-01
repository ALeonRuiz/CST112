package p2_printf;

public class Main {

	public static void main(String[] args) {
		System.out.printf("%-10S%20d%n", "Hello", 1234567+5);
		System.out.printf("%-10S%20d%n", "Bye", 10);
		System.out.printf("%-10S%20S%n", "Hello", "hi");
		System.out.printf("%-10d%20.0f%n", 100, 123.4567);
		System.out.printf("%-10S%20S%n", "Hello", "hi");
		System.out.printf("%-10S%20S%n", "Bye", "Goodbye");
	}

}
