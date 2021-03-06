
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
    Además deberá mostrar el número de autos vendidos por el vendedor.
    */
    
    public static void main(String[] args) {
        
       
        String nombreVendedor;
        String opcion;
        double costoAuto;
        double salario = 500;
        int contador = 0;   // contar autos vendidos
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del vendedor: ");
        nombreVendedor = entrada.next();
        
        System.out.print(nombreVendedor +" ha vendido autos (s=si)? ");
        opcion = entrada.next();
        
        // Si vendedor a logrado vender autos se realizan las operaciones
        if(opcion.equalsIgnoreCase("s")){
            
            do{
                
                contador++;
                
                System.out.print("Valor del auto vendido: ");
                costoAuto = entrada.nextDouble();
                
                salario += 20 + (costoAuto*0.05);
            
                System.out.print("Desea ingresar el precio de otro auto (s = 'si')? ");
                opcion = entrada.next();
            
            }while(opcion.equalsIgnoreCase("s"));
            
            System.out.printf("%s ha vendido %d auto(s) usado(s)\n", nombreVendedor, contador);
            System.out.println("El salario mensual de " +nombreVendedor +" es de: " +salario +" dólares");
        
        // De lo contrario sólo se le paga el sueldo de $500
        }else{
            System.out.printf("%s no ha vendido ningún auto\n", nombreVendedor);
            System.out.println("El salario mensual de " +nombreVendedor +" es de: " +salario +" dólares");
        }
    }      
}
