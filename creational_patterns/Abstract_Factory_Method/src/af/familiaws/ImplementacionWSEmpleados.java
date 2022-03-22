/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiaws;

import servicios.IServiciosEmpleados;

/**
 *
 * @author aulasingenieria
 */
public class ImplementacionWSEmpleados implements IServiciosEmpleados{
    private static final String[] EMPLEADOS = new String[]{"Juan Guillermo", "David", "Luis Fernando"};
    
    @Override
    public String getClima() {
        System.out.println("Tipo de Servicio: WebServices");
        return "";
    }
}
