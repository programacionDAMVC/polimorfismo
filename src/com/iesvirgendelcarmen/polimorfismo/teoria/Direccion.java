package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Direccion implements Direcccionable {
	private String direccion;
	private String ciudad;
	
	
	
	public Direccion(String direccion, String ciudad) {
		this.direccion = direccion;
		this.ciudad = ciudad;
	}

	@Override
	public String getDireccion() {
		// TODO Auto-generated method stub
		return direccion;
	}

	@Override
	public String getCiudad() {
		// TODO Auto-generated method stub
		return ciudad;
	}
	
	

}
