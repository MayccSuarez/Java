
package com.unaprendiz.collections;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author raptor
 */
public class Conjunto {
    
    public static void main(String[] args) {
        
        // Sus elementos se encuentran desordenados y no hay duplicados
        
        Set<String> lista = new HashSet();
    
        lista.add("a");
        lista.add("e");
        lista.add("i");
        lista.add("o");
        lista.add("u");
        // es un duplicado por lo tanto no se mostrará
        lista.add("u");
        
        for(String letra : lista)
            System.out.println(letra);
    }
    
}
