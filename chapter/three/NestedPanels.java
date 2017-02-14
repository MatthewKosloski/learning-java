//********************************************************************
// NestedPanels.java
//
// Demonstrates a basic component hierarchy.
//********************************************************************

import java.awt.*;
import javax.swing.*;

public class NestedPanels {
	public static void main(String[] args) {
		
		// initial outermost window
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// first subpanel
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(new Color(59, 165, 48)); // green
		JLabel label1 = new JLabel("One");
		subPanel1.add(label1);

		// second subpanel
		JPanel subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(150, 100));
		subPanel2.setBackground(new Color(224, 75, 56)); // red
		JLabel label2 = new JLabel("Two");
		subPanel2.add(label2);

		// primary panel
		JPanel primary = new JPanel();
		primary.setBackground(new Color(66, 110, 214)); // blue
		primary.add(subPanel1);
		primary.add(subPanel2);

		// create the frame by inserting the primary panel
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
	}
}