package com.unaprendiz.aleatorio;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio
{
	
	static int contador = 0; // se usa en el método mostrarResultados() 
	
	public static void main(String[] args)
	{
			
		int numeroVeces; // número de veces a lanzar el dado
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cuantas veces quieres lanzar el dado: ");
		numeroVeces = entrada.nextInt();
		
		lanzarDado( numeroVeces );
		
	}
	
	public static void lanzarDado( int n )
	{
		int cara = 0;  // cara del dado
		Random aleatorio = new Random(); // genera números aleatorios
		
		for( int i = 0; i < n; i++ )
		{
			cara = 1 + aleatorio.nextInt(6);
			
			mostrarResultados( cara );
		}
	}
	
	public static void mostrarResultados( int c )
	{
		contador++;
		
		System.out.printf("%d ", c);
		
		// cada 5 veces que se lance el dado empieza una nueva línea
		if( contador % 5 == 0)
			System.out.println();
	}
}
