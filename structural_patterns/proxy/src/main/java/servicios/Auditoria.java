/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Estudiante
 */
public class Auditoria {

    public void AuditoriaServicioUsado(String user, String servicio) {
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss");
        System.out.println(user + " utilizó el servicio > "
                + servicio + ", a las " + formater.format(new Date()));
    }
}
