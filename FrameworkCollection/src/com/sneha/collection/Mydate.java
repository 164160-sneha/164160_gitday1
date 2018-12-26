package com.sneha.collection;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mydate {

	public static void main(String[] args) {
		Map<DateExample, String> hashMap = new HashMap<DateExample, String>();
		DateExample date = new DateExample(17,06,1996);
		hashMap.put(date, "sneha");
		hashMap.put(new DateExample(01,07,1997), "jungkook");
		hashMap.put(new DateExample(30,05,1996), "eunha");
		hashMap.put(new DateExample(13,10,1995), "jimin");
		hashMap.put(new DateExample(9,12,1997), "swathi");
		
		Set<Map.Entry<DateExample,String>> entrySet= hashMap.entrySet();
		for(Map.Entry<DateExample,String> entry : entrySet){
			System.out.println(" DOB " +entry.getKey()+ " name " +entry.getValue());
		}
	}

}
