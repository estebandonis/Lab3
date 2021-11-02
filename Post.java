/**
 * Nos ayuda a crear post, es de donde se derivan todas las clases
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public abstract class Post {
    private String autor;
    private LocalDate fecha;
    private LocalTime hora;
    private int likes;
    private String hashtags;
    private ArrayList<String> comentarios = new ArrayList<String>();
    private String tipo;
    private int ID;

    /**
     * Es el constructor de la clase
     * @param ID
     * @param autor
     * @param hashtags
     */
    Post (int ID, String autor, String hashtags){
        this.autor = autor;
        fecha = java.time.LocalDate.now();
        hora = java.time.LocalTime.now();
        likes = 0;
        this.hashtags = hashtags;
        this.ID = ID;
    }

    /**
     * Nos sirve para agregarle un like al post
     */
    public void agregarLike(){
        likes += 1;
    }

    /**
     * Nos sirve para agregarle un comentario al post
     * @param comentario
     */
    public void agregarComentario(String comentario){
        comentarios.add(comentario);
    }

    /**
     * Abstracto de toString
     */
    @Override
    public abstract String toString();

    /**
     * nos devuelve el valor de autor
     * @return
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Nos devuelve la fecha 
     * @return
     */
    public LocalDate getFecha() {
        return fecha;
    }

    /**
     * Nos devuelve el valor de hora
     * @return
     */
    public LocalTime getHora() {
        return hora;
    }

    /**
     * Nos devuelve el valor de likes
     * @return
     */
    public int getLikes() {
        return likes;
    }

    /**
     * Nos devuelve el valor de hashtags
     * @return
     */
    public String getHashtags() {
        return hashtags;
    }

    /**
     * Nos devuelve los comentarios hechos en la publicacion
     * @return
     */
    public ArrayList<String> getComentarios() {
        return comentarios;
    }

    /**
     * Definimos el tipo de post que es
     * @param tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Nos devuelve que tipo de post es
     * @return
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Nos devuelve el id de la publicacion
     * @return
     */
    public int getID() {
        return ID;
    }
}
