//********************************************************************
// Conversion.java
//
// Demonstrates the use of the three conversion techniques:
// assignment conversion, promotion, and casting
//
//********************************************************************

public class Conversion {
	public static void main(String[] args) {
	
		// assignment conversion (widening conversion)
		int dollars = 9;
		float money = dollars;
		System.out.println("Integer 9 converted to a floating number: " + money);

		// promotion conversion
		double a = 10.5, quotient;
		int b = 2; // promoted to floating point
		quotient = a / b;
		System.out.println("Floating point 10.5 divided by integer 2: " + quotient);

		// casting conversion
		double floatingPoint = 10.0;
		int integer = (int) floatingPoint;
		System.out.println("Floating point 10.0 converted to integer 10: " + integer);
	}
}