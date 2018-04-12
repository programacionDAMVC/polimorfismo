package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public interface Vehiculo {

	int VELOCIDAD_MAXIMA = 120;
	
	String acelerar (int velocidad);
	String frenar( int velocidad );
	int obtenerNumeroDePlazas();
	void setTipoCombustible(TipoCombustible tipoCombustible);
	
}
