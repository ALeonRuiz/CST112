package p3;

public class RandomCapitalLetterApp {

	public static void main(String[] args) {
		// generate a random number between 65 and 90 inclusive.

		for (int j = 0; j < 10; j++) {
			int randomNumber1 = (int) (Math.random() * 26) + 65;
			//		System.out.print((char) randomNumber1 + " ");
			int randomNumber2;
			String lowercaseLetters = "";
			//		System.out.print((char) randomNumber2 + " ");
			for (int i = 0; i < (int)(Math.random()* 10) + 1; i++) {
				randomNumber2 = (int) (Math.random() * 26) + 97;
				char c = (char) randomNumber2;
				//			lowercaseLetters = lowercaseLetters + c;
				lowercaseLetters += c;
			}
			String newStr = "" + (char) randomNumber1 + lowercaseLetters;
			System.out.println("The new string is: " + newStr);
		}
	}

}
