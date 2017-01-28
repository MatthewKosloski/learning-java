//********************************************************************
// Money.java
//
// Programming Project 2.11 on page 135.
//
//********************************************************************

import java.util.Scanner;

public class Money {
	public static void main(String[] args) {

		double money;
		int tens, fives, ones, quarters, dimes;

		Scanner scan = new Scanner(System.in);

		System.out.print("Money: ");
		money = scan.nextDouble();

		tens = (int) (money / 10.0);
		money -= 10.0*tens;
		fives = (int) (money / 5.0);
		money -= 5.0*fives;
		ones = (int) (money / 1.0);
		money -= 1.0*ones;
		quarters = (int) (money / 0.25);
		money -= 0.25*quarters;
		money = (float) money; // round up if money has 10 cents
		dimes = (int) (money / 0.1);
		money -= 0.1*dimes;

		System.out.println(tens + " ten dollar bills");
		System.out.println(fives + " five dollar bills");
		System.out.println(ones + " one dollar bills");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
	}
}