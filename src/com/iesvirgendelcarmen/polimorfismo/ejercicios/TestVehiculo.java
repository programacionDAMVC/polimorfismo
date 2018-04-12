package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo smart = new Smart(60);
		smart.setTipoCombustible(TipoCombustible.ELECTRICO);
		Vehiculo moto  = new Motocicleta(23, 600);
		moto.setTipoCombustible(TipoCombustible.GASOLINA);
		
		System.out.println(smart.acelerar(200));
		System.out.println(moto.frenar(50));
		System.out.println(smart.frenar(100));
		System.out.println(moto.acelerar(50));

	}

}
