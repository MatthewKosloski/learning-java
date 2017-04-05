//********************************************************************
// Email.java
//
// Programming Project 4.18 on page 230.
//********************************************************************

import javax.swing.JFrame;

public class Email {

	// main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Email");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new EmailPanel());
		frame.pack();
		frame.setVisible(true);
	}

}