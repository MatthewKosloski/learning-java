//********************************************************************
// Hourglass.java
//
// Programming Project 1.9 on page 81.
//
//********************************************************************

public class Hourglass {
	public static void main(String[] args) {

		// CH = character to be displayed, NL = newline escape sequence 
		final char CH = '#';
		final String NL = "\n";

		String 
			one = "    " + CH + NL, 
			three = "   " + CH + CH + CH + NL,  
			five = "  " + CH + CH + CH + CH + CH + NL,  
			seven = " " + CH + CH + CH + CH + CH + CH + CH + NL,
			nine = "" + CH + CH + CH + CH + CH + CH + CH + CH + CH + NL;

		System.out.println(nine + seven + five + three + one + three + five + seven + nine);
	}
}