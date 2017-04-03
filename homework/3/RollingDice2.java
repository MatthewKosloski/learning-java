//********************************************************************
// RollingDice2.java
//
// Programming Project 4.9 on page 229.
//********************************************************************

public class RollingDice2 {
	public static void main(String[] args) {
		PairOfDice dice = new PairOfDice();
		System.out.println(dice);
		System.out.println("Setting die1 face value to 4.");
		System.out.println("Setting die2 face value to 6.");
		dice.setDie1FaceValue(4);
		dice.setDie2FaceValue(6);
		System.out.println();
		System.out.println(dice);
		System.out.println();
		System.out.println("Sum of the two die values: " + dice.getFaceValueSum());
	}
}