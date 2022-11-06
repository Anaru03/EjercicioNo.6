/**
 * @author Ruth de León
 */

import java.util.ArrayList;

public class Controller {
    ArrayList<Cancion> arrayList = new ArrayList<>();
    static IPod iPod = new IPod();

    public static void menuPrincipal() throws Exception {
        int op = UI.initial();
        switch (op){
            case 1:
                if(iPod.estado) {
                    System.out.println(iPod.getStatus(iPod.estado, iPod.bloqueado, true, iPod.selectSpecificSong(iPod.getActualIndex())));
                }else{
                    UI.mistakeTwo();
                }
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
                    iPod.selectSpecificFavoriteSong(ind);

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

    public static void AgregarCancion() throws Exception {
        iPod.addSongToList("Dice", "NMIXX", "ENTWURF", "2:10", 1);
        iPod.addSongToList("Tu falta de querer", "Mon Laferte", "Mon Laferte(Vol. 1)", "3:00", 2);
        iPod.addSongToList("MOONLIGHT", "TWICE", "Formula of Love: O+T=>3", "3:10", 3);
        iPod.addSongToList("ICON", "TWICE", "Formula of Love: O+T=>3", "2:10", 4);
        iPod.addSongToList("CRUEL", "TWICE", "Formula of Love: O+T=>3", "2:46", 5);
        iPod.addSongToList("REAL YOU", "TWICE", "Formula of Love: O+T=>3", "3:00", 6);
        iPod.addSongToList("Run BTS", "BTS", "Proof", "3:10", 7);
        iPod.addSongToList("Yet to Come", "BTS", "Proof", "2:16", 8);
        iPod.addSongToList("Butter", "BTS", "Proof", "3:20", 9);
        iPod.addSongToList("Life Goes On", "BTS", "Proof", "2:37", 10);


    }
}
