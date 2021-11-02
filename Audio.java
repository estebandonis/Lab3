/**
 * Nos ayuda a crear posts de tipo audio
 */

public class Audio extends Multimedia{
    private int sampleRate;
    private int bitDepth;

    /**
     * Constructor de la clase audio
     * @param ID
     * @param autor
     * @param hashtags
     * @param url
     * @param kilobytes
     * @param sampleRate
     * @param bitDepth
     */
    Audio (int ID, String autor, String hashtags, String url, int kilobytes, int sampleRate, int bitDepth){
        super(ID, autor, hashtags, url, kilobytes);
        this.sampleRate = sampleRate;
        this.bitDepth = bitDepth;
        setTipo("audio");
    }

    /**
     * override de la clase toString
     */
    @Override
    public String toString() {
        return String.format("Voy a sonar este audio con "+ sampleRate +" kHz de sample rate y "+bitDepth+" de bitdepth");
    }

    /**
     * Obtenemos el sample rate del audio de la publicacion
     * @return
     */
    public int getSampleRate() {
        return sampleRate;
    }

    /**
     * Nos devuelve el bitdepth del audio de la publicacion
     * @return
     */
    public int getBitDepth() {
        return bitDepth;
    }
}
