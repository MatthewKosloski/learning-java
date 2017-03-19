//********************************************************************
// CompareFloats.java
//
// Demonstrates comparing two floating point numbers.
//********************************************************************

import java.util.Scanner;

public class CompareFloats {
	public static void main(String[] args) {

		final double TOLERANCE = 0.00001;
		double num1, num2;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter in a floating point number:");
		num1 = scan.nextFloat();

		System.out.print("Enter in another floating point number:");
		num2 = scan.nextFloat();

		if(Math.abs(num1 - num2) < TOLERANCE) {
			System.out.println("Numbers are essentially equal.");
		} else {
			System.out.println("Numbers are NOT equal.");
		}


	}
}
