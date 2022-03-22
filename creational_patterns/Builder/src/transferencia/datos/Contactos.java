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
public class Contactos {
    private String nombres;
    private Telefonos telefonos;
    private Direccion direccion;
    
    public Contactos() {
    }

    public Contactos(String nombres, Telefonos telefonos,Direccion direccion) {
        this.nombres = nombres;
        this.telefonos = telefonos;
        this.direccion = direccion;
    }
     public Contactos(String nombres, Telefonos telefonos) {
        this.nombres = nombres;
        this.telefonos = telefonos;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Telefonos getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(Telefonos telefonos) {
        this.telefonos = telefonos;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "Contactos{" + "Nombres=" + nombres + ", Telefonos=" + telefonos + '}';
    }
}
