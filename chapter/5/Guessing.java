//********************************************************************
// Guessing.java
//
// Demonstrates the use of a block statement in an if-else.
//********************************************************************

import java.util.*;

public class Guessing {
	public static void main(String[] args) {

		final int MAX = 10;
		int answer, guess;

		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		answer = generator.nextInt(MAX) + 1;

		System.out.print("I'm thinking of a number between 1 and " 
			+ MAX + ". Guess what it is:");

		guess = scan.nextInt();

		if(guess == answer) {
			System.out.println("You got it!");
		} else {
			System.out.println("That is NOT correct!");
			System.out.println("The number was " + answer);
		}

	}
}
