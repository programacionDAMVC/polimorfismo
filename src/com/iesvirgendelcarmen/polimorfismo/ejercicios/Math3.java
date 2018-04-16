package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.Arrays;

public final class Math3 implements Extremos{

	private int[] listaEnteros;
	private double[] listaDoubles;
	
	
	
	public Math3(int[] listaEnteros, double[] listaDoubles) {
		this.listaEnteros = listaEnteros.clone();
		Arrays.sort(this.listaEnteros);
		this.listaDoubles = listaDoubles.clone();		
		Arrays.sort(this.listaDoubles);
	}

	@Override
	public int min(int[] a) {
		// TODO Auto-generated method stub
		return listaEnteros[0];
	}

	@Override
	public int max(int[] a) {
		// TODO Auto-generated method stub
		return listaEnteros[listaEnteros.length - 1];
	}

	@Override
	public double min(double[] a) {
		// TODO Auto-generated method stub
		return listaDoubles[0];
	}

	@Override
	public double max(double[] a) {
		// TODO Auto-generated method stub
		return listaDoubles[listaDoubles.length - 1];
	}

}
