/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiarest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import servicios.IServiciosEmpleados;

/**
 *
 * @author aulasingenieria
 */
public class ImplementacionRestEmpleados implements IServiciosEmpleados{
     private static final String[] EMPLEADOS = new String[]{"Juan Guillermo", "David", "Luis Fernando"};
    
    @Override
    public String getClima() {
        System.out.println("Tipo de Servicio: Restful");
        try {

            URL url = new URL("https://fcc-weather-api.glitch.me/api/current?lat=4.60971&lon=-74.08175");//your url i.e fetch data from .
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output = "";
            String aux_output;
            while ((aux_output = br.readLine()) != null) {
                output = output + aux_output; 
            }
            conn.disconnect();
            return output;
        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }
        return null;
    }
}
