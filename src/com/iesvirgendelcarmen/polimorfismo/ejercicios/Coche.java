package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Coche extends TipoVehiculo{

	private int potencia;

	public Coche(int velocidad, int numeroPlazas, int potencia) {
		super(velocidad, numeroPlazas);
		this.potencia = potencia;
	}
	
	public Coche(int numeroPlazas, int potencia) {
		super(numeroPlazas);
		this.potencia = potencia;
	}

	@Override
	public String acelerar(int velocidad) {
		// TODO Auto-generated method stub
		return "coche " + getTipoCombustible() + " " + super.acelerar(velocidad);
	}

	@Override
	public String frenar(int velocidad) {
		// TODO Auto-generated method stub
		return "coche " + getTipoCombustible() +" " + super.frenar(velocidad);
	}
	
	
	
	
}
