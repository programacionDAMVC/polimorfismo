package com.iesvirgendelcarmen.polimorfismo.teoria;

public class B implements A {

	@Override
	public void mentodoA1() {
		System.out.println("Implementado método A1");
	}

	@Override
	public void metodoA2(String argumento) {
		System.out.println("En el método A2 " + argumento);
	}

}
