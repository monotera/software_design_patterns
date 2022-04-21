/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech.c;

/**
 *
 * @author Estudiante
 */
public class FintechCCreditosAPI {

    public FintechCRespuestaCredito sendCreditRequest(FintechCSolicitudCredito request) {
        FintechCRespuestaCredito response = new FintechCRespuestaCredito();
        try {
            if (request.getValorSolicitado() <= 5000) {
                response.setResultadoAprobacion(true);
            } else {
                throw new IllegalArgumentException("La transaccion fue denegada");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
            response.setResultadoAprobacion(false);
        }

        return response;
    }
}
