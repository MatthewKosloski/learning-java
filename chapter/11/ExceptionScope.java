//********************************************************************
// ExceptionScope.java
//
// Demonstrates exception propagation.
//********************************************************************

public class ExceptionScope {
		
	// Catches and handles the exception that is thrown in level3.
	public void level1() {
		System.out.println("Level1 beginning");

		try {
			level2();
		} catch(ArithmeticException problem) {
			System.out.println();
			System.out.println("The exception message is: " +
			problem.getMessage());
			System.out.println();
			System.out.println("The call stack trace:");
			problem.printStackTrace();
			System.out.println();
		}
		System.out.println("Level1 end");
	}

	// The exception propagates through this method back to level1.
	public void level2() {
		System.out.println("Level 2 beginning");
 		level3();
 		System.out.println("Level 2 end");
	}

	public void level3() {
		int numerator = 10, denominator = 0;
		System.out.println("Level 3 beginning.");
		int result = numerator / denominator;
		System.out.println("Level 3 ending."); 
	}

}