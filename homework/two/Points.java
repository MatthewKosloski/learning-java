//********************************************************************
// Points.java
//
// Programming Project 6.21 on page 325.
//********************************************************************

import javax.swing.JFrame;

public class Points {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Programming Project 6.21");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new PointsPanel());
		frame.pack();
		frame.setVisible(true);

	}
}