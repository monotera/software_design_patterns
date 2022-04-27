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
public class ProcesoEncriptarUnicode implements InterfaceEncriptar {

    @Override
    public String encryptar(String message, String password) throws Exception {
        StringBuffer unicode = new StringBuffer();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i); // Saca cada carácter
            unicode.append("\\ u" + Integer.toHexString(c)); // Convertir a Unicode
        }
        return unicode.toString();
    }

}
