package com.unaprendiz.saludo;

import java.util.Scanner;

public class SaludoPersonalizado
{

	public static void main(String[] args)
	{
		String nombre;
		
		Scanner entrada = new Scanner(System.in); //Leer datos del teclado
		
		System.out.print("Cuál es tu nombre: ");
		nombre = entrada.nextLine(); 
		
		System.out.println("Bienvenido: " +nombre);
	}
}
