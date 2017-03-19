//********************************************************************
// Authority.java
//
// Demonstrates the use of frames, panels, and labels.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class Authority {
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Authority");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel primary = new JPanel();
		primary.setBackground(new Color(122, 122, 122));
		primary.setPreferredSize(new Dimension(400, 300));

		JLabel label1 = new JLabel("Question authority,");
		JLabel label2 = new JLabel("but raise your hand first.");

		primary.add(label1);
		primary.add(label2);

		frame.getContentPane().add(primary);
		frame.pack(); //  sets the frame's size appropriately (better than manually setting dimensions)
		frame.setVisible(true); // display frame on the monitor screen

	}
}