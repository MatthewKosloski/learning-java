//********************************************************************
// Student.java
//
// Programming Project 7.3 on page 401.
//********************************************************************

public class Student {

	private String firstName, lastName;
	private int[] testScores;
	// Constructor: Sets up this student with the specified values.
	public Student(String first, String last, int[] scores) {
		firstName = first;
		lastName = last;
		testScores = scores;
	}

	public int getAverage() {
		int average = 0;
		for(int i = 0; i < testScores.length; i++) {
			average += testScores[i];
		}
		return average / testScores.length;
	}

	// Returns a string description of this Student object.
	public String toString() {
		String result;
		result = lastName + ", " + firstName + "\n";
		return result;
	}

}