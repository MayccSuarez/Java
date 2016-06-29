
package com.unaprendiz.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author raptor
 */
public class MiArrayList {
    
    public static void main(String[] args) {
        
        
        // lista sus elementos se encuentran ordenados y puden duplicarse
        List<String> listaPersonas = new ArrayList();
        
        // agregar elemento a la lista
        listaPersonas.add("Maycol");
        listaPersonas.add("Martin");
        listaPersonas.add("Carlos");
        listaPersonas.add("Juan");
        
        // recorrer lista
        for(String s : listaPersonas){
            System.out.println(s);
        }
        
        // recorrer lista con un objeto iterator
        Iterator<String> iterador = listaPersonas.iterator();
        while(iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }  
}
