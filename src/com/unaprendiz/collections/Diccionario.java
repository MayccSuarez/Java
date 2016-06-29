
package com.unaprendiz.collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author raptor
 */
public class Diccionario {
    
    public static void main(String[] args) {
        
        // creación
        Map map = new HashMap();
        
        HashMap nombres = new HashMap();
        
        // clave --- valor
        nombres.put("Juan", 20);
        nombres.put("María", 16);
        nombres.put("Carlos", 45);
        
        // mostrar diccionario
        System.out.println(nombres.toString());
        
        // obtener el valor de acuerdo a la llave
        String edad = nombres.get("María").toString();
        System.out.println("La edad es es: " +edad);
        
        // comprueba si existe una clave
        boolean respuesta = nombres.containsKey("Juan");
        System.out.println(respuesta);
    }   
}
