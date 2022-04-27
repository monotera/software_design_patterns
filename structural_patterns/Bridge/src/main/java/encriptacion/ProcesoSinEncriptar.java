/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;

/**
 *
 * @author Estudiante
 */
public class ProcesoSinEncriptar implements InterfaceEncriptar{
    @Override
    public String encryptar(String message, String password) throws Exception {
        return message;
    }
}
