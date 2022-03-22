/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Estudiante
 */
public class FabricaPrototype {
    private static Map<String,InterfacePrototype> prototypes = new HashMap<String, InterfacePrototype>();
    
    public static InterfacePrototype getPrototype(String prototypeName){
        return prototypes.get(prototypeName).deepClone();
    }
    
    public static void addPrototype(String prototypeName,InterfacePrototype prototype){
        prototypes.put(prototypeName, prototype);
    }
}
