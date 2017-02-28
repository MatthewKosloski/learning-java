//********************************************************************
// Die.java
//
// Represents one die (singular of dice) with faces showing values
// between 1 and 6.
//********************************************************************

public class Die {
	private final int MAX = 6; // maximum face value
	private int faceValue; // current value showing on the die

	// constructor:  sets the initial face value
	public Die() {
		faceValue = 1;
	}

	// rolls the die and returns the result 
	public int roll() {
		faceValue = (int)(Math.random() * MAX) + 1;
		return faceValue;
	}

	// face value mutator
	public void setFaceValue(int value) {
		faceValue = value;
	}

	// face value accessir
	public int getFaceValue() {
		return faceValue;
	}

	// returns a string representation of this die
	public String toString() {
		String result = Integer.toString(faceValue);
		return result;
	}

}