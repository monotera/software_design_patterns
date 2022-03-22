/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiarest;

/**
 *
 * @author aulasingenieria
 */
import abstractfactory.bases.IServiciosBasesGenericos;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

public class ImplementacionFabricaRestful implements IServiciosBasesGenericos {

    @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionRestEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
        return new ImplementacionRestArticulos();
    }
}
