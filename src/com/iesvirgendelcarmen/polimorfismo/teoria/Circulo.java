package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Circulo extends FiguraCircular {

	//private float radio;

	public Circulo(float radio) {
		super(radio, radio , "CIRCULO");
	//	this.radio = radio;
	}

	@Override
	public float calcularPerimetro() {
		return (float) (2 * NUMERO_PI * semiEjeMayor);
	}

}
