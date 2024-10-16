package Modelo;

import java.util.List;

public class Usuario {

    private String id;
    private String nombre;
    private List<Libro> librosPrestados;
    private Biblioteca biblioteca;

    

    // Constructor 
    public Usuario(String id, String nombre, List<Libro> librosPrestados, Biblioteca biblioteca) {
        this.id = id;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
        this.biblioteca = biblioteca;
    }


    public static void prestarLibro(Libro libro) {
        
    }


    public static void devolverLibro(Libro libro) {

    }


}
