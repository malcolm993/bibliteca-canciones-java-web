/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Alumno
 */
public class Cancion {
    
      private int isCancion;
    private String nombreCancion;
    private String nombreArtista;
    private String nombreAlbum;
    private int anio;
    private String genero;

    public Cancion(int isCancion, String nombreCancion, String nombreArtista, String nombreAlbum, int anio, String genero) {
        this.isCancion = isCancion;
        this.nombreCancion = nombreCancion;
        this.nombreArtista = nombreArtista;
        this.nombreAlbum = nombreAlbum;
        this.anio = anio;
        this.genero = genero;
    }

    public Cancion() {
        
    }

    public int getIsCancion() {
        return isCancion;
    }

    public String getNombreCancion() {
        return nombreCancion;
    }

    public String getNombreArtista() {
        return nombreArtista;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public int getAnio() {
        return anio;
    }

    public String getGenero() {
        return genero;
    }

    public void setIsCancion(int isCancion) {
        this.isCancion = isCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion;
    }

    public void setNombreArtista(String nombreArtista) {
        this.nombreArtista = nombreArtista;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "ListasCancionesHardcodeadas{" + "isCancion=" + isCancion + ", nombreCancion=" + nombreCancion + ", nombreArtista=" + nombreArtista + ", nombreAlbum=" + nombreAlbum + ", anio=" + anio + ", genero=" + genero + '}';
    }
    
   
    
}
