/**
 * Nos ayuda a crear posts de tipo video
 */

public class Video extends Multimedia{
    private int frameRate;

    /**
     * Constructor de la clase video
     * @param ID
     * @param autor
     * @param hashtags
     * @param url
     * @param kilobytes
     * @param frameRate
     */
    Video (int ID, String autor, String hashtags, String url, int kilobytes, int frameRate){
        super(ID, autor, hashtags, url, kilobytes);
        this.frameRate = frameRate;
        setTipo("video");
    }

    /**
     * override de toString
     */
    @Override
    public String toString() {
        return String.format("Voy a mostrar este video con "+ frameRate + " fps");
    }

    /**
     * Nos devuelve el framerate del video
     * @return
     */
    public int getFrameRate() {
        return frameRate;
    }
}
