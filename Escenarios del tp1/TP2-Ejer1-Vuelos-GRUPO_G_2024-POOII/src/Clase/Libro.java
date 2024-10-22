package Clase;

/**
 * Clase que representa a un Libro de la Biblioteca
 *
 * @version 2.0
 * @author Grupo G
 */
public class Libro {

    /**
     * Identificador único del libro
     */
    int idLibro;
    /**
     * titulo del libro
     */
    String titulo;
    /**
     * autor del libro
     */
    String autor;
    /**
     * num de paginas del libro
     */
    int numPagina;
    /**
     * estado del libro
     */
    String estado;

    /**
     * Constructor vacio de la clase Libro
     */
    public Libro() {
    }

    /**
     * Constructor de la clase Libro
     *
     * @param idLibro identificador unico del libro
     * @param titulo titulo del libro
     * @param autor autor del libro
     * @param numPagina paginas del libro
     * @param estado estado del libro "Disponible o Prestado"
     */
    public Libro(int idLibro, String titulo, String autor, int numPagina, String estado) {
        this.idLibro = idLibro;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
        this.estado = estado;
    }

    /**
     * Obtiene el id del libro
     *
     * @return id del libro
     */
    public int getIdLibro() {
        return idLibro;
    }

    /**
     * Establece el id del libro
     *
     * @param idLibro id del libro
     */
    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    /**
     * Obtiene el titulo del libro
     *
     * @return titulo del libro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el titulo del libro
     *
     * @param titulo titulo del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtiene el autor del libro
     *
     * @return autor del libro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Establece el autor del libro
     *
     * @param autor autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Obtiene el numero de paginas
     *
     * @return numero de paginas
     */
    public int getNumPagina() {
        return numPagina;
    }

    /**
     * Establece el numero de paginas
     *
     * @param numPagina numero de paginas del libro
     */
    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }

    /**
     * Obtiene el estado del libro
     *
     * @return estado del libro
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Establece el estado del libro
     *
     * @param estado estado del libro (Disponible o Prestado)
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
