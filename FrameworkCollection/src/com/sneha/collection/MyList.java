package com.sneha.collection;

import java.util.ArrayList;

public class MyList<T> {
	
	private T t;
	
	public void  add(T t){
		this.t=t;
		
	
	}
	ArrayList<T> arr=new ArrayList<T>();
	public void  listAdd(T t){
		arr.add(t);
		
	
	}
	public T listget(){
		return (T) arr;
	}
	//System.out.println(list.get());
	
	public T get(){
		return t;
	}

}
