//********************************************************************
// Dictionary.java
//
// Represents a dictionary, which is a book. Used to demonstrate
// inheritance.
//********************************************************************

public class Dictionary extends Book {

	private int definitions = 52500;

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