
package seleccionFutbol.polimorfismo;

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
    public void entranamiento() {
        System.out.println("Dirige entraniento (Clase Entrenador)");
    }
    
    @Override
    public void partido_futbol(){
        System.out.println("Dirige un partido (Clase Entrenador)");
    }
    
    public void planificar_entrenamiento(){
        System.out.println("Planificar un entrenamiento");
    }

}
