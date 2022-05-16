/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

/**
 *
 * @author Estudiante
 */
public class Seguridad {
    public boolean Autorizacion(String user,String password){
        if(user.equals("fbolano") && password.equals("pds")){
            System.out.println("Usuario " + user + " autorizado");
            return true;
        }else{
            System.out.println("Usuario " + user + " no autorizado");
            return false;
        }
    }    
}
