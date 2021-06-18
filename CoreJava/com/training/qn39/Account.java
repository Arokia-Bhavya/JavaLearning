package com.training.qn39;

import java.util.Scanner;

public class Account {
	private String accountNumber;
	private int balance;
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	
	public Account(String accountNumber, int balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public void withdraw(int transactionAmount)
	{
		if((this.balance - transactionAmount)>0)
			this.balance=this.balance - transactionAmount;
		else
			System.out.println("Insufficient Balance");
	}
	
	public void deposit(int transactionAmount)
	{
		this.balance=this.balance + transactionAmount;
	}
	
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Account Number");
		String acctNumber=scan.next();
		System.out.println("Enter the Account Balance");
		int balance=scan.nextInt();
		Account account=new Account(acctNumber,balance);
		System.out.println("Enter 1 to deposit an amount,"+
		"2 to withdraw an amount ");
		int choice=scan.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the amount to be deposit");
			account.deposit(scan.nextInt());
		}else
		{
			System.out.println("Enter the amount to be withdraw");
			account.withdraw(scan.nextInt());
		}
		scan.close();
		System.out.println("Your balance after the transaction is:"+account.getBalance());
	}
}
