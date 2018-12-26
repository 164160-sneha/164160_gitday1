package com.sneha.oop2;

import java.util.Scanner;

public class MyArrayList implements MyList {
	int index,size;
	int arr[]=new int[index];

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int get() {
		
		System.out.println("Enter the size of array");
		Scanner scan = new Scanner(System.in);
		size=scan.nextInt();
		System.out.println("Enter the values");
		for(index= 0; index < size; index++) {
		arr[index]=scan.nextInt();
		}
		return 0;
	}

	@Override
	public  int getAll() {
		//int index=0;
		System.out.println("The array is");
		for(index=0 ;index < size; index++)
		{
			System.out.println(+arr[index]);
		}
		return arr[index];
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int remove() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public static void main(String[] args) {
		
		MyArrayList a= new MyArrayList();
		a.get();
		a.getAll();
	}
	
	}


