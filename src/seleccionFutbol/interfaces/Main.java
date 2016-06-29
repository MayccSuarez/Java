
package seleccionFutbol.interfaces;

import java.util.ArrayList;

/**
 *
 * @author maycc
 */
public class Main {
    
    // ArrayList de objetos SeleccionFutbol independiente de la clase hija
    // a la que pertenece el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {
        
        SeleccionFutbol quinteros = new Entrenador(504, 1, "Gustavo", "Quinteros", 40);
        SeleccionFutbol dominguez = new Futbolista(2, "Alexander", "Dominguez", 28, 2, "Portero");
        SeleccionFutbol pepito = new Masajista("Terapeuta", 10, 3, "Pepito", "Díaz", 40);
        
        integrantes.add(quinteros);
        integrantes.add(dominguez);
        integrantes.add(pepito);
        
        // CONCENTRACIÓN
        System.out.println("\nTodos los integrantes comienzan una concentración. "
                + "Todos ejecutan el mismo método");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.concentrase();
        }
        
        // VIAJAR
        System.out.println("\nTodos los integrantes viajan. "
                + "Todos ejecutan el mismo método");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.viajar();
        }
        
        // ENTRENAMIENTO
        System.out.println("\nTodos los integrantes tienen su función en un entrenamiento. "
                + "(Especialización)");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.entrenar();
        }
        
        // JUGAR PARTIDO DE FUTBOL
        System.out.println("\nTodos los integrantes tienen una función en un partido de futbol");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.jugar_partido();
        }
        
        // MÉTODOS PROPIOS DE CADA OBJETO
        
        // PLANIFICAR ENTRENAMIENTO
        System.out.println("\nSolo el entrenador tiene el método para planificar un entrenamiento");
        System.out.print(quinteros.getNombre() +" " +quinteros.getApellidos() + " --> ");
        ((Entrenador)quinteros).planificar_partido();
        
         // DAR ENTREVISTA
        System.out.println("\nSolo el jugador tiene el método para dar una entrevista");
        System.out.print(dominguez.getNombre() +" " +dominguez.getApellidos() + " --> ");
        ((Futbolista)dominguez).dar_entrevista();
        
         // DAR MASAJE
        System.out.println("\nSolo el masajiste tiene el método para dar un masaje");
        System.out.print(pepito.getNombre() +" " +pepito.getApellidos() + " --> ");
        ((Masajista)pepito).dar_masaje();
    }
}
