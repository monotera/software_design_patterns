/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fintech.a;

/**
 *
 * @author Estudiante
 */
public class FintechARecepcionCredito {
    public void sendCreditForValidate(final FintechACreditos request, final IntFintechARecepcionCredito listener) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("La Fintech A ha recibido su solicitud, dentro de poco recibirá una respuesta");
                FintechAResultadoAprobacion response = new FintechAResultadoAprobacion();
                if (request.getCredito() <= 1500) {
                    response.setAprobado("Y");
                } else {
                    response.setAprobado("N");
                }
                try {
                    Thread.sleep(1000 * 30);
                } catch (Exception e) {
                    e.printStackTrace();
                }

                listener.NotificacionResultado(response);
            }
        }).start();
    }
}
