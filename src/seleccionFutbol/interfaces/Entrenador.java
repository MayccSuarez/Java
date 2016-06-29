
package seleccionFutbol.interfaces;

/**
 *
 * @author maycc
 */
public class Entrenador extends SeleccionFutbol{
    
    private int id_federacion;

    public Entrenador(int id_federacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.id_federacion = id_federacion;
    }

    public int getId_federacion() {
        return id_federacion;
    }

    public void setId_federacion(int id_federacion) {
        this.id_federacion = id_federacion;
    }
    
    
    @Override
    public void entrenar(){
        System.out.println("Entrenador dirige el entrenamiento (Clase Entrenador)");
    }
    
    @Override
    public void jugar_partido(){
        System.out.println("Entrenador dirige el partido (Clase Entrenador)");
    }
    
    // método propio de la clase Entrenador
    public void planificar_partido(){
        System.out.println("Entrenado planifica los partidos (Clase Entrenador)");
    }
}
