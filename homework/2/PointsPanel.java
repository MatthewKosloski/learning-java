//********************************************************************
// PointsPanel.java
//
// Programming Project 6.21 on page 325.
//********************************************************************

import javax.swing.JPanel;
import java.awt.*;
import java.util.Random;

public class PointsPanel extends JPanel {

	private Random generator;
	private final int PANEL_WIDTH = 400;
	private final int PANEL_HEIGHT = 400;
	private final int QUANTITY = 20000;
	private final int POINT_SIZE = 1;

	public PointsPanel() {
		generator = new Random();
		setBackground(new Color(255, 255, 255));
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);

		for(int i = 0; i < QUANTITY; i++) {

			int x = generator.nextInt(400) + 1;
			int y = generator.nextInt(400) + 1;

			if(x <= PANEL_WIDTH / 2) {
				page.setColor(Color.red);
			} else {
				page.setColor(Color.green);
			}
			page.drawLine(x, y, x + POINT_SIZE, y + POINT_SIZE);

		}
	}

}