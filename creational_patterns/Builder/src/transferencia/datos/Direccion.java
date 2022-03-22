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
public class Direccion {
        private String direccion;
    private String ciudad;
    private String pais;
    private String localidad;

    public Direccion() {
    }
    
    public Direccion(String direccion, String ciudad, String pais, String localidad) {
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.localidad = localidad;
    }
    
     
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    @Override
    public String toString() {
        return "Dirección{" + "dirección=" + direccion + ", Ciudad=" + ciudad + ", Pais=" + pais + ", Localidad=" + localidad + '}';
    } 
}
