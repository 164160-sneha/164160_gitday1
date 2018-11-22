package com.onkar.test;

import java.util.Scanner;

import com.onkar.bank.BankAccount;
import com.onkar.bank.CurrentAccount;
import com.onkar.bank.CurrentAccountVer2;
import com.onkar.bank.SavingAccount;
import com.onkar.bank.SavingAccountVer2;

public class TestBankAccount {

	//public static void testBankaccountMethod() {
		//BankAccount acc = new BankAccount();
		//acc.setAccountHolderName("Sachin");
		/*
		 * BankAccount acc1 = new BankAccount("sneha", 50000); BankAccount acc2
		 * = new BankAccount("shree", 50000); BankAccount acc3 = new
		 * BankAccount("swati", 50000);
		 * 
		 * Scanner sc1 = new Scanner(System.in);
		 * System.out.println("Enterthe amount to be deposited: "); double
		 * amount = sc1.nextDouble(); acc1.depoist(amount);
		 * 
		 * System.out.println("Enterthe amount to be deposited: "); amount =
		 * sc1.nextDouble(); acc2.depoist(amount);
		 * 
		 * System.out.println("Enterthe amount to be deposited: "); amount =
		 * sc1.nextDouble(); acc3.depoist(amount);
		 * 
		 * System.out.println("Enterthe amount to be withdrawn: "); amount =
		 * sc1.nextInt(); acc1.withdraw(amount);
		 * 
		 * System.out.println("Enterthe amount to be withdrawn: "); amount =
		 * sc1.nextInt(); acc2.withdraw(amount);
		 * 
		 * System.out.println("Enterthe amount to be withdrawn: "); amount =
		 * sc1.nextInt(); acc3.withdraw(amount);
		 */
	//}

	public static void testSavingAccount() {
		SavingAccount savingAcc = new SavingAccount("onkar", 40000);
		System.out.println("Account no is" + savingAcc.getAccountNo());
		System.out.println("Account Name " + savingAcc.getAccountHolderName());
		System.out.println("Account Balance" + savingAcc.getAccountBalance());
		savingAcc.depoist(5000);
		System.out.println("Account Balance" + savingAcc.getAccountBalance());
		System.out.println("===============");
		savingAcc.withdraw(3000);
		System.out.println("Account Balance" + savingAcc.getAccountBalance());
	}

	public static void testCurrentAccount() {
		CurrentAccount currentAcc = new CurrentAccount("onkar", 35000);
		System.out.println("Account no is" + currentAcc.getAccountNo());
		System.out.println("Account Name " + currentAcc.getAccountHolderName());
		System.out.println("Account Balance" + currentAcc.getAccountBalance());
		currentAcc.depoist(5000);
		System.out.println("Account Balance" + currentAcc.getAccountBalance());
		System.out.println("===============");
		currentAcc.withdraw(50000);
		System.out.println("Account Balance " + currentAcc.getAccountBalance());
	}
	//public static BankAccount getBankAccount(String accountType){
//		BankAccount acc= null;
//		if(accountType.equals("Saving")){
//			acc= new SavingAccount("Onkar", 4000);			
//		}
//	else if(accountType.equals("Current")){
//		acc= new  CurrentAccount("Rahul",7000);
//	}
//	else{
//		acc=null;
//	}
//	return acc;
//	}
	
		// testBankaccountMethod();
		//testSavingAccount();
		//testCurrentAccount();
//		BankAccount acc=getBankAccount("Current");
//		System.out.println("Account name"+acc.getAccountHolderName());
//		System.out.println("Account balance "+acc.getAccountBalance());
//		acc.withdraw(3000);
//		System.out.println("Account balance "+acc.getAccountBalance());
//		}
		public static void main(String[] args) {
		SavingAccountVer2 acc = new SavingAccountVer2();
		acc.withdraw(400);
		acc.depoist(4000);
		acc.isSalaryAccount();
		acc.getInsuranceName();
		System.out.println("balance"+acc.getAccountBalance());
		CurrentAccountVer2 acc1 = new CurrentAccountVer2();
		acc1.withdraw(4000);
		acc1.depoist(5000);
		//acc1.isSalaryAccount();
		acc1.getInsuranceName();
		System.out.println("balance"+acc.getAccountBalance());
	}
		
	}



