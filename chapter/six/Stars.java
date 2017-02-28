//********************************************************************
// Stars.java
//
// Demonstrates the use of nested for loops.
//********************************************************************

import java.util.Scanner;

public class Stars {
	public static void main(String[] args) {

		final int MAX_ROWS = 10;

		for(int row = 1; row <= MAX_ROWS; row++) {
			for(int star = 1; star <= row; star++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}