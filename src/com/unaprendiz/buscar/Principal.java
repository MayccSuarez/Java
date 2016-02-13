package com.unaprendiz.buscar;

import java.util.Scanner;

public class Principal
{

	public static void main(String[] args)
	{
		String cadena;
		char caracter;
		String desea;

		Scanner entrada = new Scanner(System.in);

		BuscarNumeroCaracteres bnc = new BuscarNumeroCaracteres();

		do {
			System.out.print("Escriba la cadena de caracteres: ");
			cadena = entrada.nextLine();
			
			System.out.print("Escriba el carácter a buscar: ");
			caracter = entrada.next().charAt(0); // permite leer un carácter

			bnc.buscarCaracter(cadena, caracter);
			bnc.mensaje(caracter); // muestra el número de veces que se repite cierto carácter

			System.out.print("\n¿Deseas procesar otra cadena (s = si, n = no)? : ");
			desea = entrada.next(); 
			
			entrada.nextLine(); // descarta entrada para que el usuario intente otra vez
		} while ( desea.equals("s") );

	}
}
