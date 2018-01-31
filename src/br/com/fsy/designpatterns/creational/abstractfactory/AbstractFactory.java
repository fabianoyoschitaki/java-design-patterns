package br.com.fsy.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String type);
}
