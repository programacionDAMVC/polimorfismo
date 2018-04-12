package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Motocicleta extends TipoVehiculo {

	private int cilindrada;

	public Motocicleta(int velocidad, int cilindrada) {
		super(velocidad, 2);
		this.cilindrada = cilindrada;
	}
	
	public Motocicleta(int cilindrada) {
		super(2);
		this.cilindrada = cilindrada;
	}
	
	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		return "Motocicleta " + getTipoCombustible() + " " + super.acelerar(velocidad);
	}
	
	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		return "Motocicleta " + getTipoCombustible() + " " + super.frenar(velocidad);
	}
	
}
