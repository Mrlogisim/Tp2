package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * Biblioteca
 */
public class Biblioteca {

    // Atributos privados
    private List<Libro> listaLibros;
    private List<Usuario> listaUsuarios;

    // Constructor
    public Biblioteca() {
        this.listaLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }



    //Getters (accesores)
    public List<Libro> getListaLibros() {
        return listaLibros;
    }

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }



    //Setters (modificadores)
    public void setListaLibros(List<Libro> listaLibros) {
        this.listaLibros = listaLibros;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }


    //Prestar un libro a un usuario
    public void prestarLibro(Libro libro, Usuario usuario) {
        if (libro.estaDisponible()) { // Verificamos si el libro está disponible
            libro.prestar(usuario); // Se asocia el libro al usuario
            usuario.prestarLibro(libro); // El usuario toma prestado el libro
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + usuario.getNombre());
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible para el préstamo.");
        }
    }

    //Devolver un libro a la biblioteca
    public void devolverLibro(Libro libro) {
        Usuario usuarioActual = libro.getUsuarioActual(); // Obtenemos el usuario que tiene el libro
        if (usuarioActual != null) {
            usuarioActual.devolverLibro(libro); // El usuario devuelve el libro
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto a la biblioteca.");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está prestado a ningún usuario.");
        }
    }

    //Registrar un libro en la biblioteca
    public void registrarLibro(Libro libro) {
        if (listaLibros.contains(libro)) {
            listaLibros.add(libro); // Añadimos el libro a la lista de la biblioteca
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido registrado en la biblioteca.");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' ya está registrado.");
        }
    }

    //Registrar un usuario en la biblioteca
    public void registrarUsuario(Usuario usuario) {
        if (listaUsuarios.contains(usuario)) {
            listaUsuarios.add(usuario); // Añadimos el usuario a la lista de usuarios registrados
            System.out.println("El usuario '" + usuario.getNombre() + "' ha sido registrado en la biblioteca.");
        } else {
            System.out.println("El usuario '" + usuario.getNombre() + "' ya está registrado.");
        }
    }
}


    


    
