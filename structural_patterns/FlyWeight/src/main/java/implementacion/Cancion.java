/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacion;

/**
 *
 * @author Estudiante
 */
public class Cancion {

    private Long id;
    private String NombreCancion;
    private Artista artista;
    //private byte[] Cancion = new byte[1000000];

    public Cancion(Long id, String NombreCancion) {
        this.id = id;
        this.NombreCancion = NombreCancion;
    }

    public Cancion(Long id, String NombreCancion, Artista artista) {
        this.id = id;
        this.NombreCancion = NombreCancion;
        this.artista = artista;
    }

    public Cancion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreCancion() {
        return NombreCancion;
    }

    public void setNombreCancion(String NombreCancion) {
        this.NombreCancion = NombreCancion;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(String nombreArtista) {
        this.artista = FabricaArtistas.CrearItem(nombreArtista);
    }
    public void setArtista(Artista artista) {
        this.artista = artista;
    }
    
    @Override
    public String toString() {
        return "Canciòn{" + "id=" + id + ", Tema=" + NombreCancion + '}';
    }

}
