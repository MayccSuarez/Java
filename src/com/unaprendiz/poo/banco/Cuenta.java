package com.unaprendiz.poo.banco;

import javax.swing.JOptionPane;

public class Cuenta
{
	// variables globales
	private double saldo;

	// método que contiene el menú de la aplicación
	public void menu()
	{
		String aux; // variable auxiliar
		int opcion = 0;

		do {
			aux = JOptionPane.showInputDialog(null,
					"1. Consultar Saldo\n2. Depositar\n3. Retirar\n4. Salir");
			
			// Verificar si se escogió una opción y que esta sea un número
			if ( aux != null && ValidarNumero.esNumero(aux) )
			{
				opcion = Integer.parseInt(aux);
				
				switch ( opcion )
				{
					case 1:
						consultarSaldo();
						break;
					case 2:
						depositarDinero();
						break;
					case 3:
						retirarDinero();
						break;
					case 4:
						JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
						break;
					default:
						JOptionPane.showMessageDialog(null, "Debe escoger una de la 4 opciones.", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}	
			else
				JOptionPane.showMessageDialog(null, "Debe esoger una opción", "Error", JOptionPane.ERROR_MESSAGE);

		} while ( opcion != 4 );
	}
	
	public void consultarSaldo()
	{
		JOptionPane.showMessageDialog(null, "Su saldo actual es: " + saldo);
	}
	
	public void depositarDinero()
	{
		double monto = 0;
		String aux;
		
		aux = JOptionPane.showInputDialog(null, "Ingrese la cantidad a depositar");
		
		// Comprobar que se ha ingreado una cantidad numérica
		if( aux != null && !aux.equals("") && ValidarNumero.esNumero( aux ))
		{
			monto = Double.parseDouble( aux );
			
			// se deposita el monto siempre y cuando este sea > 0
			if( monto > 0)
				saldo += monto;
			else
				JOptionPane.showMessageDialog(null, "Para hacer un depósito necesita tener dinero!!!",
						"Aviso", JOptionPane.WARNING_MESSAGE);
		}else
			JOptionPane.showMessageDialog(null, "Ingrese una cantidad numérica.");
	}
	
	public void retirarDinero()
	{
		double monto = 0;
		String aux = "";
		
		if( saldo > 0)
		{
			aux = JOptionPane.showInputDialog("¿Cuánto dinero desea retirar: ");
		
			if( aux != null && ValidarNumero.esNumero(aux))
			{
				monto = Double.parseDouble(aux);
				
				if( monto > saldo)
				{
					JOptionPane.showMessageDialog(null, "Ustéd no cuenta con saldo suficiente para realizar esta transacción.\n"
							+ "Su saldo actual es: " + saldo);
				}else {
					saldo -= monto;
					JOptionPane.showMessageDialog(null, "Retirar: " + monto
							+ "\nSu saldo actual despúes de esta transacción es de: " + saldo);
				}
			}
			else
				JOptionPane.showMessageDialog(null, "Ingrese una cantidad numérica!!!");
		
		}else
			JOptionPane.showMessageDialog(null, "Ustéd no tiene saldo!!!",
					"Aviso", JOptionPane.WARNING_MESSAGE);
			
	}
}
