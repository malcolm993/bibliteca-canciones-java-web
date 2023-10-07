/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno
 */
public class ListasCancionesHardcodeadas {
    
    private List<Cancion> canciones;

    public ListasCancionesHardcodeadas() {
        this.canciones = new ArrayList<>();
        cargarCanciones();
    }
    
    private void cargarCanciones(){
        
        canciones.add(new Cancion(1,"Mamotreto","Recreo Urugayo","Vino Guitarra y Mate",2022,"PUNKPOP"));
        canciones.add(new Cancion(2,"Nada Personal","Soda Estereo","Disco2",2000,"ROCK NACIONAL"));
        canciones.add(new Cancion(3,"La cumbia de los trapos","Yeba Brava","Disco3",2021,"CUMBIA"));
        
    }
    
    public List<Cancion> getall(){
        System.out.println("casi casi");
        return canciones;
    }
}
