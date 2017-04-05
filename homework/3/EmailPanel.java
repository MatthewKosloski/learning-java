//********************************************************************
// EmailPanel.java
//
// Panel for the email.
//********************************************************************

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailPanel extends JPanel {

	private final int WIDTH = 800, HEIGHT = 600;
	private final Color BACKGROUND_COLOR = new Color(80, 80, 80);

	private JTextField toTextField, ccTextField, bccTextField, subjectTextField;
	private JLabel toLabel, ccLabel, bccLabel, subjectLabel, messageLabel;
	private JPanel toPanel;
	private JTextArea messageTextArea;
	private JButton submitButton;

	public EmailPanel() {

		toPanel = new JPanel();
		toPanel.setLayout(new GridLayout(1, 2));
		toPanel.setBackground(BACKGROUND_COLOR);

		toLabel = new JLabel("To:");
		ccLabel = new JLabel("CC:");
		bccLabel = new JLabel("Bcc:");
		subjectLabel = new JLabel("Subject:");
		messageLabel = new JLabel("Message:");

		toTextField = new JTextField(25);
		ccTextField = new JTextField(25);
		bccTextField = new JTextField(25);
		subjectTextField = new JTextField(25);
		messageTextArea = new JTextArea(25, 50);
		submitButton = new JButton("Submit");

		toPanel.add(toLabel);
		toPanel.add(toTextField);

		add(toPanel);

		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(BACKGROUND_COLOR);
	}

}