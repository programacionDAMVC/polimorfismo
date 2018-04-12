package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Smart extends Coche {

	public Smart(int velocidad,  int potencia) {
		super(velocidad, 2, potencia);
		// TODO Auto-generated constructor stub
	}

	public Smart( int potencia) {
		super(2, potencia);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		return "smart " + super.acelerar(velocidad);
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		return "smart " +  super.frenar(velocidad);
	}

	
}
