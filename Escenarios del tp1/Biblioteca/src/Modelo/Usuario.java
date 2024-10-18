package Modelo;

import java.util.List;

public class Usuario {

    private String id;
    private String nombre;
    private List<Libro> librosPrestados;
    private Biblioteca biblioteca;
    private Libro libro;

    

    // Constructor 
    public Usuario(String id, String nombre, List<Libro> librosPrestados, Biblioteca biblioteca, Libro libro) {
        this.id = id;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
        this.biblioteca = biblioteca;
        this.libro = libro;
    }


    
    //Getters (accesores)
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public Libro getLibro() {
        return libro;
    }



    //Setters (Modificadores)
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }





    //Metodo para prestar un libro a otro usuario
    public void prestarLibro(Libro libro) {
        if (libro.estaDisponible()) { // Verificamos si el libro está disponible
            libro.prestar(this); // Llamamos al método prestar del libro
            librosPrestados.add(libro); // Agregamos el libro a la lista de libros prestados
            System.out.println(nombre + " ha prestado el libro: " + libro.getTitulo());
        } else {
            System.out.println("El libro " + libro.getTitulo() + " no está disponible.");
        }
    }



    //Metodo para devolver un libro
    public void devolverLibro(Libro libro) {
        if (librosPrestados.contains(libro)) { // Verificamos si el usuario tiene el libro prestado
            libro.devolver(); // Llamamos al método devolver del libro
            librosPrestados.remove(libro); // Eliminamos el libro de la lista de libros prestados
            System.out.println(nombre + " ha devuelto el libro: " + libro.getTitulo());
        } else {
            System.out.println(nombre + " no tiene el libro: " + libro.getTitulo() + " prestado.");
        }
    }




    


    


    


}
