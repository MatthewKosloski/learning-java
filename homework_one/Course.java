//********************************************************************
// Course.java
//
// Programming Project 2.4 on page 135.
//
//********************************************************************

import java.util.Scanner;

public class Course {
	public static void main(String[] args) {
		
		String course_name, credits, reference_book;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the course name:");
		course_name = scan.nextLine();

		System.out.print("Enter the course credits:");
		credits = scan.nextLine();

		System.out.print("Enter the reference book:");
		reference_book = scan.nextLine();

		System.out.println(
			"This semester, a new course on " + course_name + " has been added\n" 
			+ "to the curriculum.  It consists of " + credits + " credits and\n"
			+ "the reference book for this course is " + reference_book + "."
		);

	}
}