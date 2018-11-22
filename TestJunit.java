package com.onkar.record;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.onkar.service.DateDifferenceProvider;
import com.onkar.servicesupp.MyDate;

public class TestJunit {
	DateDifferenceProvider provider;
	MyTestRecord[] myTestRecords= new MyTestRecord[15];
	
	@Before
	public void difference(){
		provider= new DateDifferenceProvider();
		System.out.println("Test passed");
	}
	@Test
	public void test() {
		
		myTestRecords[0]= new MyTestRecord(new MyDate(06,04,2011), new MyDate(06,04,2011), 0 );
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(06,04,2011));
		assertEquals(0,calculatedDifference,0);			
	}
	@Test
	public void test1() {
		
		myTestRecords[1]= new MyTestRecord(new MyDate(06,04,2011), new MyDate(18,04,2011), 12 );
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,04,2011));
		assertEquals(12,calculatedDifference,0);			
	}
	@Test
	public void test2() {
		
		myTestRecords[2]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 05, 2011), 42);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,05,2011));
		assertEquals(42,calculatedDifference,0);			
	}
	@Test
	public void test3() {
		
		myTestRecords[3]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 06, 2011), 73);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,06,2011));
		assertEquals(73,calculatedDifference,0);			
	}
	@Test
	public void test4() {
		
		myTestRecords[4]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2011), 256);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2011));
		assertEquals(256,calculatedDifference,0);			
	}
	
	
	@Test
	public void test5() {
		
		myTestRecords[5]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2012), 622);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2012));
		assertEquals(622,calculatedDifference,0);			
	}
	@Test
	public void test6() {
		
		myTestRecords[6]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2013), 987);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2013));
		assertEquals(987,calculatedDifference,0);			
	}
	@Test
	public void test7() {
		
		myTestRecords[7]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2113), 37511);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2113));
		assertEquals(37511,calculatedDifference,0);			
	}
	@Test
	public void test8() {
		
		myTestRecords[8]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2413), 147084);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2413));
		assertEquals(147084,calculatedDifference,0);			
	}
	@Test
	public void test9() {
		
		myTestRecords[9]= new MyTestRecord(new MyDate(06, 04, 2011), new MyDate(18, 12, 2813), 293181);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,04,2011),new MyDate(18,12,2813));
		assertEquals(293181,calculatedDifference,0);			
	}
	@Test
	public void test10() {
		
		myTestRecords[10]= new MyTestRecord(new MyDate(06, 01, 2011), new MyDate(06, 03, 2011), 59);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,01,2011),new MyDate(06,03,2011));
		assertEquals(59,calculatedDifference,0);			
	}
	@Test
	public void test11() {
		
		myTestRecords[11]= new MyTestRecord(new MyDate(06, 01, 2012), new MyDate(06, 03, 2012), 60);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,01,2012),new MyDate(06,03,2012));
		assertEquals(60,calculatedDifference,0);			
	}
	@Test
	public void test12() {
		
		myTestRecords[12]= new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 03, 2012), 29);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,02,2012),new MyDate(06,03,2012));
		assertEquals(29,calculatedDifference,0);			
	}
	@Test
	public void test13() {
		
		myTestRecords[13]= new MyTestRecord(new MyDate(22, 01, 2012), new MyDate(15, 11, 2012), 298);
		int calculatedDifference=provider.getDateDifference(new MyDate(22,01,2012),new MyDate(15,11,2012));
		assertEquals(298,calculatedDifference,0);			
	}
	@Test
	public void test14() {
		
		myTestRecords[14]= new MyTestRecord(new MyDate(06, 02, 2012), new MyDate(06, 12, 2012), 304);
		int calculatedDifference=provider.getDateDifference(new MyDate(06,02,2012),new MyDate(06,12,2012));
		assertEquals(304,calculatedDifference,0);			
	}
			
		
	}


