package com.sneha.springboot;

import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sneha.springboot.cache.PersonRepository;

@SpringBootApplication
public class SpringBootDataCacheApplication {
	
	private static final Logger logger =LoggerFactory.getLogger(SpringBootDataCacheApplication.class);
	@Autowired
	private PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataCacheApplication.class, args);
	}

}

