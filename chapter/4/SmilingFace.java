//********************************************************************
// SmilingFace.java
//
// Demonstrates the use of a separate panel class.
//********************************************************************

import javax.swing.JFrame;

public class SmilingFace {

	// creates the main frame of the program
	public static void main(String[] args) {
		JFrame frame = new JFrame("Smiling Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new SmilingFacePanel());

		frame.pack();
		frame.setVisible(true);
	}

}