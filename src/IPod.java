public class IPod implements IIpod_simulator{
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        return false;
    }

    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        return false;
    }

    @Override
    public float getVolume() {
        return 0;
    }

    @Override
    public float setVolume(float volume) {
        return 0;
    }

    @Override
    public int Prev(int actual_index) {
        return 0;
    }

    @Override
    public int Next(int actual_index) {
        return 0;
    }

    @Override
    public int getActualIndex() {
        return 0;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {

    }

    /**
     * Este metodo guarda una cancion en listado de favoritos
     *
     * @param _song la cancion que se desea guardar
     * @throws Exception cuando la lista ya esta llena
     */
    @Override
    public void addToFavorite(ICancion _song) throws Exception {

    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        return null;
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        return null;
    }

    /**
     * Este metodo devuelve el listado completo de canciones
     *
     * @return el listado de canciones
     */
    @Override
    public ICancion[] getAllSongs() {
        return new ICancion[0];
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        return null;
    }

    @Override
    public boolean isValidIndex(int index) {
        return false;
    }

    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id) throws Exception {

    }

    /**
     * Este metodo elimina una cancion de una posicion determinada
     *
     * @param index
     * @throws Exception Cuando el indice esta fuera de rango
     */
    @Override
    public void deleteSongFromList(int index) throws Exception {

    }

    /**
     * Elimina una cancion de la lista de favoritas pero no del listado general
     *
     * @param index
     * @throws Exception Cuando el indice esta fuera de rango
     */
    @Override
    public void deleteSongFromTop10(int index) throws Exception {

    }
}
