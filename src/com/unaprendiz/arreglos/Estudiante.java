
package com.unaprendiz.arreglos;

import java.util.Scanner;

/**
 *
 * @author raptor
 */
public class Estudiante {
    
    private String nombre;
    private int nota;
    
    public Estudiante(String nombre, int nota){
        this.nombre = nombre;
        this.nota = nota;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getNota(){
        return nota;
    }
    
    
    public static void main(String[] args) {
        
        String nombreBusqueda;
        boolean encontrado = false; // si se encuentra el estudiante
        
        Scanner entrada = new Scanner(System.in);
        
        Estudiante[] estudiantes = new Estudiante[3];
        
        estudiantes[0] = new Estudiante("Juan", 8);
        estudiantes[1] = new Estudiante("Pedro", 7);
        estudiantes[2] = new Estudiante("Carlos", 10);
        
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        nombreBusqueda = entrada.next();
        
        // realiza la busqueda de un estudiante por su nombre y muestra su nota
        for(Estudiante e : estudiantes){
            if(e.getNombre().equals(nombreBusqueda)){
                System.out.println("El estudiante " +e.getNombre() +" tiene una nota de: " +e.getNota());
                encontrado = true;
            }
        }
        
        // si el estudiante no se encuentra
        if(encontrado == false)
            System.out.println("El estudiante no se encuentra");
              
    }
}
