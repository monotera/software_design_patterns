/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech.b;

/**
 *
 * @author Estudiante
 */
public class FintechBCreditosAPI {

    public FintechBRespuestaCredito sendCreditRequest(FintechBSolicitudCredito request) {
        FintechBRespuestaCredito response = new FintechBRespuestaCredito();
        if (request.getValorSolicitado() <= 5000) {
            response.setResultadoAprobacion(true);
        } else {
            response.setResultadoAprobacion(false);
        }
        return response;
    }
}
