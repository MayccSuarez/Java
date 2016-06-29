
package seleccionFutbol.herencia;

/**
 *
 * @author maycc
 */
public class Entrenador extends SeleccionFutbol{
    
    private String id_federacion;
    
    public Entrenador(){
        super();
    }
    
    public Entrenador(int id, String nombre, String apellidos, int edad,
            String id_federacion){
        
        super(id, nombre, apellidos, edad);
        this.id_federacion = id_federacion;
    }
    
    public void dirigir_partido(){
        System.out.println("Estoy dirigiendo un partido");
    }
    
    public void dirigir_entrenamiento(){
         System.out.println("Estoy dirigiendo el entrenamiento");
    }
}
