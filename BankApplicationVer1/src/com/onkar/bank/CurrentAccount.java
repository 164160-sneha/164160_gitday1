package com.onkar.bank;

public class CurrentAccount extends BankAccount{
	
	private double odLimit;
	
	public CurrentAccount(String accountHolderName, double accountBalance) {
		super(accountHolderName, accountBalance);
		this.odLimit=20000;
	}
	
	public CurrentAccount(){
		this.odLimit=20000;
	}
	
	public CurrentAccount (String accountHolderName, double accountBalance, double odLimit){
		super(accountHolderName, accountBalance);
		this.odLimit=odLimit;
	}

//	public void withdraw(double amount){
//		System.out.println("odlimit is " +odLimit);	
//		System.out.println("amt is "+amount);
//		System.out.println("balance is " +accountBalance);
//		double cutLimit=amount-accountBalance;
//		if(amount< accountBalance)
//			//withdraw(amount);
//		if(amount>accountBalance)
//		{
//			if((odLimit - cutLimit)>=0){
//				odLimit=odLimit-cutLimit;
//				accountBalance=0;
//				System.out.println("new odlimit is " +odLimit);
//			}
				
		
	}


