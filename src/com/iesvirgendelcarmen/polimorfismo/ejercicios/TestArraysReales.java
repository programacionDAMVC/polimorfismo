package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.Arrays;

public class TestArraysReales {

	public static void main(String[] args) {
		final int TAMANNO = 25;
		double[] coleccion = new double[TAMANNO];
		//rellenar de forma aleatoria de 0 a 100
		for (int i = 0; i < TAMANNO; i++) {
			coleccion[i] = Math.random() * 100;
		}
		
		System.out.println(Arrays.toString(coleccion));
		Estadisticas e = new ArrayReales(coleccion);
		System.out.printf("Valor máximo %.2f, valor mínimo, "
				+ " %.2f y suma total: %.2f%n", e.maximo(),
				e.minimo(), e.sumatorio());
		System.out.println(Arrays.toString(((ArrayReales) e).getCopiaDoubles()));
	}

}
