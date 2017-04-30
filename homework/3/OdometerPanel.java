//********************************************************************
// OdometerPanel.java
//
// Programming Project 8.23 on page 465.
//********************************************************************

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OdometerPanel extends JPanel {

	private JLabel distanceLabel;
	private int distance = 0;
	private int[] previousPosition;

	public OdometerPanel() {
		addMouseMotionListener(new MouseMotionListener());

		distanceLabel = new JLabel("");
		previousPosition = new int[] {0, 0};

		setDistanceText();

		add(distanceLabel);

		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(275, 275));
	}

	public int getDistance(int x1, int y1, int x2, int y2) {
		return (int) Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
	}

	public void setDistanceText() {
		distanceLabel.setText("Distance: " + distance);
	}

	public int[] getPreviousPosition() {
		return previousPosition;
	}

	public void setPreviousPosition(int x, int y) {
		previousPosition = new int[] {x, y};
	}

	private class MouseMotionListener extends MouseMotionAdapter {

		public void mouseMoved(MouseEvent e) {
			if(new int[] {e.getX(), e.getY()} != previousPosition) {
				distance += getDistance(getPreviousPosition()[0], getPreviousPosition()[1], e.getX(), e.getY());
				setDistanceText();
			}

			setPreviousPosition(e.getX(), e.getY());
			System.out.println(e.getX() + ", " + e.getY());
		}

	}

}