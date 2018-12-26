package com.sneha.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetPerson {
	public static void main(String[] args) {
		 Set <Person> person = new TreeSet<Person>();
		 
		 Person person1 = new Person(55,160,"Rohan");
		 Person person2 = new Person(56,169,"Mahesh");
		 Person person3 = new Person(56,164,"Jeevan");
		 Person person4 = new Person(54,162,"Ashwin");
		 Person person5 = new Person(56,170,"Naveen");
		 
		 person.add(person1);
		 person.add(person2);
		 person.add(person3);
		 person.add(person4);
		 person.add(person5);
		 
		 for(Person per : person)
		 per.display();
		 
	}

}
