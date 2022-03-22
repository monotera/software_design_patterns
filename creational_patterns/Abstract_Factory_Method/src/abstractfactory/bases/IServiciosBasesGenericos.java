/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractfactory.bases;

import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;

/**
 *
 * @author aulasingenieria
 */
public interface IServiciosBasesGenericos {
    public IServiciosEmpleados getEmpleados();
    public IServiciosArticulos getArticulos();
}
