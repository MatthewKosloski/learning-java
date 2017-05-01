import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CatchTheCreaturePanel extends JPanel {

	private final int SIZE = 400, DURATION = 100;
	private int catches = 0, misses = 0;
	private JLabel catchesLabel, missesLabel;
	private Creature monkey;
	private Timer timer;
	private int x, y;

	public CatchTheCreaturePanel() {
		timer = new Timer(DURATION, new TimerListener());
		monkey = new Creature("monkey.png");
		catchesLabel = new JLabel("Catches: " + catches);
		missesLabel = new JLabel("Misses: " + misses);

		addMouseListener(new MouseListener());

		add(catchesLabel);
		add(missesLabel);

		setPreferredSize(new Dimension(SIZE, SIZE));
		timer.start();
	}

	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		monkey.paint(this, page);
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			monkey.move(SIZE, SIZE);
			repaint();
		}
	}

	private class MouseListener extends MouseAdapter {
		public void mouseClicked(MouseEvent e) {
			if(monkey.isInVacinity(e.getX(), e.getY())) {
				catches++;
				catchesLabel.setText("Catches: " + catches);
			} else {
				misses++;
				missesLabel.setText("Misses: " + misses);
			}
		}
	}

}