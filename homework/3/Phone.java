//********************************************************************
// Phone.java
//
// Programming Project 7.13 on page 402.
//********************************************************************

import javax.swing.JFrame;

public class Phone {

	// main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Phone");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new PhonePanel());
		frame.pack();
		frame.setVisible(true);
	}

}