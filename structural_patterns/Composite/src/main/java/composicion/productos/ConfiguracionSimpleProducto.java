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
public class ConfiguracionSimpleProducto extends AbstraccionProducto {

    protected String marca;

    public ConfiguracionSimpleProducto(String nombre, double precio, String marca, double impuesto, Integer cantidad) {
        super(nombre, precio, impuesto, cantidad);
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

}
