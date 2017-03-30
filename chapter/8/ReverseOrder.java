//********************************************************************
// ReverseOrder.java
//
// Demonstrates array index processing.
//********************************************************************

import java.util.Scanner;

public class ReverseOrder {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		double[] numbers = new double[10];

		System.out.println("The size of the array: " + numbers.length);

		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Enter number " + (i+1) + ": ");
			numbers[i] = scan.nextDouble();
		}

		System.out.println("The numbers in reverse order:");

		for(int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}

	}

}