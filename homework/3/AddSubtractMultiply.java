//********************************************************************
// AddSubtractMultiply.java
//
// Programming Project 4.16 on page 230.
//********************************************************************

import javax.swing.JFrame;

public class AddSubtractMultiply {

	// main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Add Subtract Multiply");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new AddSubtractMultiplyPanel());
		frame.pack();
		frame.setVisible(true);
	}

}