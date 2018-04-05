package com.iesvirgendelcarmen.polimorfismo.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestFiguraCircular {

	public static void main(String[] args) {
		
		//no se puede instanciar objetos de una clase abstracta
		//FiguraCircular f = new FiguraCircular(3,3); 
		List<Poligono> listaFiguras = new ArrayList<>();
		Poligono figura1 = new Circulo(4.2f);
		listaFiguras.add(figura1);
		Poligono figura2 = new Elipse(2.3f, 5);
		listaFiguras.add(figura2);
		/*System.out.printf("Figura %s de perímetro %.2f y área %.2f%n",
				figura1.getNombre(), figura1.calcularPerimetro(), 
				figura1.calcularArea());
		System.out.printf("Figura %s de perímetro %.2f y área %.2f%n",
				figura2.getNombre(), figura2.calcularPerimetro(), 
				figura2.calcularArea());*/
		imprimirDatosFigura(listaFiguras);
	}
	
	public static void imprimirDatosFigura(List<Poligono> listaFiguras) {
		for (Poligono poligono : listaFiguras) {
			//System.out.println("Semiejes: " + poligono.semiEjeMayor
			//		+ ", " + poligono.semiEjeMenor);
			System.out.printf("Figura %s de perímetro %.2f y área %.2f%n",
					poligono.getNombre(), poligono.calcularPerimetro(), 
					poligono.calcularArea());
		}
	}

}
