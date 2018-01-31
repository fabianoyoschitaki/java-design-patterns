package br.com.fsy.designpatterns.creational.builder;

public abstract class Burguer implements Item {
	public Packing packing() {
		return new Wrapper();
	}

	public abstract float price();
}
