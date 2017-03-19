//********************************************************************
// StarsTopRight.java
//
// Programming Project 6.7c on page 323.
//********************************************************************

public class StarsTopRight {
	public static void main(String[] args) {

		final char ASTERISK = '*';
		final char SPACE = ' ';
		final int ROWS = 10;

		for(int i = 0; i <= ROWS; i++) {
			for(int k = 0; k < i + 1; k++) {
				System.out.print(SPACE);
			}
			for(int j = 0; j <= ROWS - (i + 1); j++) {
				System.out.print(ASTERISK);
			}
			System.out.println();
		}
	}
}