//*******************************************************************************
// TempConverter.java
// 
// Demonstrates the use of primitive data types and arithmetic
// expressions.
//
// Java numeric primitive types:
//
// TYPE     STORAGE     MIN                            MAX
//
//
// byte     8 bits      -128                           127
//
// short    16 bits     -32,768                        32,767
//
// int      32 bits     –2,147,483,648                 2,147,483,647
//
// long     64 bits     –9,223,372,036,854,775,808     9,223,372,036,854,775,807
//
// float    32 bits     Approximately –3.4E+38        Approximately 3.4E+38
//                      with 7 significant digits     with 7 significant digits
//
// double   64 bits     Approximately –1.7E+308       Approximately 1.7E+308
//                      with 15 significant digits    with 15 significant digits
//*******************************************************************************

public class TempConverter {

	// Prints the number of sides of several geometric shapes.
	public static void main(String[] args) {
		final int BASE = 32;
		final double CONVERSION_FACTOR = 9.0/5.0;

		double fahrenheitTemp;
		int celciusTemp = 33; // value to convert

		fahrenheitTemp = celciusTemp * CONVERSION_FACTOR + BASE;

		System.out.println("Celcius Temperate: " + celciusTemp);
		System.out.println("Farenheit Temperate: " + fahrenheitTemp);
	}
}