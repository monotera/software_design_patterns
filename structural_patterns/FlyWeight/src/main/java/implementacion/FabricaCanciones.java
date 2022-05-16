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
public class FabricaCanciones {

    public static boolean HabilitarFlyweight = true;
    private static final Map<String, Cancion> PLAY_CANCION = new HashMap<>();
    private static Long Secuencia = 0L;

    public static Cancion CrearItem(String NombreTema,Artista artistas) {
        if (HabilitarFlyweight && PLAY_CANCION.containsKey(NombreTema)) {
            return PLAY_CANCION.get(NombreTema);
        } else {
            Cancion playItem = new Cancion(++Secuencia, NombreTema);
            playItem.setArtista(artistas.getNombre());
            PLAY_CANCION.put(NombreTema, playItem);
            return playItem;
        }
    }
}
