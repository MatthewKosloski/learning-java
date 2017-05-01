import javax.swing.*;

public class CatchTheCreature {

	// main program frame
	public static void main(String[] args) {
		JFrame frame = new JFrame("Catch-The-Creature");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new CatchTheCreaturePanel());
		frame.pack();
		frame.setVisible(true);
	}

}