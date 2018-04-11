package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class Tecnico extends Trabajador {

	private static final double PAGA_DIARIA = 200.0;
	private boolean titulacionSuperior;
	
	
	
	public Tecnico(String nombreTrabajador, String apellidosTrabajador, boolean titulacionSuperior) {
		super(nombreTrabajador, apellidosTrabajador);
		this.titulacionSuperior = titulacionSuperior;
	}



	@Override
	public double calcularSueldoMensual(int diasTrabajados) {
		// TODO Auto-generated method stub
		return diasTrabajados * PAGA_DIARIA;
	}

}
