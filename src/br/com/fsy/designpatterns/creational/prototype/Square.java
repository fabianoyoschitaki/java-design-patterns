package br.com.fsy.designpatterns.creational.prototype;

public class Square extends Shape {
	public Square(){
		this.type = "Square";
	}
	public void draw() {
		System.out.println("Inside Square::draw() method.");
	}
}
