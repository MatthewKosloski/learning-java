//********************************************************************
// Messages.java
//
// Demonstrates the use of an overridden method.
//********************************************************************

public class Messages {

	// Creates two objects and invokes the message method in each
	public static void main(String[] args) {

		Thought parked = new Thought();
		Advice dates = new Advice();

		parked.message("I feel like I'm a gold fish.");

		dates.message("Don't drink gasoline."); // overridden

	}

}