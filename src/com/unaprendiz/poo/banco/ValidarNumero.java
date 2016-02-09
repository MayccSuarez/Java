package com.unaprendiz.poo.banco;

public class ValidarNumero
{
	public static boolean esNumero( String num )
	{
		try {
			double numero = Double.parseDouble( num );
			
			return true;
		}catch( NumberFormatException e)
		{
			return false;
		}		
	}
}
