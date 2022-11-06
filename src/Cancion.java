/**
 * @author Ruth de León
 */
public class Cancion implements ICancion{

    private int ID;
    private String title;
    private String artist;
    private String album;
    private String duration;


    /**
     *Setter para titulo de la cancion
     * @param _title titulo de la cancion
     */
    @Override
    public void setTitle(String _title) {
        this.title = _title;
    }

    /**
     *Getter para el titulo de la cancion
     * @return regresa un título de la canción
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     *Setter para el artista de la cancion
     * @param _artist artista de la cancion
     */
    @Override
    public void setArtist(String _artist) {
        this.artist = _artist;
    }

    /**
     *Getter para el artista de la cancion
     * @return devuelve el artista de la cancion
     */
    @Override
    public String getArtist() {
        return artist;
    }

    /**
     *Setter para el album de la cancion
     * @param _album album de la cancion
     */
    @Override
    public void setAlbum(String _album) {
        this.album = _album;
    }

    /**
     *Getter para el album de la cancion
     * @return devuelve un album de la cancion
     */
    @Override
    public String getAlbum() {
        return album;
    }

    /**
     *Setter para la duracion de la cancion
     * @param _duration duracion de la cancion
     */
    @Override
    public void setDuration(String _duration) {
        this.duration = _duration;
    }

    /**
     *Getter para la duracion de la cancion
     * @return devuelve una duracion de cancion
     */
    @Override
    public String getDuration() {
        return duration;
    }

    /**
     *Setter para la identiicacion de la cancion
     * @param _id identificacion de la cancion
     */
    @Override
    public void setID(int _id) {
        this.ID = _id;
    }

    /**
     *Getter para la identiicacion de la cancion
     * @return devuelve la identificacion de la cancion
     */
    @Override
    public int getID() {
        return ID;
    }
}
