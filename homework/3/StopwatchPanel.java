import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class StopwatchPanel extends JPanel {

	private Timer timer;
	private JLabel timeLabel;
	private JButton start, stop;
	private double seconds;

	public StopwatchPanel() {
		ButtonListener btnListener = new ButtonListener();

		timer = new Timer(100, new TimerListener());
		seconds = 0.0;

		timeLabel = new JLabel(getTime());
		start = new JButton("Start");
		stop = new JButton("Stop");

		add(timeLabel);
		add(start);
		add(stop);

		start.addActionListener(btnListener);
		stop.addActionListener(btnListener);
		setPreferredSize(new Dimension(250, 80));
	}

	public String getTime() {
		NumberFormat fmt = new DecimalFormat("0.#"); 
		String time = "";
		time += fmt.format(seconds);
		return time;
	}

	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			seconds += 0.1;
			timeLabel.setText(getTime());
		}
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			Object src = e.getSource();

			if(src == start) {
				System.out.println("Start.");
				timer.start();
			} else if(src == stop) {
				System.out.println("Stop.");
				timer.stop();
			}
		}
	}

}