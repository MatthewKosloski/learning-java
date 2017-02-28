//********************************************************************
// Transactions.java
//
// Demonstrates the creation and use of multiple Account objects.
//********************************************************************

public class Transactions {
	public static void main(String[] args) {

		Account acct1 = new Account("Adam Lippert", 72345, 102.56);
		Account acct2 = new Account("Joshua Dunigan", 69713, 40.00);
		Account acct3 = new Account("Matthew Kosloski", 93757, 789.33);

		acct1.deposit(25.85);

		double kosloskiBalance = acct3.deposit(600.00);
		System.out.println("Matthew Kosloski's balance after deposit: " 
				+ kosloskiBalance);
		System.out.println("Joshua Dunigan's balance after withdrawal: " 
				+ acct2.withdraw(430.75, 1.50));

		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();

		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println(acct3);


	}
}