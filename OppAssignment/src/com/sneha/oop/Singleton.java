package com.sneha.oop;

public class Singleton {
	
	private static Singleton singleInstance=null;
	public String value;


private Singleton(){
	value="Sneha";
}

private static Singleton getInstance(){
	
	if(singleInstance==null){
		singleInstance= new Singleton();
	}
	return singleInstance;
}

public static void main(String[] args){
	
	Singleton obj1 = Singleton.getInstance();
	System.out.println(obj1.value);
	System.out.println(obj1.hashCode());
	
	Singleton obj2 = Singleton.getInstance();
	System.out.println(obj2.value);
	System.out.println(obj2.hashCode());
	
	Singleton obj3 = Singleton.getInstance();
	System.out.println(obj3.value);
	System.out.println(obj3.hashCode());
}
}

	
	

