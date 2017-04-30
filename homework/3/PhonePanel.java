//********************************************************************
// PhonePanel.java
//
// Programming Project 7.13 on page 402.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PhonePanel extends JPanel {

	private JPanel buttons;
	private JLabel display;
	private JButton[] phoneButtons;
	private String displayText = " ";
	private JButton clear;

	public PhonePanel() {

		setLayout(new BorderLayout());

		buttons = new JPanel();
		display = new JLabel(displayText);
		phoneButtons = new JButton[9];

		buttons.setLayout(new GridLayout(3, 3));

		ButtonListener listener = new ButtonListener();

		for(int i = 0; i < phoneButtons.length; i++) {
			phoneButtons[i] = new JButton(i+"");
			phoneButtons[i].addActionListener(listener);
			buttons.add(phoneButtons[i]);
		}

		clear = new JButton("Clear");
		clear.addActionListener(listener);
			
		add(display, BorderLayout.NORTH);
		add(buttons, BorderLayout.CENTER);
		add(clear, BorderLayout.EAST);

		setPreferredSize(new Dimension(300, 550));
		setBackground(new Color(80, 80, 80));
	}

	private class ButtonListener implements ActionListener {

		// updates the counter and label when the button is pushed
		public void actionPerformed(ActionEvent event) {

			Object source = event.getSource();

			if(source == clear) {
				displayText = " ";
			} else {
				displayText += event.getActionCommand();
			}

			display.setText(displayText);

		}
	}

}