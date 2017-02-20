//********************************************************************
// PalindromeTester.java
//
// Demonstrates the use of nested while loops.
//********************************************************************

import java.util.Scanner; 

public class PalindromeTester {
	public static void main(String[] args) {

		String str, another = "y";
		int left, right;

		Scanner scan = new Scanner(System.in);

		while(another.equalsIgnoreCase("y")) { // allows y or Y
			System.out.println("Enter a potential palindrome:");
			str = scan.nextLine();

			left = 0;
			right = str.length() - 1;

			while(str.charAt(left) == str.charAt(right) && left < right) {
				left++;
				right--;
			}

			System.out.println();

			if(left < right) {
				System.out.println("NOT a palindrome.");
			} else {
				System.out.println("String is a palindrome!");
			}

			System.out.println();
			System.out.print("Test another palindrome (y/n)? ");
			another = scan.nextLine();

		}
		

	}
}
