package seleccionFutbol.herencia;

/**
 *
 * @author maycc
 */
public class Masajista extends SeleccionFutbol {

    private int anios_experiencia;
    private String titulo;
   
    
    public Masajista() {
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad,
            int anios_experiencia, String titulo) {
        
        super(id, nombre, apellidos, edad);
        this.anios_experiencia = anios_experiencia;
        this.titulo = titulo;
    }
    
    
    public void dar_masaje() {
         System.out.println("Estoy dando un masaje");
    }
}
