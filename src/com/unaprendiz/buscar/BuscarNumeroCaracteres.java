package com.unaprendiz.buscar;

public class BuscarNumeroCaracteres
{
	int contador = 0; // contar el número de veces que se repite cierta letra
	char caracter; // almacena un carácter 
	
	public void buscarCaracter( String cadena, char c)
	{
		for ( int i = 0; i < cadena.length(); i++ ) 
		{
			
			caracter = cadena.charAt( i );
			
			if( caracter == c )
				contador++;
		}		
	}
	
	// muestra el número de veces que se repite cierto carácter
	public void mensaje( char c )
	{
		System.out.printf("Se a encontrado %d %c", contador, c);
		
		contador = 0; // Establece contador a 0 para volver a contar el nro de veces
					  // que se repite cierto carácter
	}
}
