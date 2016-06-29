
package seleccionFutbol.polimorfismo;

/**
 *
 * @author maycc
 */
public class Jugador extends SeleccionFutbol{

    private int dorsal;
    private String posicion_campo_juego;
    
    public Jugador(int id, String nombre, String apellidos, int edad, int dorsal,
            String posicion_campo_juego){
        
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posicion_campo_juego = posicion_campo_juego;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion_campo_juego() {
        return posicion_campo_juego;
    }

    public void setPosicion_campo_juego(String posicion_campo_juego) {
        this.posicion_campo_juego = posicion_campo_juego;
    }
    
    
    
    @Override
    public void entranamiento() {
        System.out.println("Realiza un entrenamiento (Clase Jugador)");
    }
      
    @Override
    public void partido_futbol() {
        System.out.println("Juega un partido (Clase Jugador)");
    }
    
    public void entrevista(){
        System.out.println("Da una entrevista");
    }
}
