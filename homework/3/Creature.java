import javax.swing.ImageIcon;
import java.awt.*;
import java.util.Random;

public class Creature {

	private int x, y;
	private ImageIcon image;
	private Random generator;

	public Creature(String file) {
		image = new ImageIcon(file);
		generator = new Random();
	}

	public void paint(Component c, Graphics g) {
		image.paintIcon(c, g, x, y);
	}

	public void move(int limitX, int limitY) {
		setX(range(0, limitX - getWidth()));
		setY(range(0, limitY - getHeight()));
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return image.getIconWidth();
	}

	public int getHeight() {
		return image.getIconHeight();
	}

	public boolean isInVacinity(int x, int y) {
		if((x >= this.x && x <= (this.x + getWidth())) && (y >= this.y && y <= (this.y + getHeight()))){
			return true;
		} else {
			return false;
		}
	}

	private int range(int min, int max) {
		return generator.nextInt(max + 1) + min;
	}

}