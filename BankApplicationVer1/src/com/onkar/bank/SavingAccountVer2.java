package com.onkar.bank;

public class SavingAccountVer2 extends SavingAccount implements Insurance{

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan bima";
	}

	@Override
	public double getInsuranceAccount() {
		// TODO Auto-generated method stub
		return 5000;
	}

	}

