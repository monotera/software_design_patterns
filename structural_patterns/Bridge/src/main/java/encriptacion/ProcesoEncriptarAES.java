/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptacion;
import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
/**
 *
 * @author Estudiante
 */
public class ProcesoEncriptarAES implements InterfaceEncriptar{
    @Override
    public String encryptar(String message, String password) throws Exception {
        Key key = new SecretKeySpec(password.getBytes(), "AES");
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, key);
        byte[] encVal = c.doFinal(message.getBytes());
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString= encoder.encodeToString(encVal);
        return encodedString;
        
    }
}
