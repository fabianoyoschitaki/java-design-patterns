package br.com.fsy.designpatterns.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract IColor getColor(String color);
	abstract IShape getShape(String type);
}
