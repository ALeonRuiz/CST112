package p5;

public class Main {

	public static void main(String[] args) {
		String s = "Hello";
		for (int i = 0; i < s.length(); i = i + 2) {
			System.out.println(s.charAt(i));
		}
	}

}
