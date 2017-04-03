//********************************************************************
// FahrenheitPanel.java
//
// Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FahrenheitPanel extends JPanel {

	private JLabel inputLabel, outputLabel, resultLabel;
	private JTextField fahrenheit;
	private JButton btn;

	// Constructor: Sets up the main GUI components.
	public FahrenheitPanel() {
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("temperature in Celcius:");
		resultLabel = new JLabel("---");
		btn = new JButton("Convert");

		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener());
		btn.addActionListener(new TempListener());

		add(inputLabel);
		add(fahrenheit);
		add(outputLabel);
		add(resultLabel);
		add(btn);

		setPreferredSize(new Dimension(300, 75));
		setBackground(new Color(50, 50, 50));
	}

	// Represents an action listener for the temperature input field.
	private class TempListener implements ActionListener {
		/*
			Performs the conversion when the enter key is pressed in
        	the text field.
		*/

      	public void actionPerformed(ActionEvent event) {
			int fahrenheitTemp, celciusTemp;

			String text = fahrenheit.getText();

			fahrenheitTemp = Integer.parseInt(text);
			celciusTemp = (fahrenheitTemp - 32) * 5/9;

			resultLabel.setText(Integer.toString(celciusTemp));
      	}

	}

}