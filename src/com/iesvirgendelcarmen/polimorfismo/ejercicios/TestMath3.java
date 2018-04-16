package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.Arrays;
import java.util.Random;

public class TestMath3 {

	public static void main(String[] args) {

		//creamos las listas originales
		final int[] listaOriginalEnteros = {11,2,3,45,3,1,4};
		int tamanno = (int) (Math.random() * 15 + 1);
		final double[] listaOriginalDoubles = new double[tamanno];
		for (int i = 0; i < listaOriginalDoubles.length; i++) {
			listaOriginalDoubles[i] = Math.random() * 100;
		}				
		//imprimimos su valor
		System.out.println(Arrays.toString(listaOriginalEnteros));
		System.out.println(Arrays.toString(listaOriginalDoubles));

		//vamos a crear un objeto Math3
		Math3 math3 = new Math3(listaOriginalEnteros, listaOriginalDoubles);
		System.out.println("Valor mínimo de enteros (debe dar 1): " + 
				math3.min(listaOriginalEnteros));
		System.out.println("Valor máximo de enteros (debe dar 45): " + 
				math3.max(listaOriginalEnteros));
		System.out.println("Valor mínimo de doubles: " + 
				math3.min(listaOriginalDoubles));
		System.out.println("Valor máximo de doubles: " + 
				math3.max(listaOriginalDoubles));

		//no se altera la lista
		//imprimimos su valor
		System.out.println(Arrays.toString(listaOriginalEnteros));
		System.out.println(Arrays.toString(listaOriginalDoubles));
		Random randomFloat = new Math4();
		System.out.println(randomFloat.nextFloat());
		System.out.println(randomFloat.nextDouble());

	}
	
}

class Math4 extends Random {
	@Override
	public float nextFloat() {
		// TODO Auto-generated method stub
		return 2.3f;
	}
}
/*class Math5 extends Math3{
	
}*/






