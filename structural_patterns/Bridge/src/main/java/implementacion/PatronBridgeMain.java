/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import encriptacion.ProcesoEncriptarAES;
import encriptacion.ProcesoEncriptarDES;
import encriptacion.ProcesoEncriptarUnicode;
import encriptacion.ProcesoSinEncriptar;
import implementacion.PuenteMensajeEncriptacion;
import implementacion.InterfaceMensajeEncriptacion;

/**
 *
 * @author Estudiante
 */
public class PatronBridgeMain {

    public static void main(String[] args) {
        InterfaceMensajeEncriptacion FormatoAES = new PuenteMensajeEncriptacion(new ProcesoEncriptarAES());
        InterfaceMensajeEncriptacion FormatoDES = new PuenteMensajeEncriptacion(new ProcesoEncriptarDES());
        InterfaceMensajeEncriptacion SinFormato = new PuenteMensajeEncriptacion(new ProcesoSinEncriptar());
        InterfaceMensajeEncriptacion unicodeFormato = new PuenteMensajeEncriptacion(new ProcesoEncriptarUnicode());

        try {
            final String message = "<Curso><Nombre>Patrones de Diseño de Software</Nombre></Curso>";
            String messageAES = FormatoAES.EncryptarMensaje(message, "HG58YZ3CR9123456");
            System.out.println("Formato AES > " + messageAES + "\n");

            String messageDES = FormatoDES.EncryptarMensaje(message, "XMzDdG4D03CKm2Ix");
            System.out.println("Formato DES > " + messageDES + "\n");

            String messageNO = SinFormato.EncryptarMensaje(message, null);
            System.out.println("Sin Formato > " + messageNO + "\n");
            
            String messageUnicode = unicodeFormato.EncryptarMensaje(message, null);
            System.out.println("Formato Unicode > " + messageUnicode + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
