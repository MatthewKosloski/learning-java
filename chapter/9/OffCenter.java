//********************************************************************
// OffCenter.java
//
// Demonstrates the use of an event adapter class.
//********************************************************************

import javax.swing.*;

public class OffCenter {

	// Creates the main frame of the program
	public static void main(String[] args) {
		JFrame frame = new JFrame("Off Center");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new OffCenterPanel());
		frame.pack();
		frame.setVisible(true);
	}

}