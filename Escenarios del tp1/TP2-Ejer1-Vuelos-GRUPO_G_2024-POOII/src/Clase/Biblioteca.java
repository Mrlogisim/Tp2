package Clase;

import java.util.Date;

/**
 * Clase que representa la Biblioteca
 *
 * @version 2.0
 * @author Grupo G
 */
public class Biblioteca {

    /**
     * Identificador único de la biblioteca
     */
    int idBiblioteca;
    /**
     * lista de libros de la biblioteca
     */
    Libro[] listaLibros;
    /**
     * lista de usuarios de la biblioteca
     */
    Usuario[] listaUsuarios;
    /**
     * lista de libros prestados
     */
    Prestamo[] librosPrestados;

    /**
     * Constructor vacio de la clase Biblioteca
     */
    public Biblioteca() {
    }

    /**
     * Constructor de la clase biblioteca
     *
     * @param idBiblioteca identificador unico de la biblioteca
     * @param listaLibros lista de libros de la biblioteca
     * @param listaUsuarios lista de usuarios de la biblioteca
     */
    public Biblioteca(int idBiblioteca, Libro[] listaLibros, Usuario[] listaUsuarios) {
        this.idBiblioteca = idBiblioteca;
        this.listaLibros = listaLibros;
        this.listaUsuarios = listaUsuarios;


    }

    /**
     * Obtiene la lista de libros
     *
     * @return lista de libros
     */
    public Libro[] getListaLibros() {
        return listaLibros;
    }

    /**
     * Obtiene el id unico de la biblioteca
     *
     * @return id unico de la biblioteca
     */
    public int getIdBiblioteca() {
        return idBiblioteca;
    }

    /**
     * Establece la lista de libros
     *
     * @param listaLibros Lista de libros
     */
    public void setListaLibros(Libro[] listaLibros) {
        this.listaLibros = listaLibros;
    }

    /**
     * Obtiene la lista de libros prestados
     *
     * @return lista de libros prestados
     */
    public Prestamo[] getLibrosPrestados() {
        return librosPrestados;
    }

    /**
     * Establece la lista de libros prestados
     *
     * @param librosPrestados lista libros prestados
     */
    public void setLibrosPrestados(Prestamo[] librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    /**
     * Establece la id unica de la biblioteca
     *
     * @param idBiblioteca id unico de biblioteca
     */
    public void setIdBiblioteca(int idBiblioteca) {
        this.idBiblioteca = idBiblioteca;
    }

    /**
     * Obtiene la lista de usuarios de la biblioteca
     *
     * @return lista de usuarios de la biblioteca
     */
    public Usuario[] getListaUsuarios() {
        return listaUsuarios;
    }

    /**
     * Establece la lista de usuarios
     *
     * @param listaUsuarios lista de usuarios
     */
    public void setListaUsuarios(Usuario[] listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    /**
     * Metodo para agregar un usuario a la biblioteca
     *
     * @param unUsuario un usuario
     *   Si la lista esta vacia 
     */
    public void agregarUsuario(Usuario unUsuario) {
        try {
            this.listaUsuarios[this.listaUsuarios.length + 1] = unUsuario;
        } catch (Exception e) {
             this.listaUsuarios = new Usuario[10];
            this.listaUsuarios[0] = unUsuario;
        }
        
    }

    /**
     * Metodo para agregar un libro a la biblioteca
     *
     * @param unLibro un libro
     */
    public void agregarLibro(Libro unLibro) {
        try {
           this.listaLibros[this.listaLibros.length + 1] = unLibro; 
        } catch (Exception e) {
             this.listaLibros = new Libro[10];
            this.listaLibros[0] = unLibro; 
        }
        
    }

    /**
     * Metodo para agregar un prestamo a la biblioteca
     *
     * @param unLibro libro a prestar
     * @param unUsuario usuario que realiza el prestamos
     * @return si se agrego el prestamo con exito o no
     */
    public String agregarPrestamo(Libro unLibro, Usuario unUsuario) {
        if (unLibro.getEstado().equals("Disponible")) {
            Prestamo unPrestamo = new Prestamo(idBiblioteca, new Date(), null, unLibro, unUsuario);
            try {
                 this.librosPrestados[librosPrestados.length + 1] = unPrestamo;
            } catch (Exception e) {
                 this.librosPrestados = new Prestamo[10];
                 this.librosPrestados[0] = unPrestamo;
            }
           
            unUsuario.agregarPrestamo(unLibro);
            unLibro.setEstado("Prestado");
            return "Libro prestado con exito";
        } else {
            return "El libro ya se encuentra ocupado";
        }

    }

    /**
     * Metodo para devolver un prestamo a la biblioteca
     *
     * @param unLibro libro a devolver
     * @param unUsuario usuario que realiza la devolucion del libro
     * @return el estado del prestamo
     */
    public String devolverPrestamo(Libro unLibro, Usuario unUsuario) {
        Prestamo unPrestamo;
        for (Prestamo prestamoLista : this.librosPrestados) {
            System.out.println("Recorriendo");
            if (prestamoLista.getUnLibro() == unLibro) {
                unPrestamo = prestamoLista;
            }
        }
        unLibro.setEstado("Disponible");
        return "Libro devuelto con exito";

    }
}
