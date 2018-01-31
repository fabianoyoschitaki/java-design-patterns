package br.com.fsy.designpatterns.creational.abstractfactory;

public class ColorFactory extends AbstractFactory {
	
	//use getShape method to get object of type shape
	public IShape getShape(String type){
		return null;
	}

	@Override
	public IColor getColor(String color) {
		IColor retorno = null;
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
