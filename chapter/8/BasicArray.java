//********************************************************************
// BasicArray.java
//
// Demonstrates basic array declaration and use.
//********************************************************************

public class BasicArray {

	/*Creates an array, fills it with various integer values,
 	modifies one value, then prints them out.*/
	public static void main(String[] args) {
		
		final int LIMIT = 15, MULTIPLE = 10;

		int[] list = new int[LIMIT];

		// Initialize the array values
		for(int i = 0; i < LIMIT; i++) {
			list[i] = i * MULTIPLE;
		}

		list[5] = 999;

		for(int value : list) {
			System.out.println(value + " ");
		}

	}

}