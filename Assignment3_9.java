package eCollegeJavaOCA;

import java.util.Scanner;

public class Assignment3_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[][] usersPasswords = { { "JavaDuke", "StackOverflow" }, { "JavaBean", "VirtualMachine" },
				{ "TheNullPointer", "LossPrecision" } };

		// user enters the username
		System.out.println("Please enter your usename: ");
		String userNameEntered = sc.next();

		boolean flag = false;

		for (int i = 0; i < usersPasswords.length; i++) {
			if (userNameEntered.equals(usersPasswords[i][0])) {
				flag = true;
				break;
			}
		}

		if (flag) {
			String passwEntered = "";
			int count = 3;
			LABEL1: do {
				System.out.print("Enter your password: ");
				passwEntered = sc.next();
				for (int i = 0; i < usersPasswords.length; i++) {
					if (passwEntered.equals(usersPasswords[i][1])) {
						System.out.println("Log-In Successful.");
						flag = false;
						break LABEL1;
					} else {
						System.out.println("Invalid Login. You have " + --count + " attempt(s) remaining.");
						if (count == 0) {
							System.out.println("Login Failed");
							break LABEL1;
						}
						continue LABEL1;
					}
				}

			} while (flag);



		}


	}

}
