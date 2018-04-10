package com.iesvirgendelcarmen.polimorfismo.teoria;

public class TestDireccionable {

	public static void main(String[] args) {
		Direccion direccion1 = new Direccion("avda. granada", "jaén");
		Direcccionable direccion2 = new Direccion("avda. barcelona", "jaén");
		System.out.println(direccion1.getNombreCompleto());
		System.out.println(direccion2.getNombreSinCiudad());
		System.out.println(direccion2.getDireccion() + "---" + direccion2.getCiudad());
		System.out.println(Direcccionable.getDefecto());

	}

}
