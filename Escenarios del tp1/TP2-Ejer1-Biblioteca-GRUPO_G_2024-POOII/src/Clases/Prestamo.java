package Clases;

import java.util.Date;

/**
 * Clase que representa a un prestamo de la Biblioteca
 *
 * @version 2.0
 * @author Grupo G
 */
public class Prestamo {

    /**
     * Identificador único del prestamo
     */
    int idLibroPrestamo;
    /**
     * fecha del prestamo
     */
    Date fechaPrestamo;
    /**
     * fecha de devolucion del prestamo
     */
    Date fechaDevolucion;
    /**
     * Libro que se presta el usuario
     */
    Libro unLibro;
    /**
     * Que usuario presta el libro
     */
    Usuario unUsuario;
    /**
     * Constructor vacio de la clase Prestamo
     */
    public Prestamo() {
    }
   /**
     * Constructor de la clase Prestamo
     *
     * @param idLibroPrestamo identificador unico del Prestamo
     * @param fechaPrestamo fecha que se realiza el prestamo
     * @param fechaDevolucion fecha que devuelve libro prestado
     * @param unLibro libro prestado
     * @param unUsuario usuario que presta el libro
     */
    public Prestamo(int idLibroPrestamo, Date fechaPrestamo, Date fechaDevolucion, Libro unLibro, Usuario unUsuario) {
        this.idLibroPrestamo = idLibroPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.unLibro = unLibro;
        this.unUsuario = unUsuario;
    }
      /**
     * Obtiene el id del prestamo
     *
     * @return id del prestamo
     */  
    public int getIdLibroPrestamo() {
        return idLibroPrestamo;
    }
/**
     * Establece el id del libro
     *
     * @param idLibroPrestamo id unico del prestamo
     */
    public void setIdLibroPrestamo(int idLibroPrestamo) {
        this.idLibroPrestamo = idLibroPrestamo;
    }
   /**
     * Obtiene la fecha del prestamo
     *
     * @return fecha del prestamo
     */ 
    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }
/**
     * Establece la fecha del prestamo
     *
     * @param fechaPrestamo fecha del prestamo
     */
    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
   /**
     * Obtiene la fecha de devolucion del prestamo
     *
     * @return fecha devol del prestamo
     */ 
    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }
/**
     * Establece fecha de devol. del libro
     *
     * @param fechaDevolucion fecha de devolucion
     */
    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }
/**
     * Establece el libro prestado
     *
     * @param unLibro libro prestado
     */
    public void setUnLibro(Libro unLibro) {
        this.unLibro = unLibro;
    }
   /**
     * Obtiene el libro prestado
     *
     * @return libro prestado
     */ 
    public Libro getUnLibro() {
        return unLibro;
    }
   /**
     * Obtiene el usuario que solicita el libro
     *
     * @return un usuario
     */ 
    public Usuario getunUsuario() {
        return unUsuario;
    }
/**
     * Establece el usuario que presta el libro
     *
     * @param unUsuario un usuario
     */
    public void setunUsuario(Usuario unUsuario) {
        this.unUsuario = unUsuario;
    }

}
