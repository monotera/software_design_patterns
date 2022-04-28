/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mensajes;

/**
 *
 * @author Estudiante
 */
public interface InterfaceMensaje {

    public InterfaceMensaje ProcesarMensaje();

    public String getContenido();

    public void setContenido(String contenido);
}
