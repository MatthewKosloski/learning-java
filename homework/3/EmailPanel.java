//********************************************************************
// EmailPanel.java
//
// Panel for the email.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailPanel extends JPanel {

	private final int WIDTH = 450, HEIGHT = 350, FIELD_COLS = 25;
	private final Color BACKGROUND_COLOR = new Color(80, 80, 80);

	private JLabel[] labels;
	private String[] labelTexts;
	private JTextField[] fields;
	private JTextArea messageField;
	private JButton button;

	public EmailPanel() {
		setLayout(new GridLayout(0, 1));

		fields = new JTextField[4];
		labels = new JLabel[5];

		labelTexts = new String[] {"To:", "CC:", "Bcc:", "Subject:", "Message:"};

		for(int i = 0; i < labels.length; i++) { labels[i] = new JLabel(labelTexts[i]); }

		for(int i = 0; i < fields.length; i++) { fields[i] = new JTextField(FIELD_COLS); }

		messageField = new JTextArea();
		button = new JButton("Send");
		button.addActionListener(new ButtonListener());

		add(labels[0]);
		add(fields[0]);
		add(labels[1]);
		add(fields[1]);
		add(labels[2]);
		add(fields[2]);
		add(labels[3]);
		add(fields[3]);
		add(labels[4]);

		add(messageField);
		add(button);

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(BACKGROUND_COLOR);
	}

	private class ButtonListener implements ActionListener {

		// updates the counter and label when the button is pushed
		public void actionPerformed(ActionEvent event) {

			for(int i = 0; i < 4; i++) {
				System.out.println(labels[i].getText() + " " + fields[i].getText());
			}

			System.out.println(labels[4].getText() + " " + messageField.getText());

		}
	}

}