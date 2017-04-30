//********************************************************************
// RationalNumber.java
//
// Programming Project 7.4 on page 402.
//********************************************************************

public class RationalNumber implements Comparable<RationalNumber> {

	private int numerator, denominator;

	/*Constructor: Sets up the rational number by ensuring a nonzero 
	denominator and making only the numerator signed.*/
	public RationalNumber(int numer, int denom) {
		if(denom == 0) {
			denom = 1;
		}

		// Make the numerator "store" the sign
		if(denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}

	private void reduce() {

		if(numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}

	}

	/*Computes and returns the greatest common divisor of the two
	positive parameters. Uses Euclid's algorithm.*/
	private int gcd(int num1, int num2) {
		while(num1 != num2) {
			if(num1 > num2) {
				num1 = num1 - num2;
			} else {
				num2 = num2 - num1;
			}
		}
		return num1;
	}

	// Returns the numerator of this rational number.
	public int getNumerator() {
		return numerator;
	}

	// Returns the denominator of this rational number.
	public int getDenominator() {
		return denominator;
	}

	@Override public int compareTo(RationalNumber n) {

		double num1 = (double) this.getNumerator();
		double den1 = (double) this.getDenominator();

		double num2 = (double) n.getNumerator();
		double den2 = (double) n.getDenominator();

		double commonDenominator = den1 * den2;

		double div1 = num1/den1;
		double div2 = num2/den2;

		return (int) Math.abs(div1 - div2);
	}

}