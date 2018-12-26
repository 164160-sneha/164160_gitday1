package com.sneha.lamba;

public class ArithMetic {
	int a;
	int b;

	public static void main(String[] args) {
		
		operate add=(a,b) -> {return a+b; };
		System.out.println(add.operation(5,6));
		operate sub=(a,b) -> {return a-b; };
		System.out.println(sub.operation(15,6));
		operate mul=(a,b) -> {return a*b; };
		System.out.println(mul.operation(5,6));
		operate div=(a,b) -> {return a/b; };
		System.out.println(div.operation(30,6));
	}		
	}
		interface operate{
			int operation(int a, int b);
			
		}
	
		
	


	

		

