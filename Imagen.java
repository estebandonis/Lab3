/**
 * Nos ayuda a crear publicaciones con imagenes
 */

public class Imagen extends Multimedia{
    private String formato;
    private int resolucion;

    /**
     * Constructor de la clase imagen
     * @param ID
     * @param autor
     * @param hashtags
     * @param url
     * @param kilobytes
     * @param formato
     * @param resolucion
     */
    Imagen(int ID, String autor, String hashtags, String url, int kilobytes, String formato, int resolucion){
        super (ID, autor, hashtags, url, kilobytes);
        this.formato = formato;
        this.resolucion = resolucion;
        setTipo("imagen");
    }

    /**
     * override de la clase toString
     */
    @Override
    public String toString() {
        return String.format("Estoy mostrando esta imagen con " + resolucion +" megapixeles de resolucion");
    }

    /**
     * Nos devuelve el formato del video de la publicacion
     * @return
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Nos devuelve la resolucion del video
     * @return
     */
    public int getResolucion() {
        return resolucion;
    }
}
