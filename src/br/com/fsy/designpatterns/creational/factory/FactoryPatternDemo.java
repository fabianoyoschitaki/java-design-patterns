package br.com.fsy.designpatterns.creational.factory;

/**
 * Factory pattern is one of the most used design patterns in Java. 
 * This type of design pattern comes under creational pattern as this pattern provides one of the best 
 * ways to create an object. In Factory pattern, we create object without exposing the creation logic 
 * to the client and refer to newly created object using a common interface.
 * 
 * @author Fabiano Yoschitaki
 */
public class FactoryPatternDemo {
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		IShape circle = factory.getShape("CIRCLE");
		circle.draw();
		
		IShape square = factory.getShape("SQUARE");
		square.draw();
		
		IShape rectangle = factory.getShape("RECTANGLE");
		rectangle.draw();
	}
}

