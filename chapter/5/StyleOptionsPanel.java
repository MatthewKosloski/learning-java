//********************************************************************
// StyleOptionsPanel.java
//
// Demonstrates the use of check boxes.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StyleOptionsPanel extends JPanel {

	private JLabel saying;
	private JCheckBox bold, italic;

	/*Sets up a panel with a label and some check boxes that
	control the style of the label's font.*/

	public StyleOptionsPanel() {
		saying = new JLabel("Lorem ipsum dolor sit amet.");
		saying.setFont(new Font("Helvetica Neue", Font.PLAIN, 32));

		bold = new JCheckBox("Bold");
		bold.setBackground(new Color(24, 24, 24));

		italic = new JCheckBox("Italic");
		italic.setBackground(new Color(24, 24, 24));

		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);
		italic.addItemListener(listener);

		add(saying);
		add(bold);
		add(italic);

		setBackground(new Color(58, 58, 58));
		setPreferredSize(new Dimension(400, 300));
	}

	// Represents the listener for both check boxes.
	private class StyleListener implements ItemListener {

		// Updates the style of the label font style
		public void itemStateChanged(ItemEvent event) {
			int style = Font.PLAIN;

			if(bold.isSelected()) {
				style = Font.BOLD;
			} 

			if(italic.isSelected()) {
				style += Font.ITALIC;
			}

			saying.setFont(new Font("Helvetica Neue", style, 32));

		}

	}

}