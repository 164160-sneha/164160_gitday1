package com.sneha.collection;

public class Person implements Comparable<Person> {
	public int weight;
	public int height;
	public String name;

	public Person(int weight, int height, String name) {
		super();
		this.weight = weight;
		this.height = height;
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void display() {
		System.out.println(" Weight :" + getWeight() + " Height :" + getHeight()
				+ " Name :" + getName());
	}

	@Override
	public int compareTo(Person per) {
		if (this.weight == per.getWeight()) {
			if(this.height > per.getHeight()){
				return 1;
			}
			return -1;
		} else if (this.weight > per.getWeight()) {
			return 1;
		} else
			return -1;
		
	}

}
