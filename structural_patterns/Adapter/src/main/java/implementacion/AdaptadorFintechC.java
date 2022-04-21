/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;


import fintech.c.FintechCCreditosAPI;
import fintech.c.FintechCRespuestaCredito;
import fintech.c.FintechCSolicitudCredito;

/**
 *
 * @author Estudiante
 */
public class AdaptadorFintechC implements InterfaceFintechAdaptador{
    @Override
    public FintechCreditoRespuesta EnvioSolicitudCredito(FintechSolicitudCredito request) {
        FintechCSolicitudCredito FCrequest = new FintechCSolicitudCredito();
        FCrequest.setNombreCliente(request.getCliente());
        FCrequest.setValorSolicitado(request.getValor());
        
        FintechCCreditosAPI api = new FintechCCreditosAPI();
        FintechCRespuestaCredito FBresponse = api.sendCreditRequest(FCrequest);
        
        FintechCreditoRespuesta response = new FintechCreditoRespuesta();
        response.setAprobacion(FBresponse.isResultadoAprobacion());
        return response;
    }
}
