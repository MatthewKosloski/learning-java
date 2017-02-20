//********************************************************************
// CompareObjects.java
//
// Comparing strings.
//********************************************************************

public class CompareObjects {
	public static void main(String[] args) {

		String name1 = "Adam";
		String name2 = "Matthew";

		// Determines whether the characters name1 and name2 contain are an exact match
		if(name1.equals(name2)) {
			System.out.println("Names are equal.");
		} else {
			System.out.println("Names are NOT equal.");
		}

		// Determines the relative ordering of the strings
		if(name1.compareTo(name2) < 0) {
			System.out.println(name1 + " comes before " + name2);
		} else if(name1.compareTo(name2) > 0) {
			System.out.println(name2 + " comes before " + name1);
		} else {
			System.out.println(name1 + " is equal to " + name1);
		}

		/*
			(name1 == name 2) 
			Tests to see whether both reference variables refer to the same String object
		*/


	}
}
