package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public class TipoVehiculo implements Vehiculo {
	
	private int velocidad;
	private int numeroPlazas;
	private TipoCombustible tipoCombustible;
	
	
	
	protected TipoCombustible getTipoCombustible() {
		return tipoCombustible;
	}
	
	@Override
	public void setTipoCombustible(TipoCombustible tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public TipoVehiculo(int velocidad, int numeroPlazas) {
		this.velocidad = velocidad;
		this.numeroPlazas = numeroPlazas;
	}
	
	public TipoVehiculo(int numeroPlazas) {
		
		/*this.velocidad = 0;
		this.numeroPlazas = numeroPlazas;*/
		
		/*this.numeroPlazas = numeroPlazas;*/
		
		this(0, numeroPlazas);
	}
	
	

	@Override
	public String acelerar(int velocidad) {
		this.velocidad += velocidad;
		if (this.velocidad > VELOCIDAD_MAXIMA)
			return "Superada velocidad máxima" +
		" acelerando, velocidad actúal " + this.velocidad;
		return " velocidad actúal " + this.velocidad;
	}

	@Override
	public String frenar(int velocidad) {
		this.velocidad -= velocidad;
		if (this.velocidad < 0)
			this.velocidad = 0;
		return "frenando, velocidad actúal " + this.velocidad;
	}

	@Override
	public int obtenerNumeroDePlazas() {
		// TODO Auto-generated method stub
		return numeroPlazas;
	}

}
