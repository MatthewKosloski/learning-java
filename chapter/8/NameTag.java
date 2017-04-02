//********************************************************************
// NameTag.java
//
// Demonstrates the use of command line arguments.
//********************************************************************


// Usage: javac NameTag.java && java NameTag Hola Matthew
public class NameTag {

	/*
		Prints a simple name tag using a greeting and a name that is
 		specified by the user.
	*/
	public static void main(String[] args) {
		System.out.println();
		System.out.println(args[0] + ", my name is " + args[1] + "!!!");
	}

}