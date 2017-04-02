//********************************************************************
// VariableParameters.java
//
// Demonstrates the use of a variable length parameter list.
//********************************************************************

public class VariableParameters {

	/*
		Creates two Family objects using a constructor that accepts
		a variable number of String objects as parameters.
	*/
	public static void main(String[] args) {
		
		Family lewis = new Family("Adam", "Jack", "Phil");
		Family camden = new Family("John", "Hannah", "Matthew", "Peter");

		System.out.println(lewis);
		System.out.println();
		System.out.println(camden);

	}

}