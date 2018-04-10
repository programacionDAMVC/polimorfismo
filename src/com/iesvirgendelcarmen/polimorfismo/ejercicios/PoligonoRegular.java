package com.iesvirgendelcarmen.polimorfismo.ejercicios;

public abstract class PoligonoRegular implements 
Comparable<PoligonoRegular> {

	//atributos
	private FigurasRegulares nombrePoligono;
	private int numeroLados;
	protected float longitudLado;

	//constructor
	public PoligonoRegular(FigurasRegulares nombrePoligono, int numeroLados, float longitudLado) {
		this.nombrePoligono = nombrePoligono;
		this.numeroLados = numeroLados;
		this.longitudLado = longitudLado;
	}

	//método que calcula el perímetro
	public float calcularPerimetro() {
		return longitudLado * numeroLados;
	}



	//método que calcula el área, el área depende
	//del tipo de polígono, la debe implementar
	//las clases hijas. Por eso el método es abstracto
	public abstract float calcularArea();

	//sobreescribimos el método toString()
	@Override
	public String toString() {
		return "PoligonoRegular " + nombrePoligono + 
				", longitud de lado " + longitudLado;
	}

	//sobreescribimos el método equals, decimos que
	//dos poligonos son iguales siempre que tengan
	//el mismo número de lados y la misma longitud del lado

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(longitudLado);
		result = prime * result + numeroLados;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PoligonoRegular other = (PoligonoRegular) obj;
		if (Float.floatToIntBits(longitudLado) != Float.floatToIntBits(other.longitudLado))
			return false;
		if (numeroLados != other.numeroLados)
			return false;
		return true;
	}

	//devuelve la diferencia de número de lados
	@Override
	public int compareTo(PoligonoRegular o) {
		// TODO Auto-generated method stub
		return this.numeroLados - o.numeroLados;
	}






}
