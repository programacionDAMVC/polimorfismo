package com.iesvirgendelcarmen.polimorfismo.teoria;
//Ejemplo típico de interface en java 1.8
public interface Direcccionable {
	
	String getDireccion();
	String getCiudad();
	
	default String getNombreCompleto() {
		return getDireccion()+ "---" + getCiudad();
	}
	
	default String getNombreSinCiudad() {
		return getDireccion() + ", solo dirección";
	}
	
	static String getDefecto() {
		return "IES Virgen del Carmen, Paseo de la Estación 44";
	}
}
