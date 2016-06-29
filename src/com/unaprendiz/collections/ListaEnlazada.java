
package com.unaprendiz.collections;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author raptor
 */
public class ListaEnlazada {
    
    public static void main(String[] args) {
        
        // Formas de declarar una lista
        
        // apoyándonos en la interfaz
        List<Integer> lista = new LinkedList();
        
        lista.add(1);
        lista.add(2);
        lista.add(3);
        
        
        // apoyándonos en la clase
        LinkedList lista2 = new LinkedList();
        
        lista2.add(1);
        lista2.add("Nombre");
        lista2.add(3);
        
        // métodos
        System.out.println("Numero de elementos en lista2: " +lista2.size());
        // obtener un elemento en base a su índice
        System.out.println("Elemento en la posición 1 " +lista2.get(1));
        // obtener el último elemento
        System.out.println(lista2.getLast());
        System.out.println(lista2.get(lista2.size() -1));
    }
    
}
