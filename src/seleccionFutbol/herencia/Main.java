/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccionFutbol.herencia;

import java.util.ArrayList;

/**
 *
 * @author maycc
 */
public class Main {
    
    // ArrayList de objetos SeleccionFutbol Independiente de la clase hija a la que pertenecen
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    
    public static void main(String[] args) {
        
        Entrenador quinteros = new Entrenador(1, "Gustavo", "Quinteros", 40, "504");
        Jugador dominguez = new Jugador(2, "Alexander", "Dominguez", 28, 0, "Portero");
        Masajista pepito = new Masajista(3, "Pepito", "Diaz", 45, 10, "Licenciado en Fisioterapia");
        
        integrantes.add(quinteros);
        integrantes.add(dominguez);
        integrantes.add(pepito);
        
        // CONCENTRARSE
        System.out.println("Todos los integrantes empiezan una concentración"
                + " Todos ejecutan el mismo método");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.concentrarse();
        }
        
        // VIAJAR
        System.out.println("\nTodos los integrantes viajan."
                + " Todos ejecutan el mismo método");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.viajar();
        }
        
        // CÓDIGO ESPECÍFICO DE LAS CLASES HIJAS
        
        // ENTRANAMIENTO
        System.out.println("\nSolamente el Entrenador y Jugador tienen métodos para entrenar.");
        System.out.print(quinteros.getNombre() +" " +quinteros.getApellidos() +" --> ");
        quinteros.dirigir_entrenamiento();
        System.out.print(dominguez.getNombre() +" " +dominguez.getApellidos() +" --> ");
        dominguez.entrenar();
        
        // MASAJE
        System.out.println("\nSolamente el Masajista tienen el método para dar masajes");
        System.out.print(pepito.getNombre() +" " +pepito.getApellidos() +" --> ");
        pepito.dar_masaje();
        
        // Jugar
        System.out.println("\nSolamente el Entrenador y Jugador tiene métodos para "
                + "disputar un encuentro de futbol");
        System.out.print(quinteros.getNombre() +" " +quinteros.getApellidos() +" --> ");
        quinteros.dirigir_partido();
        System.out.print(dominguez.getNombre() +" " +dominguez.getApellidos() +" --> ");
        dominguez.jugar_partido();
    }
}
