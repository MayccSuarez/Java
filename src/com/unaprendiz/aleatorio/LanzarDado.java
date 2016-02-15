package com.unaprendiz.aleatorio;

import java.util.Random;

public class LanzarDado
{

	public static void main(String[] args)
	{
		Random aleatorio = new Random();

		// nro de veces que se repite una cara del dado
		int[] frecuencias = new int[6];

		int cara; // almacena el valor que se lanzó más recientemente

		// lanzar el dado
		for ( int i = 0; i < 100; i++ ) 
		{

			// número aleatorio del 1 al 6
			cara = 1 + aleatorio.nextInt(6);

			// incrementa el contador apropiado
			switch ( cara )
			{
				case 1:
					frecuencias[0]++; // representa al 1 del dado
					break;
				case 2:
					frecuencias[1]++; // representa al 2 del dado
					break;
				case 3:
					frecuencias[2]++; // representa al 3 del dado
					break;
				case 4:
					frecuencias[3]++; // representa al 4 del dado
					break;
				case 5:
					frecuencias[4]++; // representa al 5 del dado
					break;
				case 6:
					frecuencias[5]++; // representa al 6 del dado
					break;
			}
		}

		System.out.println("Cara\tFrecuencia");
		mostarResultados(frecuencias);
	}

	public static void mostarResultados(int[] f)
	{
		int contador = 0; // representa a las caras del dado

		for ( int i : f ) {
			contador++;
			System.out.printf("%d\t%d\n", contador, i);
		}
	}
}