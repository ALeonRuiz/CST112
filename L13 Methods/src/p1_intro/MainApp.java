package p1_intro;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) { // void: no data returns to caller
		String name = getName();
		double gpa = getGPA();
		showMessage("Hey, " + name + ", your GPA is " + gpa);
	}
	
	public static double getGPA() {
		Scanner kb = new Scanner(System.in);
		showMessage("Enter your GPA: ");
		double gpa = kb.nextDouble();
		return gpa;
	}
	
	public static String getName() {
		Scanner kb = new Scanner(System.in);
		showMessage("Enter your name: ");
		String name = kb.nextLine();
		return name;
	}
	
	public static void showMessage(String str) {// parameter defines the type of data
		System.out.println(str);
	}

	public static void show() { // no parameters. used for data input
		System.out.println("Hi there.");
		System.out.println("Bye!\n");
	}

}
