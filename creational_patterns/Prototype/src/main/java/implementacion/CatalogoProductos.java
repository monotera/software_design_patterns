/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

/**
 *
 * @author Estudiante
 */
public class CatalogoProductos implements InterfacePrototype<CatalogoProductos> {
    private String nombreProducto;
    private double precioProducto;
    
    public CatalogoProductos(){
    }

    public CatalogoProductos(String nombre, double precio) {
        this();
        this.nombreProducto = nombre;
        this.precioProducto = precio;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    
        
    @Override
    public CatalogoProductos clone() {
        return new CatalogoProductos(this.nombreProducto,this.precioProducto);
    }

    @Override
    public CatalogoProductos deepClone() {
        return clone();
    }

    @Override
    public String toString() {
        return "Catalogo{" + "nombreProducto=" + nombreProducto + ", precioProducto=" + precioProducto + '}';
        
    }

    
}
