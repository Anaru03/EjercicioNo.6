import java.util.ArrayList;

public class Controller {
    ArrayList<Cancion> arrayList = new ArrayList<>();
    static IPod iPod = new IPod();

    public static void menuPrincipal(){
        int op = UI.initial();
        switch (op){
            case 1:
                break;
            case 2: iPod.SwitchONOFF(iPod.estado);
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                if(iPod.estado) {
                iPod.LockUnlockDevice(iPod.bloqueado);
                }else{
                    UI.mistaketwo();
                }
                break;
            case 7:
                break;
            case 8:
                break;
            case 9: iPod.LockUnlockDevice(iPod.bloqueado);
                break;
            default:
                UI.mistake();
                break;
        }
        UI.initial();
    }
}
