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
public class FabricaServicios {

    public static InterfaceProcesos CrearEjecucionProceso() {
        return new ProxyProcesos();
    }
}
