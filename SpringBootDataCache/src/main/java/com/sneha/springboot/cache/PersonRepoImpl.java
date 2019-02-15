package com.sneha.springboot.cache;

import org.springframework.stereotype.Component;

@Component
public class PersonRepoImpl implements PersonRepository {

	@Override
	public Person getDetails(String name) {
		
		return new Person("name","any person");
	}
	
	public void delay() {
		try {
			Thread.sleep(3000L);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
