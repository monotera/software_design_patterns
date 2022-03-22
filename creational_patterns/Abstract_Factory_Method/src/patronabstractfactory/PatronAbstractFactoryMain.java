/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patronabstractfactory;

/**
 *
 * @author aulasingenieria
 */
import abstractfactory.bases.IServiciosBasesGenericos;
import abstractfactory.bases.ServiciosGenericosAbstractFactory;
import europeSoap.CitationData;
import europeSoap.CitationList;
import europeSoap.QueryException_Exception;
import europeSoap.ResponseWrapper;
import europeSoap.SearchTerm;
import java.util.Arrays;
import java.util.List;
import servicios.IServiciosArticulos;
import servicios.IServiciosEmpleados;
import soap.ArrayOftPlayerName;
import soap.ArrayOftStadiumInfo;
import soap.TStadiumInfo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
public class PatronAbstractFactoryMain {

    public static void main(String[] args) {

        IServiciosBasesGenericos factory
                = ServiciosGenericosAbstractFactory.createServiceFactory();
        IServiciosEmpleados employeeService = factory.getEmpleados();
        IServiciosArticulos productService = factory.getArticulos();
        String clima = employeeService.getClima();
        System.out.println("Clima > " + clima);
        System.out.println("Citas");
        String email = "testclient@ebi.ac.uk";
        List<SearchTerm> searchTerms = productService.getTerms(email);

        for (SearchTerm s : searchTerms) {
            System.out.println(s.getTerm());
        }
 

    }
    
  

}
