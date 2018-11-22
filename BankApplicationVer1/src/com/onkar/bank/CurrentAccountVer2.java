package com.onkar.bank;

public class CurrentAccountVer2 extends CurrentAccount implements Insurance {

	@Override
	public double getInsuranceAccount() {
		// TODO Auto-generated method stub
		return 6000;
	}

	@Override
	public String getInsuranceName() {
		// TODO Auto-generated method stub
		return "Jivan bima";
	}
}
