
package seleccionFutbol.polimorfismo;

/**
 *
 * @author maycc
 */
public abstract class SeleccionFutbol {
    
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public SeleccionFutbol(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    public void viajar(){
        System.out.println("Viajar (Clase Padre)");
    }
    
    public void concentrarse(){
        System.out.println("Concentrarse (Clase Padre)");
    }
    
    // Método abstracto se implementa en las clase hijas
    public abstract void entranamiento();
    
    public void partido_futbol(){
        System.out.println("Asiste al partido de futbol (Clase Padre)");
    }
}
