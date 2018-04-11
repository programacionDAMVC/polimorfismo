package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.List;

public class TestPoligonoRegular {

	public static void main(String[] args) {

		PoligonoRegular t1 = new TrianguloEquilatero(1.1f);
		PoligonoRegular t2 = new TrianguloEquilatero(2);
		PoligonoRegular t3 = new TrianguloEquilatero(1.1f);

		PoligonoRegular c1 = new Cuadrado(1.1f);
		PoligonoRegular c2 = new Cuadrado(2);
		PoligonoRegular c3 = new Cuadrado(2.5f);

		PoligonoRegular h1 = new Hexagono(1.1f);
		PoligonoRegular h2 = new Hexagono(2);
		PoligonoRegular h3 = new Hexagono(2.5f);

		ListaPoligonoRegular l = new ListaPoligonoRegular();

		l.annadirPoligonoRegular(c1);
		l.annadirPoligonoRegular(c2);
		l.annadirPoligonoRegular(c3);
		l.annadirPoligonoRegular(t3);
		l.annadirPoligonoRegular(t2);
		l.annadirPoligonoRegular(t1);
		l.annadirPoligonoRegular(h2);
		l.annadirPoligonoRegular(h1);
		l.annadirPoligonoRegular(h3);

		//System.out.println(l);

		List<PoligonoRegular> lista = 
				l.getListaPoligonos();

		for (PoligonoRegular poligonoRegular : lista) {
			System.out.printf("%S de área %.2f y perímetro %.2f%n",
					poligonoRegular, poligonoRegular.calcularArea(),
					poligonoRegular.calcularPerimetro());
		}

		List<PoligonoRegular> listaOrdenada = 
				l.obtenerListaOrdenadaDePoligono();

		System.out.println("ORDENANDO FIGURAS");
		for (PoligonoRegular poligonoRegular : listaOrdenada) {
			System.out.printf("%S de área %.2f y perímetro %.2f%n",
					poligonoRegular, poligonoRegular.calcularArea(),
					poligonoRegular.calcularPerimetro());
		}
		//usamos equals con get(0) que es un triangulo equitaro
		//de lado 1.1 es igual que el mismo y el tercer triángulo
		for (PoligonoRegular poligonoRegular : listaOrdenada) {
			System.out.println(poligonoRegular);
			System.out.println(
					listaOrdenada.get(0).equals(poligonoRegular));
		}
		//usamos compareTo() con get(0) que da la diferencia de lados
		for (PoligonoRegular poligonoRegular : listaOrdenada) {
			System.out.println(poligonoRegular);
			System.out.println(
					listaOrdenada.get(0).compareTo(poligonoRegular));
		}


	}

}
