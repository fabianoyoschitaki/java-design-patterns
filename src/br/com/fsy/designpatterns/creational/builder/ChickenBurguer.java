package br.com.fsy.designpatterns.creational.builder;

public class ChickenBurguer extends Burguer {
	public String name() {
		return "Chicken Burguer";
	}

	@Override
	public float price() {
		return 50.5f;
	}
}
