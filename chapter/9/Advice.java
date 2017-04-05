//********************************************************************
// Advice.java
//
// Represents some thoughtful advice. Used to demonstrate the use
// of an overridden method.
//********************************************************************

public class Advice extends Thought {

	// Prints a message.  This method overrides the parent's version.
	public void message(String str) {
		System.out.println(str);

		System.out.println();

		super.message("I believe I am a great parent!"); // invokes the parent's version
	}

}