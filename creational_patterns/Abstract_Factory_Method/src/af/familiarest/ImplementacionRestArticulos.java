/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiarest;

import europeSoap.SearchTerm;
import java.util.ArrayList;
import java.util.List;
import servicios.IServiciosArticulos;
import soap.TStadiumInfo;

/**
 *
 * @author aulasingenieria
 */
public class ImplementacionRestArticulos  implements IServiciosArticulos  {
     private static final String[] ARTICULOS = new String[]{"Disco Duro", "Teclados", "Mouse"};

    @Override
    public List<SearchTerm> getTerms(String email) {
        List<SearchTerm> res= new ArrayList<SearchTerm>();
         System.out.println("Tipo de Servicio: Restful");
        return res;
    }
}
