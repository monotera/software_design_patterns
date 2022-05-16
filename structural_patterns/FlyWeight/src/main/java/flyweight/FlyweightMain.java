/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import implementacion.FabricaCanciones;
import implementacion.ListaReproduccion;

/**
 *
 * @author Estudiante
 */
public class FlyweightMain {

    private static final String[] NombreCanciones = new String[1000];
    private static final String[] NombreArtistas = new String[1000];

    private static final String[] NombresListas = new String[4100000];
    private static final List<ListaReproduccion> Listas = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(""
                + "Proceso de creación de listas de reproducción iniciado,\n"
                + "este proceso puede ser muy retrasado debido a la gran cantidad de objetos\n"
                + "que se creará, por favor espere un momento hasta que \n"
                + "sea notificado de que el proceso ha terminado..");

        Runtime runtime = Runtime.getRuntime();
        System.out.println("MaxMemory > " + (runtime.maxMemory() / 1000000));
        FabricaCanciones.HabilitarFlyweight = true;
        InicializarArreglos();
        CrearListaDinamica();
        System.out.println("Total Listas > " + Listas.size());

        long memoryUsed = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memoria Usada => " + (memoryUsed / 1000000));//

    }

    private static void CrearListaDinamica() {
        Random random = new Random();
        int p = 0;
        for (int c = 0; c < NombresListas.length; c++) {
            ListaReproduccion playList = new ListaReproduccion(NombresListas[c]);
            for (int i = 0; i < 10; i++) {
                int song = random.nextInt(NombreCanciones.length);
                int artista = random.nextInt(NombreCanciones.length);
                
                playList.addCancion(NombreCanciones[song], NombreArtistas[artista]);
            }
            Listas.add(playList);
            if (c != 0 && (c + 1) % (NombresListas.length / 10) == 0) {
                p += 10;
                System.out.println("Finalizado " + p + "%");
                System.out.println("Listas Creadas " + Listas.size());
            }
        }
    }

    private static void InicializarArreglos() {
        for (int c = 0; c < NombreCanciones.length; c++) {
            NombreCanciones[c] = "Song " + (c + 1);
            NombreArtistas[c] = "Artista " + (c + 1);

        }

        for (int c = 0; c < NombresListas.length; c++) {
            NombresListas[c] = "PlayList " + (c + 1);
        }
    }
}
