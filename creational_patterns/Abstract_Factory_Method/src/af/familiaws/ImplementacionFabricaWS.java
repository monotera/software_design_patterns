/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiaws;

import abstractfactory.bases.IServiciosBasesGenericos;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

/**
 *
 * @author aulasingenieria
 */
public class ImplementacionFabricaWS implements IServiciosBasesGenericos{
     @Override
    public IServiciosEmpleados getEmpleados() {
        return new ImplementacionWSEmpleados();
    }

    @Override
    public IServiciosArticulos getArticulos() {
         return new ImplementacionWSArticulos();
    }
    
}
