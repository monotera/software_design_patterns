package implementacion;

import fintech.b.FintechBCreditosAPI;
import fintech.b.FintechBRespuestaCredito;
import fintech.b.FintechBSolicitudCredito;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class AdaptadorFitechB implements InterfaceFintechAdaptador{
    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechBSolicitudCredito FBrequest = new FintechBSolicitudCredito();
        FBrequest.setNombreCliente(request.getCliente());
        FBrequest.setValorSolicitado(request.getValor());
        
        FintechBCreditosAPI api = new FintechBCreditosAPI();
        FintechBRespuestaCredito FBresponse = api.sendCreditRequest(FBrequest);
        
        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        response.setAprobacion(FBresponse.isResultadoAprobacion());
        return response;
    }
    
}
