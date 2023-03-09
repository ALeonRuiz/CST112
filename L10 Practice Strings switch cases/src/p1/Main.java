package p1;

public class Main {

	public static void main(String[] args) {
		String s1 = "Hello how are you?";

		boolean hasWord = s1.indexOf("YOU") != -1;
		System.out.println(hasWord);

		// 1. display the number of characters in s1:

//		System.out.println(s1.substring(7));// how are you?
//		System.out.println(s1.substring(7, 10)); // how
//		
//		System.out.println(s1.indexOf(","));
//		System.out.println(s1.indexOf(" "));
//		System.out.println(s1.indexOf(" ", 7));
		System.out.println("Hello location: " + s1.indexOf("hello"));

		// display the third word regardless how long the first two words are
		int start = s1.indexOf(" ", s1.indexOf(" ") + 1) + 1;
		int end = s1.indexOf(" ", start);
		String thirdWord = s1.substring(start, end);
		System.out.println("Third word before conversion:");
		System.out.println(thirdWord);

		// change the third word so it starts with a capital letter and the rest
		// lowercase
		String s2 = thirdWord.substring(0, 1).toUpperCase();
		String s3 = thirdWord.substring(1).toLowerCase();
		thirdWord = s2 + s3;
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Third word after conversion:");
		System.out.println(thirdWord);

	}

}
