/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;
import encriptacion.InterfaceEncriptar;
/**
 *
 * @author Estudiante
 */
public class PuenteMensajeEncriptacion implements InterfaceMensajeEncriptacion {
    private InterfaceEncriptar ProcesoEncryptacion;
    
    public PuenteMensajeEncriptacion(InterfaceEncriptar ProcesoEncryptacion){
        this.ProcesoEncryptacion = ProcesoEncryptacion;
    }
    
    @Override
    public String EncryptarMensaje(String message, String password) throws Exception {
        return ProcesoEncryptacion.encryptar(message, password);
    }
}
