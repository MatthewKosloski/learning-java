//********************************************************************
// Product.java
//
// Programming Project 3.2 on page 183.
//
//********************************************************************

import java.util.Scanner;

public class Product {
	public static void main(String[] args) {

		int one, two, three, product;		
		Scanner scan = new Scanner(System.in);

		System.out.print("Integer one: ");
		one = scan.nextInt();

		System.out.print("Integer two: ");
		two = scan.nextInt();

		System.out.print("Integer three: ");
		three = scan.nextInt();

		product = one * two * three;

		System.out.print("Square of the product: " + product * product);

	}
}