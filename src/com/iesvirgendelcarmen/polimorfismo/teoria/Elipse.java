package com.iesvirgendelcarmen.polimorfismo.teoria;

public class Elipse extends FiguraCircular {

/*	private float semiEjeMayor;
	private float semiEjeMenor;*/
	
	public Elipse(float ejeMenor, float ejeMayor) {
		super(ejeMenor, ejeMayor, "ELIPSE");
	/*	semiEjeMayor = ejeMayor;
		semiEjeMenor = ejeMenor;*/
	}



	@Override
	public float calcularPerimetro() {
		// TODO Auto-generated method stub
		return (float) (NUMERO_PI * ( 3.0 * (semiEjeMayor + semiEjeMenor) - 
				Math.sqrt((3.0 * semiEjeMayor + semiEjeMenor) *
						(semiEjeMayor + 3.0 * semiEjeMenor))));
	}

}
