//********************************************************************
// Parallelogram.java
//
// Programming Project 3.9 on page 184.
//
//********************************************************************

import java.util.Random;

public class Parallelogram {
	public static void main(String[] args) {

		Random r = new Random();

		// b = base, h = height, a = a side
		int b = r.nextInt(30) + 10,
			h = r.nextInt(30) + 10,
			a = r.nextInt(30) + 10;

		int area = b * h, perimeter = 2 * (a + b);

		System.out.println("Area: " + area);
		System.out.println("Perimeter: " + perimeter);

	}
}