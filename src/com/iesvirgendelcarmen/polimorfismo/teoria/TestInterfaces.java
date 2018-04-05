package com.iesvirgendelcarmen.polimorfismo.teoria;

import java.util.ArrayList;
import java.util.List;

public class TestInterfaces {

	public static void main(String[] args) {
		
		List<A> listaDeA = new ArrayList<>();
		List<D> listaDeD = new ArrayList<>();
		
		A referencia = new B();
		/*referencia.mentodoA1();
		referencia.metodoA2("argumento1");*/
		
		A nuevaReferencia = new C();
	/*	nuevaReferencia.mentodoA1();
		nuevaReferencia.metodoA2("argumento2");*/
		
		A otraReferencia = new E();
		D otraNuevaReferencia = new E();
		E anotherReferencia = new E();
		F f1 = new F(); 
		B f2 = new F(); 
		A f3 = new F(); 
		D f4 = new F(); 
		
		listaDeA.add(referencia);
		listaDeA.add(nuevaReferencia);
		listaDeA.add(otraReferencia);
	//	listaDeA.add(otraNuevaReferencia); no funciona
		listaDeA.add(anotherReferencia);
		listaDeA.add(f1);
		listaDeA.add(f2);
		listaDeA.add(f3);
	//	listaDeA.add(f4);  no funciona
		
		listaDeD.add(anotherReferencia);
		listaDeD.add(otraNuevaReferencia);
		listaDeD.add(f4);
		listaDeD.add(f1);
		
		
		for (A a : listaDeA) {
			a.mentodoA1();
			a.metodoA2("argumento");
		}
		
		System.out.println("Método D");
		
		for (D d : listaDeD) {
			System.out.println(d.metodoD(2));
		}

	}

}
