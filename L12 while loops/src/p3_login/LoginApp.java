package p3_login;

import java.util.Scanner;

public class LoginApp {

	public static void main(String[] args) {
		String username = "user1";
		String password = "Pass1";

		Scanner kb = new Scanner(System.in);

		while (true) {
			System.out.print("Enter a username: ");
			String userN = kb.nextLine();
			System.out.print("Enter a password: ");
			String userP = kb.nextLine();

			if (userN.equalsIgnoreCase(username) && userP.equals(password)) {
				System.out.println("Congratulations!");
				break;
			} else {
				if(!userN.equalsIgnoreCase(username) && !userP.equals(password)) {
					System.out.println("Both username and password are incorrect.");
				} else if(userN.equalsIgnoreCase(username)) {
					System.out.println("The password is incorrect.");
				} else {
					System.out.println("The username is incorrect.");
				}
				
			}

		}
	}

}
