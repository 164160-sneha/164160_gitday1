package com.sneha.collection;

public class SavingAccount extends BankAccount implements Comparable<SavingAccount> {
private boolean isSalaryAccount;
	
	public SavingAccount() {
		
		this.isSalaryAccount=true;
	}
	public SavingAccount(String accountHolderName, double accountBalance) {
		
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	
	public SavingAccount(String accountHolderName, double accountBalance,boolean isSalaryAccount) {
		
		super(accountHolderName, accountBalance);
		this.isSalaryAccount=true;
	}
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	@Override
	public void withdraw(double amount) {
		
		super.withdraw(amount);
	}
	@Override
	public int compareTo(SavingAccount arg0) {
		
		if(this.getAccountNo()>arg0.getAccountNo())
			return 1;
		else if(this.getAccountNo()<arg0.getAccountNo())
			return -1;
		else
			return 0;
	}
	
	@Override
	public boolean equals(Object arg0) {
		
		SavingAccount obj=(SavingAccount)arg0;
		return this.getAccountHolderName().equals(obj.getAccountHolderName());
	}
	
	@Override
	public int hashCode() {
		
		int total=0;
		for(char c:this.getAccountHolderName().toLowerCase().toCharArray())
			total+=c;
		return total;
	}
}
