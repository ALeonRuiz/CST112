package p6;

public class Main {

	public static void main(String[] args) {
		String s = "Race car";
		
		int spaceLocation = s.indexOf(" ");
		
		if(spaceLocation != -1) {
			s = s.substring(0, spaceLocation) + s.substring(spaceLocation+1);
		}
		
//		System.out.println(s);
		
		String newStr = "";
//		System.out.println(s.charAt(s.length()-1));
//		System.out.println(s.charAt(0));
		for(int i = s.length()-1; i >= 0; i--) {
			newStr = newStr + s.charAt(i);
		}
		
		if(newStr.equalsIgnoreCase(s)) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a Palindrom");
		}
	}

}
