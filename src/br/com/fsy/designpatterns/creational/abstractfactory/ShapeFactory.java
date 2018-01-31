package br.com.fsy.designpatterns.creational.abstractfactory;

public class ShapeFactory extends AbstractFactory {
	
	//use getShape method to get object of type shape
	public Shape getShape(String type){
		Shape retorno = null;
		if (type != null){
			if (type.equalsIgnoreCase("SQUARE")){
				retorno = new Square();
			} else if (type.equalsIgnoreCase("CIRCLE")){
				retorno = new Circle();
			} else if (type.equalsIgnoreCase("RECTANGLE")){
				retorno = new Rectangle();
			}
		}
		return retorno;
	}

	@Override
	Color getColor(String color) {
		return null;
	}
}
