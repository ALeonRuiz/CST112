package p1;

public class Main {

	public static void main(String[] args) {
//		String format = "%-5s%15S%10.2f%n";
		String format2 = "%-5s%10S%10.2f%5s%-5s%10S%10.2f%n";
		System.out.println("            Restaurant");
		System.out.println("          (631) 123-4567");
		System.out.println("          1 Main Street");
		System.out.println("         Selden, NY 11784");
		System.out.println("--------------------------------------------");
		System.out.printf(format2, "1.", "Beef", 19.99, "|", "2.", "Fish", 29.99);
		System.out.printf(format2, "3.", "Veggie", 9.99, "|", "4.", "Chicken", 15.99);
	}

}
