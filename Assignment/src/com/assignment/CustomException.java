package com.assignment;

import java.util.Scanner;

/*
 * 27.W.A.J.P. to create a custom exception if Customer withdraw amount
which is greater than account balance then program will show custom 
exception otherwise amount will deduct from account balance.
Account balance is:2000 Enter withdraw
amount:2500
Sorry, insufficient balance, you need more 500 Rs.To perform
this transaction. */


class HetalException extends Exception {
    double amount;

    public HetalException(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Sorry, insufficient balance. You need more " + amount + " Rs. to perform this transaction.";
    }
}

class BankAccount {
    double balance;

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Total balance is: " + balance);
    }

    public void withdraw(double amount) throws HetalException {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn is: " + amount + ". Remaining balance is: " + balance);
        } else {
            double needs = amount - balance;
            throw new HetalException(needs);
        }
    }
}


public class CustomException {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
        Scanner sc = new Scanner(System.in);
        double amount;

        System.out.print("Enter amount to be deposited: ");
        amount = sc.nextDouble();
        account.deposit(amount);

        System.out.print("Enter amount to be Withdrawn: ");
        amount = sc.nextDouble();

        try {
            account.withdraw(amount);
        } catch (HetalException e) {
            System.out.println(e.toString());
        }

        sc.close();
	}

}
