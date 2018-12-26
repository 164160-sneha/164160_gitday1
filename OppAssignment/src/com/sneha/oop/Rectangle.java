package com.sneha.oop;

import java.util.Scanner;

public class Rectangle extends Shape {
	public int length;
	public int breadth;
	
	public int rectangle;
	
	public void draw()
	{
		
		Scanner ac=new Scanner(System.in);
		System.out.println("Enter the length: ");
		length=ac.nextInt();
		System.out.println("Enter the breadth: ");
		breadth=ac.nextInt();
		
    rectangle= length*breadth;
    
	System.out.println("The area of Cube is: " +rectangle);
	}

}
