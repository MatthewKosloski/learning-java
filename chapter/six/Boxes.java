//********************************************************************
// Boxes.java
//
// Demonstrates the use of loops to draw.
//********************************************************************

import javax.swing.JFrame;

public class Boxes {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Boxes");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		BoxesPanel panel = new BoxesPanel();

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}
}