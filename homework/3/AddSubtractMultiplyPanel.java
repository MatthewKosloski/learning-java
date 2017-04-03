//********************************************************************
// AddSubtractMultiplyPanel.java
//
// JPanel for PP 4.16 (AddSubtractMultiply).
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AddSubtractMultiplyPanel extends JPanel {

	private JButton addBtn, subtractBtn, multiplyBtn;
	private JPanel buttonPanel, textPanel;
	private JLabel currentValue;

	private int count = 1;

	private final Color BACKGROUND_COLOR = new Color(60, 60, 60);
	private final int WIDTH = 300, HEIGHT = 75;

	public AddSubtractMultiplyPanel() {

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(0, 3));
		buttonPanel.setBackground(BACKGROUND_COLOR);

		textPanel = new JPanel();
		textPanel.setLayout(new GridLayout(0, 1));
		textPanel.setBackground(BACKGROUND_COLOR);

		addBtn = new JButton("Add");
		subtractBtn = new JButton("Subtract");
		multiplyBtn = new JButton("Multiply");
		currentValue = new JLabel(getCurrentValueText(count));

		ButtonListener listener = new ButtonListener();

		addBtn.addActionListener(listener);
		subtractBtn.addActionListener(listener);
		multiplyBtn.addActionListener(listener);

		buttonPanel.add(addBtn);
		buttonPanel.add(subtractBtn);
		buttonPanel.add(multiplyBtn);

		textPanel.add(currentValue);

		add(buttonPanel);
		add(textPanel);

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(BACKGROUND_COLOR);
	}

	public String getCurrentValueText(int count) {
		return "Current value: " + count; 
	}

	// represents the listener for buttons
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent event) {
			Object source = event.getSource();

			if(source == addBtn) {
				count += 5;
				currentValue.setText(getCurrentValueText(count));
			} else if(source == subtractBtn) {
				count -= 5;
				currentValue.setText(getCurrentValueText(count));
			} else if(source == multiplyBtn) {
				count *= 5;
				currentValue.setText(getCurrentValueText(count));
			}

		}

	}

}
