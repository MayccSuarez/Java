
package com.unaprendiz.porcentaje;

/**
 *
 * @author raptor
 */
public class Producto {
    
    private String nombre;
    private double precio;
    private final double IVA = 0.14;
    private double total = 0.0;
    
    public Producto(){
        
    }
    
    public Producto(String nombre, double precio){
        
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double porcentajeProducto(){
        
        double porcentaje;
        
        porcentaje = precio * IVA;
        
        total += porcentaje;
        
        return  porcentaje;
    }
    
    public double totalPagar(){
        
        return total;    
    }
    
}
