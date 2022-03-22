/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transferencia.datos;

/**
 *
 * @author Estudiante
 */
public class Programa {
    String nombre;
    int numero_semestres;

    public Programa() {
    }

    public Programa(String nombre, int numero_semestres) {
        this.nombre = nombre;
        this.numero_semestres = numero_semestres;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero_semestres() {
        return numero_semestres;
    }

    public void setNumero_semestres(int numero_semestres) {
        this.numero_semestres = numero_semestres;
    }

    @Override
    public String toString() {
        return "Programa{" + "nombre=" + nombre + ", numero_semestres=" + numero_semestres + '}';
    }
    
}
