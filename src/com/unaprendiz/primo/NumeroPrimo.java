
package com.unaprendiz.primo;

import java.util.Scanner;

/**
 *
 * @author maycc
 */
public class NumeroPrimo {
    
    public static void main(String[] args) {
        
        int numero;
        int contador = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            
            System.out.print("Ingresa cualquier número > 0: ");
            numero = entrada.nextInt();
            
        }while( numero<=0 );
     
     
        // comprobar si un número es primo
        for(int i=1; i <= numero; i++){
            
            if(numero % i == 0)
               contador++;
            
        }
    
       // un número primo solo tiene 2 divisiones exáctas
        if( contador == 2 || numero == 1)
            System.out.println("El número " +numero +" es un número primo");
        else
            System.out.printf("El número %d no es un número primo, tiene %d divisiones exáctas\n",
                    numero, contador);
        
    } 
}
