//********************************************************************
// LabelDemo.java
//
// Demonstrates the use of image icons in labels.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class LabelDemo {
	public static void main(String[] args) {
		
		// initial outermost window
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("face.jpg");

		JLabel label1, label2, label3;

		label1 = new JLabel("Face Left", icon, SwingConstants.CENTER);

		label2 = new JLabel("Face Right", icon, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);

		label3 = new JLabel("Face Above", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(150, 150, 150));
		panel.setPreferredSize(new Dimension(150, 250));
		panel.add(label1);
		panel.add(label2);
		panel.add(label3);

		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);

	}
}