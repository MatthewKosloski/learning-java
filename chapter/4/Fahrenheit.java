//********************************************************************
// Fahrenheit.java
//
// Demonstrates the use of text fields.
//********************************************************************

import javax.swing.JFrame;

public class Fahrenheit {

	// create the main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Fahrenheit to Celcius");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new FahrenheitPanel());
		frame.pack();
		frame.setVisible(true);
	}

}