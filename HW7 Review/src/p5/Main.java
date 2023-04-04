package p5;

public class Main {

	public static void main(String[] args) {
		System.out.println(removeVowels("hello"));
	}
	
	public static String removeVowels(String str) {
		int index = 0;
		String newStr = "";
		while(index < str.length()) {
			if(!isVowel(str.charAt(index))) {
				newStr += str.charAt(index);
			}
			index++;
		}
		return newStr;
	}
	
	public static boolean isVowel(char c) {
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y') {
			return true;
		} else {
			return false;
		}
	}
	
	

}
