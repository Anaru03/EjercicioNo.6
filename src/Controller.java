import java.util.ArrayList;

public class Controller {
    ArrayList<Cancion> arrayList = new ArrayList<>();
    static IPod iPod = new IPod();

    public static void menuPrincipal() throws Exception {
        int op = UI.initial();
        switch (op){
            case 1:
                break;
            case 2: iPod.SwitchONOFF(iPod.estado);
                break;
            case 3:
                if(iPod.estado || !iPod.bloqueado) {
                    int indice = iPod.getActualIndex();
                    Cancion song2;
                    song2 = (Cancion) iPod.selectSpecificSong(indice);
                    iPod.addToFavorite(song2);
                }else{
                    UI.mistakeThree();
                }
                break;
            case 4:
                if(iPod.estado || !iPod.bloqueado) {
                    int indice = iPod.getActualIndex();
                    iPod.Next(indice);
                }else{
                    UI.mistakeThree();
                }
                break;
            case 5:
                if(iPod.estado || !iPod.bloqueado) {
                    int indice = iPod.getActualIndex();
                    iPod.Prev(indice);
                }else{
                    UI.mistakeThree();
                }
                break;
            case 6:
                if(iPod.estado || !iPod.bloqueado) {
                    float volumenNow = iPod.getVolume();
                    iPod.setVolume((float) (volumenNow + 0.5));
                }else{
                    UI.mistakeThree();
                }
                break;
            case 7:
                if(iPod.estado || !iPod.bloqueado) {
                    float volumenNow = iPod.getVolume();
                    iPod.setVolume((float) (volumenNow - 0.5));
                }else{
                    UI.mistakeThree();
                }
                break;
            case 8:
                if(iPod.estado || !iPod.bloqueado) {
                    int ind = UI.solicitudSongsFavs();

                }else{
                    UI.mistakeThree();
                }
                break;
            case 9: if(iPod.estado) {
                iPod.LockUnlockDevice(iPod.bloqueado);
            }else{
                UI.mistakeTwo();
            }
                break;
            default:
                UI.mistake();
                break;
        }
        menuPrincipal();
    }
}
