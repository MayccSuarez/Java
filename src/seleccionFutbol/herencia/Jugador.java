
package seleccionFutbol.herencia;

/**
 *
 * @author maycc
 */
public class Jugador extends SeleccionFutbol{
    
    private int dorsal;
    private String posicon_campo_juego;
    
    public Jugador()
    {
        super();
    }
    
    public Jugador(int id, String nombre, String apellidos, int edad,
            int dorsal, String posicion_campo_juego){
        
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicon_campo_juego = posicion_campo_juego;
    }
    
    public void jugar_partido(){
         System.out.println("Estoy jungando");
    }
    
    public void entrenar(){
         System.out.println("Estoy entrenando");
    }
}
