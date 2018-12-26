package com.sneha.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class BankAccountList {
	public static void main(String[] args) {
		
		HashSet<SavingAccount> bank = new HashSet<SavingAccount>();
		System.out.println(bank.add(new SavingAccount("Sneha", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Swathi", 60000, true)));
		System.out.println(bank.add(new SavingAccount("Shree", 50000, true)));
		System.out.println(bank.add(new SavingAccount("Sneha", 70000, false)));

		Set<SavingAccount> sorted = new TreeSet<SavingAccount>(bank);

		Iterator<SavingAccount> iterator = sorted.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getAccountHolderName());
		}

	}
}