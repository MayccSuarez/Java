
package seleccionFutbol.interfaces;

/**
 *
 * @author maycc
 */
public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int anios_experiencia;

    public Masajista(String titulacion, int anios_experiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.anios_experiencia = anios_experiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnios_experiencia() {
        return anios_experiencia;
    }

    public void setAnios_experiencia(int anios_experiencia) {
        this.anios_experiencia = anios_experiencia;
    }
    
    
    @Override
    public void entrenar(){
        System.out.println("Masajista asiste en el entrenamiento (Clase Masajista)");
    }
    
    // método propio clase Masajista
    public void dar_masaje(){
        System.out.println("Masajista da un masaje");
    }
}
