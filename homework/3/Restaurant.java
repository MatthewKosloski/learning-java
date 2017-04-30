//********************************************************************
// Restaurant.java
//
// Programming Project 7.14 on page 402.
//********************************************************************

import javax.swing.*;

public class Restaurant {

	// main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Restaurant");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new RestaurantPanel());
		frame.pack();
		frame.setVisible(true);
	}

}