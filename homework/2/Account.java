//********************************************************************
// Account.java
//
// Programming Project 5.10 on page 291.
//********************************************************************

import java.text.NumberFormat;

public class Account {
	private final double RATE = 0.035; // interest rate of 3.5%

	private long acctNumber;
	private double balance;
	private String name;

	// Sets up the account by defining its owner, account number, and initial balance.
	public Account(String owner, long account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
	}

    // Deposits the amount into the recipient's account.  Transferer charged fee.
    public void transfer(double amount, double fee, Account recipient) {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        double transferAmount = amount + fee;
        if(transferAmount < balance) {
            withdraw(amount, fee);
            recipient.deposit(amount);
            System.out.println(String.format("\u2713 %1$s transferred %2$s to %3$s and was charged %4$s.", name, fmt.format(amount), recipient.getName(), fmt.format(fee)));
        } else {
            System.out.println(String.format("\u2717 %1$s is an invalid transfer amount.  Amount must be less than %2$s", fmt.format(transferAmount), fmt.format(balance)));
        }
    }

    // Returns the name associated with the account.
    public String getName() {
        return name;
    }

   // Deposits the specified amount into the account. Returns the new balance.
   	public double deposit(double amount) {
   		balance += amount;
   		return balance;
   	}

   	// Withdraws the specified amount from the account and applies the fee. Returns the new balance.
   	public double withdraw(double amount, double fee) {
   		balance = balance - amount - fee;
   		return balance;
   	}

   	// Returns a one-line description of the account as a string.
   	public String toString() {
   		NumberFormat fmt = NumberFormat.getCurrencyInstance();
   		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
   	}

}