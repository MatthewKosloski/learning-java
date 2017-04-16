//********************************************************************
// CreatingExceptions.java
//
// Demonstrates the ability to define an exception via inheritance.
//********************************************************************

import java.util.Scanner;

public class CreatingExceptions {

	// Creates an exception object and possibly throws it
	public static void main(String[] args) throws OutOfRangeException {
		final int MIN = 25, MAX = 40;

		Scanner scan = new Scanner(System.in);

		OutOfRangeException problem = new OutOfRangeException("Input value is out of range.");

		System.out.print("Enter an integer value between " + MIN +
		" and " + MAX + ", inclusive: ");

		int value = scan.nextInt();

		// Determine if the exception should be thrown
		if (value < MIN || value > MAX) {
			throw problem;
		}

		// may never reach
		System.out.println("End of main method.");  

	}

}