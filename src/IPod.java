import java.util.ArrayList;

public class IPod implements IIpod_simulator{

    private float volume;
    private int index;
    public ArrayList<Cancion> canciones = new ArrayList<>();
    public ArrayList<Cancion> favorites = new ArrayList<>();

    public boolean estado = false;
    public boolean bloqueado = true;



    /**
     * Este metodo enciende / Apaga el dispositivo, recibe una variable booleana
     * que tiene el estado actual del dispositivo
     * @param actual_state el estado actual del dispositivo
     * @return el estado futuro del dispositivo
     */
    @Override
    public boolean SwitchONOFF(boolean actual_state) {
        if(actual_state) {
            this.estado = false;
        }else{
            this.estado = true;
        }
        return true;
    }

    @Override
    public boolean LockUnlockDevice(boolean actual_locked_state) {
        if(actual_locked_state) {
            this.bloqueado = false;
        }else{
            this.bloqueado = true;
        }
        return true;
    }

    @Override
    public float getVolume() {
        return volume;
    }

    @Override
    public float setVolume(float volume) {
        return 0;
    }

    @Override
    public int Prev(int actual_index) {
        if(actual_index < 1){
            return -16;
        }
        else {
            return actual_index - 1;
        }
    }

    @Override
    public int Next(int actual_index) {
        if(actual_index == 49){
            return -17;
        }
        else {
            return actual_index + 1;
        }
    }

    @Override
    public int getActualIndex() {
        return index;
    }

    @Override
    public void setActualIndex(int actual_index) throws Exception {
        if(actual_index < 50){
            this.index = actual_index;
        }
        else {
            throw new Exception("¡Se alcanzazó el límite de las canciones");
        }
    }

    /**
     * Este metodo guarda una cancion en listado de favoritos
     *
     * @param _song la cancion que se desea guardar
     * @throws Exception cuando la lista ya esta llena
     */
    @Override
    public void addToFavorite(ICancion _song) throws Exception {
        if(favorites.size() < 10){
            favorites.add((Cancion) _song);
        }
        else {
            throw new Exception("¡Se lleno la lista de canciones favs!");
        }
    }

    @Override
    public ICancion selectSpecificSong(int index) throws Exception {
        if(index < canciones.size()){
            return canciones.get(index);
        }
        else {
            throw new Exception("¡El Index fuera de su rango!");
        }
    }

    @Override
    public ICancion selectSpecificFavoriteSong(int index) throws Exception {
        if(index < favorites.size()){
            return favorites.get(index);
        }
        else {
            throw new Exception("¡El Index fuera de su rango!");
        }
    }

    /**
     * Este metodo devuelve el listado completo de canciones
     *
     * @return el listado de canciones
     */
    @Override
    public ICancion[] getAllSongs() {
        ICancion[] ipodsong = new ICancion[50];
        for (int i=0; i<=canciones.size(); i++){
            ipodsong[i] = canciones.get(i);
        }
        return ipodsong;
    }

    @Override
    public String getStatus(boolean _isON, boolean _isLocked, boolean _isPlaying, ICancion _actualSong) {
        String state = "Volumen: " + this.volume + "Estado: ";
        if(_isON){
            state = state + "Encendido";
        }else {
            state = state + "Apagado";
            return state;
        }

        if(_isLocked){
            state = state + "Bloqueado";
        }else {
            state = state + "Desbloaqueado";
            return state;
        }

        if(_isPlaying){
            state = state + "Reproduciendo " + _actualSong.getTitle() + " " + "del artista " + _actualSong.getArtist() + " " + "del album " + _actualSong.getAlbum() + " " + "con duración de " + _actualSong.getDuration();
        }else {
            state = state + "No se reproduce nada";
        }
        return state;
    }


    /**
     *
     * @param index
     * @return
     */
    @Override
    public boolean isValidIndex(int index) {
        if(index <= canciones.size()){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Se agrega una cacncion para ser instanciada en el metodo y agregada a la lista
     * @param _titulo
     * @param _artista
     * @param _album
     * @param _duracion
     * @param _id
     * @throws Exception si el listado esta lleno
     */
    @Override
    public void addSongToList(String _titulo, String _artista, String _album, String _duracion, int _id) throws Exception {
        if(canciones.size()<50){
            Cancion song = new Cancion();
            song.setTitle(_titulo);
            song.setArtist(_artista);
            song.setAlbum(_album);
            song.setDuration(_duracion);
            song.setID(_id);
            canciones.add(song);
        }else {
            throw new Exception("¡Se alacanzó el límite máximo de canciones!");
        }
    }

    /**
     * Este metodo elimina una cancion de una posicion determinada
     *
     * @param index indice de las canciones determinada
     * @throws Exception Cuando el indice esta fuera de rango
     */
    @Override
    public void deleteSongFromList(int index) throws Exception {
        if(index <= canciones.size()){
            canciones.remove(index);
        }else{
            throw new Exception("¡El indice fuera de su rango!");
        }
    }

    /**
     * Elimina una cancion de la lista de favoritas pero no del listado general
     *
     * @param index
     * @throws Exception Cuando el indice esta fuera de rango
     */
    @Override
    public void deleteSongFromTop10(int index) throws Exception {
        if(index <= favorites.size()){
            favorites.remove(index);
        }else{
            throw new Exception("¡El indice fuera de su rango!");
        }
    }
}
