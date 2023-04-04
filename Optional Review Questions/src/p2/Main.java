package p2;

public class Main {

	public static void main(String[] args) {
		createSentences(3);
	}
	
	public static void createSentences(int n) {
		for (int i = 0; i < n; i++) {
			showSentence();
		}
	}
	
	public static void showSentence() {
		String sentence = makeSentence();
		sentence = addPeriod(sentence);
		System.out.println(capitalizeFirstLetter(sentence));
	}
	
	public static String addPeriod(String sentence) {
		return sentence.trim() + ".";
	}
	
	public static String capitalizeFirstLetter(String sentence) {
		sentence = sentence.substring(0,1).toUpperCase() + sentence.substring(1);
		return sentence;
	}

	public static String makeSentence() {
		String sentence = "";
		int rand = 2 + (int) (Math.random() * 9);
		for (int i = 0; i < rand; i++) {
			sentence = getWord() + " " + sentence;
		}
		return sentence;
	}
	
	public static String getWord() {
		String word = "";
		int rand = 1 + (int)(Math.random() * 10);
		for(int i = 0; i < rand; i++) {
			word += getLowerCaseLetter();
		}
		return word;
	}
	
	public static char getLowerCaseLetter() {
		int number = 97 + (int)(Math.random() * 26);
		return (char)number;
	}

}
