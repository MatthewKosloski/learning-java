//********************************************************************
// Slope.java
//
// Programming Project 3.5 on page 183.
//
//********************************************************************

import java.util.Scanner;

public class Slope {
	public static void main(String[] args) {

		int x1, y1, x2, y2, slope;		
		Scanner scan = new Scanner(System.in);

		System.out.print("x1: ");
		x1 = scan.nextInt();

		System.out.print("y1: ");
		y1 = scan.nextInt();

		System.out.print("x2: ");
		x2 = scan.nextInt();

		System.out.print("y2: ");
		y2 = scan.nextInt();

		slope = (y2 - y1) / (x2 - x1);

		System.out.print("Slope: " + slope);

	}
}