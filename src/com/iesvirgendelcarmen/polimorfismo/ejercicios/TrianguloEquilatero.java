package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.function.LongToIntFunction;

public class TrianguloEquilatero extends PoligonoRegular {

	
	

	public TrianguloEquilatero(float longitudLado) {
		super(FigurasRegulares.TRIANGULO_EQUILATERO, 
				3, longitudLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return (float) (Math.sqrt(3.0) / 4.0 *
				Math.pow(longitudLado, 2));
	}

}
