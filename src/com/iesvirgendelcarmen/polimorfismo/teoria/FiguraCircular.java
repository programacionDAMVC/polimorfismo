package com.iesvirgendelcarmen.polimorfismo.teoria;

import java.util.List;

public abstract class FiguraCircular implements Poligono {

	private String nombre;
	protected float semiEjeMenor;
	protected float semiEjeMayor;
	
		
	public FiguraCircular(float ejeMenor, float ejeMayor, String nombre) {
		this.semiEjeMenor = ejeMenor;
		this.semiEjeMayor = ejeMayor;
		this.nombre = nombre;
	}

	@Override
	public String getNombre() {
		return nombre;
	}
	
	@Override
	public abstract float calcularPerimetro();
	
	@Override
	public float calcularArea() {
		return (float) (NUMERO_PI * semiEjeMayor  * semiEjeMenor);
	}
	
	
	
}
