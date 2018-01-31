package br.com.fsy.designpatterns.creational.prototype;

public class Circle extends Shape {
	public Circle(){
		this.type = "Circle";
	}
	
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}
}
