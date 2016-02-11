package com.unaprendiz.buscar;

import java.util.Scanner;

public class Principal
{

	public static void main(String[] args)
	{
		String cadena;
		char caracter;
		
		BuscarNumeroCaracteres bnc = new BuscarNumeroCaracteres();
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Escriba la cadena de caracteres: ");
		cadena = entrada.nextLine();
		
		System.out.print("Escriba el caracter a buscar: ");
		caracter = entrada.next().charAt(0); // permite leer un carácter
		
		bnc.buscarCaracter(cadena, caracter);
		bnc.mensaje(caracter); // muestra el número de veces que se repite cierto carater
	}
}
