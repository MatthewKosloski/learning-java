//********************************************************************
// Geometry.java
// 
// Demonstrates the use of an assignment statement to change the
// value stored in a variable.
//********************************************************************

public class Geometry {

	// Prints the number of sides of several geometric shapes.
	public static void main(String[] args) {
		int sides = 3; // declaration with initialization
		System.out.println("A triangle has " + sides + " sides.");
		sides = sides + 1; // assignment statement
		System.out.println("A square has " + sides + " sides.");
		sides += 4; // assignment statement
		System.out.println("An octagon has " + sides + " sides.");
	}
}