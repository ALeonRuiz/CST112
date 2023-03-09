package p1_string_operations;

public class Main {

	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "hello";
		String str3 = "Hi";
		
		System.out.println(str1.length());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str3 == str2);// == compares memory addresses
		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println("----------------");
		System.out.println(str1.indexOf("w"));
		System.out.println(str1.charAt(0));
		System.out.println((char)65);
		System.out.println((int)'A');
		System.out.println("  hello  ".trim());
		System.out.println("-----------------");
		char c1 = 'A';
	}

}
