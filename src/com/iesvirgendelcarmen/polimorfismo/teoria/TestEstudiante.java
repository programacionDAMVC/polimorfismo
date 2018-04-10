package com.iesvirgendelcarmen.polimorfismo.teoria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEstudiante {

	public static void main(String[] args) {
		
		Estudiante estudiante1 = new Estudiante("juanito", 25);
		Estudiante estudiante2 = new Estudiante("lusito", 35);
		Estudiante estudiante3 = new Estudiante("elisita", 15);
		
		ArrayList<Estudiante> lista = new ArrayList<>();
		lista.add(estudiante1);
		lista.add(estudiante2);
		lista.add(estudiante3);
		
		System.out.println(lista);
		
		ArrayList<Estudiante> listaOriginal = (ArrayList<Estudiante>) lista.clone();
		Collections.sort(lista);
		System.out.println(lista);
		System.out.println(listaOriginal);
	}

}
