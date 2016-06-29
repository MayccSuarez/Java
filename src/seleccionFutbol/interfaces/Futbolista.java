
package seleccionFutbol.interfaces;

/**
 *
 * @author maycc
 */
public class Futbolista extends SeleccionFutbol{

    private int dorsal;
    private String posición_campo_juegp;
    
    public Futbolista(int id, String nombre, String apellidos, int edad, 
            int dorsal, String posición_campo_juegp) {
        
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.posición_campo_juegp = posición_campo_juegp;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosición_campo_juegp() {
        return posición_campo_juegp;
    }

    public void setPosición_campo_juegp(String posición_campo_juegp) {
        this.posición_campo_juegp = posición_campo_juegp;
    }

    
    
    @Override
    public void entrenar(){
        System.out.println("Realiza un entrenamiento (Clase Futbolista)");
    }
    
    @Override
    public void jugar_partido() {
         System.out.println("Juega un partido (Clase Futbolista)");
    }
    
    // método propio de esta clase
    public void dar_entrevista(){
        System.out.println("Dar una entrevista (Clase Futbolista)");
    }
}
