/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Estudiante
 */
public class FabricaArtistas {

    public static boolean HabilitarFlyweight = true;
    private static final Map<String, Artista> PLAY_ARTISTA = new HashMap<>();
    private static Long Secuencia = 0L;

    public static Artista CrearItem(String NombreArtista) {
        if (HabilitarFlyweight && PLAY_ARTISTA.containsKey(NombreArtista)) {
            return PLAY_ARTISTA.get(NombreArtista);
        } else {
            Artista playItem = new Artista(++Secuencia, NombreArtista);
            PLAY_ARTISTA.put(NombreArtista, playItem);
            return playItem;
        }
    }
}
