package com.sneha.oop;

public abstract class Shape {
	void draw() {
		
	}
	public static void main(String[] args) {
		
		
		Rectangle rectangle=new Rectangle();
		rectangle.draw();
		
		Cube cube=new Cube();
		cube.draw();
		
		Line line=new Line();
		line.draw();
		
	}

}
