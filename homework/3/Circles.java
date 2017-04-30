//********************************************************************
// Circles.java
//
// Programming Project 8.16 on page 464.
//********************************************************************

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Circles {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Circles");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new CirclesPanel());
		frame.pack();
		frame.setVisible(true);
	}

	private static class CirclesPanel extends JPanel {

		private final int CIRCLE_QUANTITY = 20, PANEL_SIZE = 300;

		public CirclesPanel() {
			setBackground(Color.white);
			setPreferredSize(new Dimension(PANEL_SIZE, PANEL_SIZE));
		}

		public int distance(int x1, int y1, int x2, int y2) {
			return (int) Math.sqrt(Math.pow((y2 - y1), 2) + Math.pow((x2 - x1), 2));
		}

		public void paintComponent(Graphics page) {
			super.paintComponent(page);

			ArrayList<Circle> circles = new ArrayList<Circle>();

			Random random = new Random();

			for(int i = 0; i < CIRCLE_QUANTITY; i++) { 
				int radius = random.nextInt(25 + 1) + 10,
					x = random.nextInt(PANEL_SIZE - (radius * 2)) + 0,
					y = random.nextInt(PANEL_SIZE - (radius * 2)) + 0;
				circles.add(new Circle(x, y, radius));
			}

			for(int i = 0; i < circles.size(); i++) {
				Circle current = circles.get(i);
				boolean isOverlap = false;				
				for(int j = 0; j < circles.size(); j++) {
					if(j != i) {
						int centerDist = distance(current.getCenter()[0], current.getCenter()[1], circles.get(j).getCenter()[0], circles.get(j).getCenter()[1]);
						int radiiSum = (current.radius + circles.get(j).radius);
						if(centerDist < radiiSum) {
							isOverlap = true;
						}
					}
				}	
				page.setColor(isOverlap ? Color.cyan : Color.black);
				page.fillOval(current.x, current.y, current.getDiameter(), current.getDiameter());
			}
		}

		private class Circle {

			public int x, y, radius;

			public Circle(int x, int y, int radius) {
				this.x = x;
				this.y = y;
				this.radius = radius;
			}

			public int[] getCenter() {
				return new int[] {x + radius, y + radius};
			}

			public int getDiameter() {
				return radius * 2;
			}

		}	

	}
}