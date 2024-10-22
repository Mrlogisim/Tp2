package Clase;

/**
 * Clase que representa a un Usuario de la Biblioteca
 *
 * @version 2.0
 * @author Grupo G
 */
public class Usuario {

    /**
     * Identificador único del Usuario
     */
    int idUsuario;
    /**
     * Nombres del Usuario
     */
    String nombre;

    /**
     * Lista libros de la Biblioteca
     */
    Libro[] librosPrestados;

    /**
     * Constructor vacio de la clase Usuario
     */
    public Usuario() {
    }

    /**
     * Constructor de la clase Usuario
     *
     * @param idUsuario identificador unico del Usuario
     * @param nombre nombres del Usuario
     * @param librosPrestados lista de libros prestados por el usuario
     */
    public Usuario(int idUsuario, String nombre, Libro[] librosPrestados) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
    }

    /**
     * Obtiene el id de Usuario
     *
     * @return idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Establece el id del Usuario
     *
     * @param idUsuario id del usuario
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * Obtiene el nombres del usuario
     *
     * @return nombres de usuario
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece los nombres del usuario
     *
     * @param nombre Nombres del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene lista libros prestados por el usuario
     *
     * @return lista libros prestados por el usuario
     */
    public Libro[] getLibrosPrestados() {
        return librosPrestados;
    }

    /**
     * Establece la lista de libros prestados por el usuario
     *
     * @param librosPrestados libros prestados por el usuario
     */
    public void setLibrosPrestados(Libro[] librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    /**
     * Metodo para agregar nuevo libro a la lista de prestamos por el usuario
     *
     * @param unLibro libro que se agrega a la lista de prestamos por el usuario
     */
    public void agregarPrestamo(Libro unLibro) {
        try {
            this.librosPrestados[librosPrestados.length + 1] = unLibro;
        } catch (Exception e) {
             this.librosPrestados = new Libro[10];
            this.librosPrestados[0] = unLibro;
        } 
        
    }

}
