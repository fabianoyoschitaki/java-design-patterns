package br.com.fsy.designpatterns.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	//use getShape method to get object of type shape
	public Shape getShape(String type){
		return null;
	}

	@Override
	public Color getColor(String color) {
		Color retorno = null;
		if (color != null){
			if (color.equalsIgnoreCase("RED")){
				retorno = new Red();
			} else if (color.equalsIgnoreCase("GREEN")){
				retorno = new Green();
			} else if (color.equalsIgnoreCase("BLUE")){
				retorno = new Blue();
			}
		}
		return retorno;
	}
}
