//********************************************************************
// Transactions.java
//
// Programming Project 5.10 on page 291.
//********************************************************************

public class Transactions {
	public static void main(String[] args) {

		final double TRANSFER_AMOUNT = 500.0;
		final double TRANSFER_FEE = 5.0;

		Account acct1 = new Account("Bill Gates", 1, 1000.0);
		Account acct2 = new Account("Steve Jobs", 2, 250.0);

		System.out.println("Initial balances:");
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);
		System.out.println();
		acct1.transfer(TRANSFER_AMOUNT, TRANSFER_FEE, acct2);
		System.out.println();
		System.out.println("New balances:");
		System.out.println();
		System.out.println(acct1);
		System.out.println(acct2);

	}
}