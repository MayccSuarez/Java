/*
 * Programa que calcula de acuerdo al numero de dias ingresados la cantidad
 * de centavos hasta ese día. (Si te diera el primer día 1 centavo, el 2 día 2ctv, el
 * 3 día 4ctv, el 4 día 8ctv y así sucesivamente, ¿Cuántos centavos tendrías cumpliendo la
 * regla anterior, para n días?
 */ 
package com.unaprendiz.monedas;

import java.util.Scanner;

/**
 *
 * @author raptor
 */
public class Monedas {
    
    public static void main(String[] args) {
        
        int numeroDias = 0;
        long monedas = 1;
        double dolares = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingresa los días: ");
        numeroDias = entrada.nextInt();
        
        if(numeroDias > 0){
            
            if(numeroDias == 1){
                System.out.println("Para el primer día tienes 1 centavo");
            }else{
                for(int i=1; i<numeroDias; i++){
                    monedas *= 2;
                }
                
                System.out.printf("En %d dás tendrás %d centavos\n", numeroDias, monedas);
                
                // convertir centavos a dólares
                if(monedas >= 100){
                    dolares = monedas/100;
                    System.out.printf("Esto equivale a %.0f dólares con %d centavos\n",
                            dolares, (monedas%100));  
                }                         
            }
        
        }else{
            System.out.println("El número de días debe ser mayor que 0");
        }
               
    }
}
