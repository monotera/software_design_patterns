/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicios;

import europeSoap.SearchTerm;
import java.util.List;
import soap.TStadiumInfo;

/**
 *
 * @author aulasingenieria
 */
public interface IServiciosArticulos {
    public List<SearchTerm> getTerms(String email);
}
