
package seleccionFutbol.polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author maycc
 */
public class Main {
    
    // ArrayList de bojetos SeleccionFutbol independiente de la clase a la que
    // pertenece el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();
    
    public static void main(String[] args) {
        
        SeleccionFutbol quinteros = new Entrenador(504, 1, "Gustavo", "Quinteros", 45);
        SeleccionFutbol dominguez = new Jugador(2, "Alexander", "Dominguez", 28, 1, "Portero");
        SeleccionFutbol pepito = new Masajista("Terapeuta", 10, 3, "Pepito", "Díaz", 40);
        
        integrantes.add(quinteros);
        integrantes.add(dominguez);
        integrantes.add(pepito);
        
        // Concentración
        System.out.println("Todos los integrantes comienzan una concentración. "
                + "Todos ejecutan el mismo método");
        for (SeleccionFutbol integrante : integrantes) {
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.concentrarse();
        }
        
        // Viajar
        System.out.println("\nTodos los integrantes viajan. "
                            +"Todos ejecutan el mismo método");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() + " " +integrante.getApellidos() +" --> ");
            integrante.viajar();
        }
        
        
        // ENTRENAMIENTO
        System.out.println("\nTodos los integrantes tienen una función en un entrenamiento");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.entranamiento();
        }
        
        // PARTIDO DE FUTBOL
        System.out.println("\nTodos los integrantes tienen una función en un partido de futol");
        for(SeleccionFutbol integrante : integrantes){
            System.out.print(integrante.getNombre() +" " +integrante.getApellidos() +" --> ");
            integrante.partido_futbol();
        }
        
        // MÉTODOS PROPIOS DE CADA OBJETO
        
        // PLANIFICAR PARTIDO
        System.out.println("\nSolo el entrenador puede planificar un partido de futbol.");
        System.out.print(quinteros.getNombre() +" " +quinteros.getApellidos() +" --> ");
        ((Entrenador)quinteros).planificar_entrenamiento();
        
        // ENTREVISTA
        System.out.println("\nSolo el jugador pueder dar entrevistas");
        System.out.print(dominguez.getNombre() +" " +dominguez.getApellidos() +" --> ");
        ((Jugador)dominguez).entrevista();
        
        // MASAJE
        System.out.println("\nSolo el Masajista tiene el método para dar masajes");
        System.out.print(pepito.getNombre() +" " +pepito.getApellidos() +" --> ");
        ((Masajista)pepito).dar_masaje();
    } 
}
