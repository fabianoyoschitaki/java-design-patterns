package br.com.fsy.designpatterns.creational.abstractfactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		AbstractFactory retorno = null;
		if (choice.equalsIgnoreCase("SHAPE")){
			retorno = new ShapeFactory();
		} else if (choice.equalsIgnoreCase("COLOR")){
			retorno = new ColorFactory();
		}
		return retorno;
	}
}
