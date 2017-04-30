//********************************************************************
// Coin.java
//
// Programming Project 7.8 on page 402.
//********************************************************************

public class Coin implements Lockable {
	private final int HEADS = 0;
	private final int TAILS = 1;
	private int face;

	// Lockable
	private int key;
	private boolean isLocked = true;

	// Sets up the coin by flipping it initially
	public Coin() {
		flip();
	}

	// Flips the coin by randomly choosing a face value
	public void flip() {
		if(!isLocked) {
			face = (int) (Math.random() * 2);
		}
	}

	// Returns true if the current face of the coin is heads.
	public boolean isHeads() {
		if(!isLocked) {
			return (face == HEADS);
		} else {
			return false;
		}
	}

	public void setKey(int key) {
		this.key = key;
	}

	public void lock(int key) {
		if(key == this.key) {
			isLocked = true;
		} else {
			isLocked = false;
		}
	}

	public void unlock(int key) {
		if(key == this.key) {
			isLocked = false;
		} else {
			isLocked = true;
		}
	}

	public boolean locked() {
		return isLocked;
	}

	// Returns the current face of the coin as a string.
	public String toString() {
		String faceName = "";
		if(!isLocked) {
			if(face == HEADS) {
				faceName = "Heads";
			} else {
				faceName = "Tails";
			}
		} else {
			faceName = "";
		}
		return faceName;
	}

}