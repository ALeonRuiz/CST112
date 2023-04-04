package p4;

public class Main {

	public static void main(String[] args) {
		System.out.println(reverse("Hi"));
	}
	
	public static String reverse(String str) {
		String newStr = "";
		int lastIndex = str.length()-1;
		while(lastIndex >=0) {
			newStr += str.charAt(lastIndex);
			lastIndex--;
		}
		return newStr;
	}

}
