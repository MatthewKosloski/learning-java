//********************************************************************
// Facts.java
//
// Demonstrates the use of the string concatenation operator and the
// automatic conversion of an integer to a string.
//********************************************************************

public class Facts {
	public static void main(String[] args) {
		System.out.println("We present the following facts"
				+ " for your edification:");
		
		// A blank line
		System.out.println();
		
		// A string can contain numeric digits
		System.out.println("Letters in the Hawaiian alphabet: 12");
		
		// A numeric value can be concatenated to a string
		System.out.println("Dialing code for Antarctica: " + 672);
		
		System.out.println("Year in which da Vinci invented" 
				+ "the parachute: " + 1515);
		
		System.out.println("Tom is " + 42 + " years old.");
		
	}
}