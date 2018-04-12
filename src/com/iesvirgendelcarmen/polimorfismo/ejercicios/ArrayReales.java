package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.Arrays;

public class ArrayReales implements Estadisticas{

	private double[] coleccionDoubles;
	private double[] copiaDoubles;
 
	public double[] getCopiaDoubles() {
		return copiaDoubles;
	}



	public ArrayReales(double[] coleccionDoubles) {
		this.coleccionDoubles = coleccionDoubles;
		copiaDoubles = coleccionDoubles.clone();
		Arrays.sort(copiaDoubles);
	}
	
	
	
	@Override
	public double sumatorio() {
		double suma = 0;
		for (int i = 0; i < coleccionDoubles.length; i++) {
			suma += coleccionDoubles[i];
		}
	
		return suma;
	}
	
	@Override
	public double minimo() {
		// TODO Auto-generated method stub
		return copiaDoubles[0];
	}
	
	@Override
	public double maximo() {
		// TODO Auto-generated method stub
		return copiaDoubles[coleccionDoubles.length - 1];
	}
}
