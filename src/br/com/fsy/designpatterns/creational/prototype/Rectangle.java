package br.com.fsy.designpatterns.creational.prototype;

public class Rectangle extends Shape {
	public Rectangle(){
		this.type = "Rectangle";
	}
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}
}
