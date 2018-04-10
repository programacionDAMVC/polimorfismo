package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Estudiante implements Comparable<Estudiante>
{

	private String nombre;
	private int edad;
	
	public Estudiante(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + "]\n";
	}

	@Override
	public int compareTo(Estudiante o) {
		// TODO Auto-generated method stub
		return this.edad - o.edad;
	}
	
	
	
}
