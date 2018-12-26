package com.sneha.collection;

import java.util.Date;

public class DateExample implements Comparable<DateExample>{
	int dd;
	int mm;
	int yyyy;

	public DateExample(int dd, int mm, int yyyy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yyyy = yyyy;
	}

	public int getDd() {
		return dd;
	}

	public void setDd(int dd) {
		this.dd = dd;
	}

	public int getMm() {
		return mm;
	}

	public void setMm(int mm) {
		this.mm = mm;
	}

	public int getYyyy() {
		return yyyy;
	}

	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}

	@Override
	public String toString() {
		return "" + dd + "/" + mm + "/" + yyyy + "";
	}

	@Override
	public int compareTo(DateExample arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
}
