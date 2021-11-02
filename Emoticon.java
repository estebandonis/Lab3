/**
 * Nos sirve para crear todas las publicaciones de emoticones
 */

public class Emoticon extends Post{
    private String emoticon;

    /**
     * Constructor de la emoticon
     * @param ID
     * @param autor
     * @param hashtags
     * @param emoticon
     */
    Emoticon(int ID, String autor, String hashtags, String emoticon){
        super(ID, autor, hashtags);
        this.emoticon = emoticon;
        setTipo("emoticon");
    }

    /**
     * override de la clase toString
     */
    @Override
    public String toString() {
        return String.format(emoticon);
    }

    /**
     * Nos devuelve el emoticon expresado
     * @return
     */
    public String getEmoticon() {
        return emoticon;
    }
}
