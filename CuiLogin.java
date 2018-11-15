package com.sneha.ds;

import java.util.Scanner;

public class CuiLogin {
	public static void main(String[] args) {
		String name; 
		String password;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			System.out.println("enter name");
			name = scan.nextLine();
			System.out.println("enter password");
			password = scan.nextLine();
			if(name.equals("sneha") & password.equals("galaxy")) 
			{
				System.out.println("welcome");
				break;
			}
			else if(i==2)
				System.out.println("contact admin");
		
		}	
}
}
