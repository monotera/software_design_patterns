/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Estudiante
 */
public class ListaReproduccion {

    private String NombreLista;
    private List<Cancion> Canciones = new ArrayList<>();

    public ListaReproduccion(String NombreLista) {
        this.NombreLista = NombreLista;
    }

    public String getNombreLista() {
        return NombreLista;
    }

    public void setNombreLista(String NombreLista) {
        this.NombreLista = NombreLista;
    }

    public List<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(List<Cancion> Canciones) {
        this.Canciones = Canciones;
    }

    public void addCancion(String NombreCancion,String nombreArtista) {
        Canciones.add(FabricaCanciones.CrearItem(NombreCancion, FabricaArtistas.CrearItem(nombreArtista)));
    }

    public void ImprimirLista() {
        String out = "\nPlayList > " + NombreLista;
        for (Cancion playItem : Canciones) {
            out += "\n\t" + playItem.toString();
        }
        System.out.println(out);
    }

}
