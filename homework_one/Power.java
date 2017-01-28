//********************************************************************
// Power.java
//
// Programming Project 3.4 on page 183.
//
//********************************************************************

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {

		final double E = 2.71828;
		int num;		
		Scanner scan = new Scanner(System.in);

		System.out.print("Integer: ");
		num = scan.nextInt();

		System.out.print(E + " raised to the power of " + num + ": " + Math.pow(E, num));

	}
}