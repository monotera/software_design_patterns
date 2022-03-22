/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package af.familiaws;

import europeSoap.QueryException_Exception;
import europeSoap.ResponseWrapper;
import europeSoap.SearchTerm;
import java.util.List;
import servicios.IServiciosArticulos;
import soap.ArrayOftStadiumInfo;
import soap.TStadiumInfo;

/**
 *
 * @author aulasingenieria
 */
public class ImplementacionWSArticulos implements IServiciosArticulos {

    private static final String[] ARTICULOS = new String[]{"Disco Duro", "Teclados", "Mouse"};

    @Override
    public List<SearchTerm> getTerms(String email) {
        System.out.println("Tipo de Servicio: WebServices");
        List<SearchTerm> searchTerms;
        try {
            searchTerms = listSearchFields(email).getSearchTermList().getSearchTerms();
            return searchTerms;
            
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return null;

    }

    private static ResponseWrapper listSearchFields(java.lang.String email) throws QueryException_Exception {
        europeSoap.WSCitationImplService service = new europeSoap.WSCitationImplService();
        europeSoap.WSCitationImpl port = service.getWSCitationImplPort();
        return port.listSearchFields(email);
    }

}
