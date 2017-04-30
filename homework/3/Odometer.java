//********************************************************************
// Odometer.java
//
// Programming Project 8.23 on page 465.
//********************************************************************

import javax.swing.*;

public class Odometer {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mouse Odometer");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new OdometerPanel());
		frame.pack();
		frame.setVisible(true);
	}

}