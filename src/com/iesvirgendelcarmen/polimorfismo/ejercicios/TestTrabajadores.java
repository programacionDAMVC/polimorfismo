package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class TestTrabajadores {

	public static void main(String[] args) {
		
		Oficial oficial1 = new Oficial("juan", "garcía garcía", "oficial primera");
		Trabajador oficial2 = new Oficial("pedro", "anguita garcía", "oficial segunda");
		Trabajador tecnico  = new Tecnico("elisa", "gutierrez mellado", true);
		
		System.out.printf("%S de clase %s y gana este mes %.2f%n",
				oficial1.obtenerNombreCompleto(), oficial1.getClaseDeOficial(),
				oficial1.calcularSueldoMensual(20));
		
		System.out.printf("%S de clase %s y gana este mes %.2f%n",
				oficial2.obtenerNombreCompleto(), ((Oficial) oficial2).getClaseDeOficial(),
				oficial2.calcularSueldoMensual(20));
		
		System.out.printf("%S  gana este mes %.2f%n",
				tecnico.obtenerNombreCompleto(), tecnico.calcularSueldoMensual(20));
		

	}

}
