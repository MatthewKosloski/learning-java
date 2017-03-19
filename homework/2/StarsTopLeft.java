//********************************************************************
// StarsTopLeft.java
//
// Programming Project 6.7a on page 323.
//********************************************************************

public class StarsTopLeft {
	public static void main(String[] args) {

		final char ASTERISK = '*';
		final int ROWS = 10;

		for(int i = 0; i < ROWS; i++) {
			for(int j = 0; j < (ROWS - i); j++) {
				System.out.print(ASTERISK);
			}
			System.out.println();
		}
	}
}