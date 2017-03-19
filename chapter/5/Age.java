//********************************************************************
// Age.java
//
// Demonstrates the use of an if statement.
//********************************************************************

import java.util.Scanner;

public class Age {
	public static void main(String[] args) {

		final int MINOR = 21;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your age:");
		int age = scan.nextInt();

		System.out.println("You entered: " + age);

		if(age < MINOR) {
			System.out.println("You are a minor.");
		} else {
			System.out.println("You are NOT a minor.");
		}

	}
}
