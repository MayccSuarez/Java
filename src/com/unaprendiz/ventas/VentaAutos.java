
package com.unaprendiz.ventas;

import java.util.Scanner;

/**
 *
 * @author raptor
 */
public class VentaAutos {
    
    /* Una compañia se dedica a la de venta de carros usados, paga a su personal de ventas un salario 
    de 500 dolares mensuales, más una comisión de 20 dolares por cada carro vendido, 
    más el 5% del valor de la venta por carro.
    Cada mes la secretaria de la empresa ingresa en la computadora los datos pertinentes.
    Diseñar y codificar un algoritmo que calcule e imprima el salario mensual de un vendedor dado. 
    */
    
    public static void main(String[] args) {
        
       
        String nombreVendedor;
        String opcion;
        double costoAuto;
        double salario = 500;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del vendedor: ");
        nombreVendedor = entrada.next();
        
        System.out.print(nombreVendedor +" ha vendido autos (s=si)? ");
        opcion = entrada.next();
        
        if(opcion.equalsIgnoreCase("s")){
            
            do{
                System.out.print("Valor del auto vendido: ");
                costoAuto = entrada.nextDouble();
            
                salario += 20 + (costoAuto*0.05);
            
                System.out.print("Desea ingresar el precio de otro auto (s = 'si')? ");
                opcion = entrada.next();
            
            }while(opcion.equalsIgnoreCase("s"));
            
            System.out.println("El salario mensual de " +nombreVendedor +" es de: " +salario +" dólares");
            
        }else
            System.out.println("El salario mensual de " +nombreVendedor +" es de: " +salario +" dólares");
        
    }      
}
