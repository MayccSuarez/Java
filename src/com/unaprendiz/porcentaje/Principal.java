
package com.unaprendiz.porcentaje;

import java.util.Scanner;

/**
 *
 * @author raptor
 */
public class Principal {
    
    public static void main(String[] args) {
        
        String nombreProducto;
        double precioProducto;
        char continuar;
        
        Scanner entrada = new Scanner(System.in);
        
        Producto p = new Producto();
        
        do{
            System.out.print("Ingrese el nombre del producto: ");
            nombreProducto = entrada.next();
            
            p.setNombre(nombreProducto);
            
            System.out.print("Ingrese precio del producto: ");
            precioProducto = entrada.nextDouble();
            
            p.setPrecio(precioProducto);
            
            System.out.printf("El IVA del producto es %.2f \n", p.porcentajeProducto());
            
            System.out.print("Desea procesar otro producto (s='si'): ");
            continuar = entrada.next().charAt(0);
            
        }while(continuar == 's');
        
        System.out.printf("El total del IVA a pagar es: %.2f\n", p.totalPagar());
    }   
}
