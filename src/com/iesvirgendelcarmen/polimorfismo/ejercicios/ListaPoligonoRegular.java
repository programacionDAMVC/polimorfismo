package com.iesvirgendelcarmen.polimorfismo.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaPoligonoRegular {

	private List<PoligonoRegular> listaPoligonos;

	//constructor que inicializa la lista de poligonos
	//con una lista que pasamos como parámetro
	public ListaPoligonoRegular(List<PoligonoRegular> listaPoligonos) {
		this.listaPoligonos = listaPoligonos;
	}

	//constructor por defecto que inicializa la lista a
	//una lista vacía
	public ListaPoligonoRegular() {
		listaPoligonos = new ArrayList<>();
	}

	//método que añade un objeto PoligonoRegular
	public boolean annadirPoligonoRegular(PoligonoRegular p) {
		return listaPoligonos.add(p);
	}

	//quita un objeto PoligonoRegular
	public boolean quitarPoligonoRegular(PoligonoRegular p) {
		return listaPoligonos.remove(p);
	}

	//devolver una lista ordenada de objetos PoligonoRegular
	//pero NO queremos que el atributo listaPoligonos quede
	//ordenado, el método sort de Collections hace eso

	public List<PoligonoRegular> obtenerListaOrdenadaDePoligono(){
		List<PoligonoRegular> listaOrdenada =
		new ArrayList<>(listaPoligonos);
	Collections.sort(listaOrdenada);
	return listaOrdenada;
	}
	
	
	
	public List<PoligonoRegular> getListaPoligonos() {
		return listaPoligonos;
	}
	
	

	@Override
	public String toString() {
		return "ListaPoligonoRegular [listaPoligonos=" + listaPoligonos + "]";
	}

	public static void main(String[] args) {
		Cuadrado c = new Cuadrado(1);
		TrianguloEquilatero t = new TrianguloEquilatero(1);
		Hexagono h = new Hexagono(1);
		ListaPoligonoRegular l = new ListaPoligonoRegular();
		l.annadirPoligonoRegular(c);
		l.annadirPoligonoRegular(t);
		l.annadirPoligonoRegular(h);
		//lista original
		System.out.println(l.getListaPoligonos());
		//lista ordenada
		System.out.println(l.obtenerListaOrdenadaDePoligono());
		//lista original ?
		System.out.println(l.getListaPoligonos());

	}




}
