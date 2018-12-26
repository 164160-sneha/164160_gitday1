package com.sneha.oop;

import java.util.Scanner;

public class Cube extends Shape {
	public int edge;
	public int cube;
	
	public void draw()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the edge: ");
		edge=sc.nextInt();
	cube= 6*(edge*edge);
	System.out.println("The area of Cube is: " +cube);
	}

}
