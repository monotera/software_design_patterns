/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Estudiante
 */
public class articulos {
     private Long idarticulo;
    private String nombrearticulo;
    private double valor;

     public articulos(Long idarticulo, String nombrearticulo, double valor) {
        this.idarticulo = idarticulo;
        this.nombrearticulo = nombrearticulo;
        this.valor = valor;
    }
     
    public articulos() {
    }

    
    public Long getIdarticulo() {
        return idarticulo;
    }

    public void setIdarticulo(Long idarticulo) {
        this.idarticulo = idarticulo;
    }

    public String getNombrearticulo() {
        return nombrearticulo;
    }

    public void setNombrearticulo(String nombrearticulo) {
        this.nombrearticulo = nombrearticulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public String toString() {
        return "Articulo{" + "idarticulo=" + idarticulo + ", nombrearticulo=" + nombrearticulo + ", valor=" + valor + '}';
    }
}
