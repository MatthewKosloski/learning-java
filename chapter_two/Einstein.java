//********************************************************************
// Einstein.java
//
// Demonstrates a basic applet.
//
//********************************************************************

import javax.swing.JApplet;
import java.awt.*;

public class Einstein extends JApplet {

	// Draws a quotation by Albert Einstein among some shapes.
	public void paint(Graphics ctx) {
		ctx.drawRect(50, 50, 40, 40); // square
		ctx.drawRect(60, 80, 225, 30); // rectangle
		ctx.drawOval(75, 65, 20, 20); // circle
		ctx.drawLine(35, 60, 100, 120); // line
		ctx.drawString("Lorem ipsum dolor sit AMETTT.", 110, 70);
		ctx.drawString("-- Albert Einstein", 130, 100);
	}

}