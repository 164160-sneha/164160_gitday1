package com.onkar.bank; // combination of logical classes

public abstract class BankAccount {

	// static variable
	private static int autoAccountNo;

	// instance variable / class variable -- we cannot use instance variable
	// without the creating objects
	private int accountNo;
	private String accountHolderName;
	protected double accountBalance;

	// init block
	{
		accountNo = ++autoAccountNo;
	}

	// construct overloading - when offering variaties
	// default constructor
	public BankAccount() { // initialization of class variables - it gets
							// automatically get called
		accountHolderName = "Unknown";
		accountBalance=40000;

	}

	// parameterize constructor
	public BankAccount(String accountHolderName, double accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountBalance= accountBalance;
	}

	// setter modifying or re initialize member variables
	public void setAccountHolderName(String accountHolderName, double accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountBalance= accountBalance;
	}
	
	//getter methods
	public int getAccountNo(){
		return accountNo;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	//Service methods
	public void withdraw(double amount) {
		/*if(amount<=0 || amount>accountBalance || (accountBalance-amount<1000)){
			
			System.out.println("Not a Valid Transaction");
		
	}
	else {*/
		this.accountBalance-=amount;
		//System.out.println("The new balance is: "+accountBalance);
	}
	
	public void depoist(double amount) {
		this.accountBalance+=amount;
		/*if(amount<=0){
			System.out.println("Not a Valid Transaction");
		}
		else {
			this.accountBalance+=amount;
			System.out.println("The new balance is: "+accountBalance);*/
		}
		


	public static void main(String[] args) {
		//BankAccount acc = new BankAccount();
		//BankAccount acc2 = new BankAccount("Onkar", 5000);
	}
}
