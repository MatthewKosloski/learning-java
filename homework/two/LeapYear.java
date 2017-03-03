//********************************************************************
// LeapYear.java
//
// Programming Project 5.1 on page 290.
//
//********************************************************************

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		final int GREGORIAN = 1582;
		String another = "y";
		int year;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter in a year: ");
			year = Integer.parseInt(scan.nextLine()); // can't repeat program if scan.nextInt?

			if(year > GREGORIAN) {
				if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0) {
					System.out.println(String.format("%d is a leap year", year));
				} else {
					System.out.println(String.format("%d is NOT a leap year", year));
				}
			} else {
				System.out.println("Invalid year.");
			}

			System.out.print("Check another year (y/n)? ");
			another = scan.nextLine();
		} while(another.equalsIgnoreCase("y"));
	
	}

}