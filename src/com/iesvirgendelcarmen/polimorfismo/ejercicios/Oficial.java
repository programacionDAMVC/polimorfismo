package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Oficial extends Trabajador {

	private static final double PAGA_DIARIA = 100.0;
	private String claseDeOficial;
	
	
	public Oficial(String nombreTrabajador, String apellidosTrabajador, String claseDeOficial) {
		super(nombreTrabajador, apellidosTrabajador);
		this.claseDeOficial = claseDeOficial;
	}


	public String getClaseDeOficial() {
		return claseDeOficial;
	}


	@Override
	public double calcularSueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return diasTrabajados * PAGA_DIARIA;
	}

}
