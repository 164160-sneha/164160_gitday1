package com.java8lambdabasics;

public class Greet {
	public static void Greet(Greetings greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greet greet = new Greet();

		Greetings mylambda = () -> System.out.println("HelloWorld");

		Greetings innerClass = new Greetings() {

			public void perform() {
				System.out.println("HelloWorld");
			}
		};

		greet.Greet(mylambda);
		greet.Greet(innerClass);
	}
}
