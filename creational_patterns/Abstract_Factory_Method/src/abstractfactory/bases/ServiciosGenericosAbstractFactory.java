/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractfactory.bases;
import java.util.Properties;
import utilidades.UtilidadesAcceso;
/**
 *
 * @author aulasingenieria
 */
public class ServiciosGenericosAbstractFactory {
    public ServiciosGenericosAbstractFactory() {}
    
        public static IServiciosBasesGenericos createServiceFactory() {
        Properties props = UtilidadesAcceso.loadProperty(
                "propiedades/AbsFactoryPropiedades.properties");
        String factoryClass = 
                props.getProperty("servicioImplementado");
        try {
            return (IServiciosBasesGenericos) 
                    Class.forName(factoryClass).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
