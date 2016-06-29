
package com.unaprendiz.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author raptor
 */
public class ArrayListEnteros {
    
    public static void main(String[] args) {
        
        // calcular el tiempo de procesamiento en milisegundos
        long inicio1, fin1, inicio2, fin2; 
        
        inicio1 = System.currentTimeMillis();
        
        List<Integer> numeros = new ArrayList();
        for(int i=0; i < 10000; i++)
            numeros.add(i);
        
        fin1 = System.currentTimeMillis();
            
        System.out.println("La primera lista se demoró en procesar: " + (fin1 -inicio1));
        
        inicio2 = System.currentTimeMillis();
        
        // es más optimo por temas de rendimiento
        // ya que el procesador se ejeucta 1 vez y reserva el espacio
        List<Integer> lista2 = new ArrayList(10000);
         for(int i=0; i < 10000; i++)
            lista2.add(i);
         
         fin2 = System.currentTimeMillis();
         
         System.out.println("La segunda lista se demoró en procesar: " + (fin2 - inicio2));
         
         // Algunos métodos
         
         // obtener un elemento en base a una posición específica
         int elemento = lista2.get(5);
         System.out.println("El elemento en la posición 5 es: " +elemento);
         
         if(lista2.contains(100))
             System.out.println("El elemento si se encuentra en la lista");
    }
}
