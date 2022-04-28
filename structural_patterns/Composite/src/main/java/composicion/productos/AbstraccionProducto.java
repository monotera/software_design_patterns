/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion.productos;

/**
 *
 * @author Estudiante
 */
public abstract class AbstraccionProducto {

    protected String nombre;
    protected double precio;
    protected double impuesto;
    protected Integer cantidad;

    public AbstraccionProducto(String nombre, double precio, double impuesto, Integer cantidad) {
        super();
        this.nombre = nombre;
        this.precio = precio;
        this.impuesto = impuesto;
        this.cantidad = cantidad;
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

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(final double impuesto) {
        this.impuesto = impuesto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(final Integer cantidad) {
        this.cantidad = cantidad;
    }
}
