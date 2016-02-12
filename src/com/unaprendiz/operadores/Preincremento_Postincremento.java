package com.unaprendiz.operadores;

public class Preincremento_Postincremento
{

/*
*  El preincremento lo que hace en pirmer lugar es incrementar el valor una variable
*  El postincremento lo que hace es usar el valor actual de una variable y luego si incrementa su valor
*/
	
	public static void main(String[] args)
	{
		
		int a = 0;
		int b = 0;
		
		++a; // preincremento
		b++; // postincremento
		
		// en este caso no hay diferencia al usar uno u otro
		System.out.println("a vale: " + a);
		System.out.println("b vale: " + b);
		
		// en este caso si que se notará la diferencia 
		System.out.printf("a vale: %d\n", ++a);
		System.out.printf("b vale: %d\n",b++); // b = 1
											  // luego b = 1 + 1 
		
		// en este caso b valdrá 2
		System.out.println(b);
	}
}
