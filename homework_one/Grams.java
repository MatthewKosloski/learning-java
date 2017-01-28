//********************************************************************
// Grams.java
//
// Programming Project 2.6 on page 135.
//
//********************************************************************

import java.util.Scanner;

public class Grams {
	public static void main(String[] args) {

		final double POUND_TO_GRAM = 453.592;
		double grams, pounds; 

		Scanner scan = new Scanner(System.in);

		System.out.print("Grams: ");
		grams = scan.nextDouble();

		pounds = grams / POUND_TO_GRAM;

		System.out.println("Pounds: " + pounds);
	}
}