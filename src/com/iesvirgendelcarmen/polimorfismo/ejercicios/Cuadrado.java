package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.io.PipedOutputStream;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(float longitudLado) {
		super(FigurasRegulares.CUADRADO, 4, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularArea() {
		return longitudLado * longitudLado;
	}

	
	
}
