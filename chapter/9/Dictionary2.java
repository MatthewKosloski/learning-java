//********************************************************************
// Dictionary2.java
//
// Represents a dictionary, which is a book. Used to demonstrate
// the use of the super reference.
//********************************************************************

public class Dictionary2 extends Book2 {

	private int definitions;

	/*
	Constructor:  Sets up the dictionary with the specified 
	number of pages and definitions.
	*/
	public Dictionary2(int numPages, int numDefinitions) {
		super(numPages); // calls Book2's constructor
		definitions = numDefinitions;
	}

	// Prints a message using both local and inherited values
	public double computeRatio() {
		return (double) definitions/pages;
	}

	public void setDefinitions(int numDefinitions) {
		definitions = numDefinitions;
	}

	public int getDefinitions() {
		return definitions;
	}

}