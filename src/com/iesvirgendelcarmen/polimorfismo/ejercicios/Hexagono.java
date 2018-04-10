package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Hexagono extends PoligonoRegular {

	public Hexagono(float longitudLado) {
		super(FigurasRegulares.HEXAGONO, 6, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularArea() {
		double apotema = longitudLado / 1.15;
		return (float) (calcularPerimetro() * apotema / 2.0);
	}

}
