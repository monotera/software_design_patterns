/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoradores;
import mensajes.InterfaceMensaje;
/**
 *
 * @author Estudiante
 */
public abstract class DecoradorMensaje implements InterfaceMensaje{
    protected InterfaceMensaje Formatomensaje;
    
    public DecoradorMensaje(InterfaceMensaje mensaje) {
        this.Formatomensaje = mensaje;
    }

    @Override
    public String getContenido() {
        return Formatomensaje.getContenido();
    }

    @Override
    public void setContenido(String contenido) {
         Formatomensaje.setContenido(contenido); 
    }

    
    
    
}