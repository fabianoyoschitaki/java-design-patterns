package br.com.fsy.designpatterns.creational.builder;

public class VegBurguer extends Burguer {
	public String name() {
		return "Veg Burguer";
	}

	@Override
	public float price() {
		return 25.0f;
	}
}
