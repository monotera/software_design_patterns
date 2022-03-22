/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronprototype;
import implementacion.CatalogoProductos;
import implementacion.FabricaPrototype;
import implementacion.ListaPrecios;
/**
 *
 * @author Estudiante
 */
public class PatronPrototypeMain {
    public static void main(String[] args) {
        
        
        //Creación de la Lista Inicial de Precios
        
        ListaPrecios listadoEstandar = new ListaPrecios("Lista Estándar de Precios");
        for(int c = 1; c<=5; c++){
            CatalogoProductos item = new CatalogoProductos("Producto " + c, c*2);
            listadoEstandar.addCatalogoItem(item);
        }
        
        //Segunda lista para clientes mayoristas.
        //Se obtiene del listado estándar con un 10% de descuento.
         FabricaPrototype.addPrototype(listadoEstandar.getListado(), listadoEstandar);

        ListaPrecios primeraLista = (ListaPrecios)
                FabricaPrototype.getPrototype("Lista Estándar de Precios");
        primeraLista.setListado("Listado con 19%");
        
        for (CatalogoProductos item : primeraLista.getProductos() ) {
            item.setPrecioProducto(item.getPrecioProducto() * 0.81);
        }
         FabricaPrototype.addPrototype(primeraLista.getListado(), primeraLista);
         
         
         FabricaPrototype.addPrototype(listadoEstandar.getListado(), listadoEstandar);

        ListaPrecios segundaLista = (ListaPrecios)
                FabricaPrototype.getPrototype("Lista Estándar de Precios");
        segundaLista.setListado("Listado con 5%");
        
        for (CatalogoProductos item : segundaLista.getProductos() ) {
            item.setPrecioProducto(item.getPrecioProducto() * 0.95);
        }
         FabricaPrototype.addPrototype(segundaLista.getListado(), segundaLista);
         
        
        FabricaPrototype.addPrototype(listadoEstandar.getListado(), listadoEstandar);
        
        ListaPrecios listadoPorMayor = (ListaPrecios)
        FabricaPrototype.getPrototype("Lista Estándar de Precios");
        listadoPorMayor.setListado("Listado de Precios al Por Mayor");
        
        for(CatalogoProductos item : listadoPorMayor.getProductos()){
            item.setPrecioProducto(item.getPrecioProducto()*0.90);
        }
        FabricaPrototype.addPrototype(listadoPorMayor.getListado(), listadoPorMayor);
        
        //Tercera lista de precios para clientes Especiales.
        //Se obtiene de la listado Mayorista menos un 10%.
        ListaPrecios listadoClientesEspeciales = (ListaPrecios)
        FabricaPrototype.getPrototype("Listado de Precios al Por Mayor");
        listadoClientesEspeciales.setListado("Listado de Precios Clientes Especiales");
        
        for(CatalogoProductos item : listadoClientesEspeciales.getProductos()){
            item.setPrecioProducto(item.getPrecioProducto()*0.90);
        }
        
        
        //Imprimimos las diferentes listas.
        System.out.println(listadoEstandar);
        System.out.println(listadoPorMayor);
        System.out.println(listadoClientesEspeciales);
        System.out.println(primeraLista);
        System.out.println(segundaLista);
        
        
    }
    
}
