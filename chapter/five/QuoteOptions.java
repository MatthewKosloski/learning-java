//********************************************************************
// QuoteOptions.java
//
// Demonstrates the use of radio buttons.
//********************************************************************

import javax.swing.JFrame;

public class QuoteOptions {

	// Creates and presents the program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("QuoteOptions");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		QuoteOptionsPanel panel = new QuoteOptionsPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}

}