/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import servicios.Auditoria;
import servicios.Seguridad;

/**
 *
 * @author Estudiante
 */
public class ProxyProcesos implements InterfaceProcesos {

    @Override
    public void EjecutarProcesos(int IdProceso, String Usuario, String Password) throws Exception {
        Seguridad securityService = new Seguridad();
        ProxyValidacion pv = new ProxyValidacion();
        String number_intends = pv.persistirIntento();

        if(number_intends.equals("fail")){
            throw new Exception("El usuario '" + Usuario
                    + "' ya no tiene mas intentos!");
        }
        
        if (!securityService.Autorizacion(Usuario, Password)) {
            throw new Exception("El usuario '" + Usuario
                    + "' no tiene privilegios para ejecutar el proceso");
        }

        ProcesoDefecto ejecutorProcess = new ProcesoDefecto();
        ejecutorProcess.EjecutarProcesos(IdProceso, Usuario, Password);

        Auditoria audit = new Auditoria();
        audit.AuditoriaServicioUsado(Usuario, ProcesoDefecto.class.getName());
    }

}
