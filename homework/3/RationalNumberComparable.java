//********************************************************************
// RationalNumberComparable.java
//
// Programming Project 7.4 on page 401.
//********************************************************************

public class RationalNumberComparable {

	public static void main(String[] args) {

		double tolerance = 0.0001;
		RationalNumber a = new RationalNumber(6, 8);
		RationalNumber b = new RationalNumber(3, 4);

		if(a.compareTo(b) < tolerance) {
			System.out.println("6/8 is equal to 3/4");
		} else {
			System.out.println("6/8 is NOT equal to 3/4");
		}

	}

}