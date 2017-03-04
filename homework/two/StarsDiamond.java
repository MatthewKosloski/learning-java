//********************************************************************
// StarsDiamond.java
//
// Programming Project 6.7c on page 323.
//********************************************************************

public class StarsDiamond {
	public static void main(String[] args) {

		final char ASTERISK = '*';
		final char SPACE = ' ';
		final int ROWS = 10;

		for(int c = 0; c < ROWS; c++) {
			for(int r = 1; r < ROWS; r++) {
				if(c < ROWS/2 && r <= (ROWS/2 - 1) - c || c < ROWS/2 && r >= (ROWS/2 + 1) + c || c > ROWS/2 && r <= (ROWS/2 + c) - ROWS || c > ROWS/2 && r >= Math.abs((-ROWS/2 + c) - ROWS)){
					System.out.print(SPACE);
				} else {
					System.out.print(ASTERISK);
				}
			}
			System.out.println();
		}
	}
}