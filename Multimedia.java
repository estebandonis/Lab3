/**
 * clase post de la cual se derivan las clases post imagen, audio y video
 */

public abstract class Multimedia extends Post{
    private String url;
    private int kilobytes;

    /**
     * Constructor de la clase multimedia
     * @param ID
     * @param autor
     * @param hashtags
     * @param url
     * @param kilobytes
     */
    Multimedia(int ID, String autor, String hashtags, String url, int kilobytes){
        super(ID, autor, hashtags);
        this.url = url;
        this.kilobytes = kilobytes;
        setTipo("multimedia");
    }

    /**
     * Metodo abstracto toString
     */
    @Override
    public abstract String toString();

    /**
     * Nos devuelve el url de la publicacion
     * @return
     */
    public String getUrl() {
        return url;
    }

    /**
     * Nos devuelve el peso del multimedia
     * @return
     */
    public int getKilobytes() {
        return kilobytes;
    }
}
