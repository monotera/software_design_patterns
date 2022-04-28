/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion.productos;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Estudiante
 */
public class ConfiguracionCompuestaProducto extends AbstraccionProducto{
    private List<AbstraccionProducto> productos = new ArrayList<AbstraccionProducto>();

	public ConfiguracionCompuestaProducto(String nombre) {
		super(nombre, 0, 0.0,0);
	}

	@Override
	public double getPrecio() {
		double preciolocal = 0d;
		for (AbstraccionProducto child : productos) {
			preciolocal += child.getPrecio();
		}
		return preciolocal;
	}

	@Override
	public void setPrecio(double precio) {
		throw new UnsupportedOperationException();
	}

	public void AgregarProducto(AbstraccionProducto producto) {
		this.productos.add(producto);
	}

	public boolean RemoverProductos(AbstraccionProducto producto) {
		return this.productos.remove(producto);
	}

}
