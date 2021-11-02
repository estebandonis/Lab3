/**
 * Nos ayuda a crear posts de tipo texto
 */

public class Texto extends Post{
    private String texto;

    /**
     * Constructor de la clase Texto
     * @param ID
     * @param autor
     * @param hashtags
     * @param texto
     */
    Texto (int ID, String autor, String hashtags, String texto){
        super(ID, autor, hashtags);
        this.texto = texto;
        setTipo("texto");
    }

    /**
     * Override de la clase toString
     */
    @Override
    public String toString() {
        return String.format(texto);
    }

    /**
     * Nos devuelve el texto guardado
     * @return
     */
    public String getTexto() {
        return texto;
    }
}
