/**
 * @author Ruth de León
 */

import java.util.Scanner;

public class UI {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo generador del menu principal del programa
     * @return devuelve un scanner tipo Int
     */
    public static int initial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al ultra IPod");
        System.out.println("");
        System.out.println("Ingrese la opcción a realizar");
        System.out.println("");
        System.out.println("1. Estado de la canción");
        System.out.println("2. Encender/Apagar");
        System.out.println("3. Agregar canción favorita");
        System.out.println("4. Next Song");
        System.out.println("5. Preview Song");
        System.out.println("6. Subir volumen");
        System.out.println("7. Bajar volumen");
        System.out.println("8. Ver una canción favorita");
        System.out.println("9. Bloquar/Desbloquear");
        return scanner.nextInt();
    }

    /**
     * Metodo que genera error en el menuPrincipal
     */
    public static void mistake(){
        System.out.println("No se encuentra esa opción");
    }

    /**
     * Metodo que genera error en el menuPrincipal
     */
    public static void mistakeTwo(){
        System.out.println("El dispositivo no se encuentra encendido");
    }

    /**
     * Metodo que genera error en el menuPrincipal
     */
    public static void mistakeThree(){
        System.out.println("El dispositivo esta en modo bloqueado o esta apagado");
    }

    /**
     * Metodo que solicita las canciones favoritas del indice
     * @return devuelve un scanner tipo Int
     */
    public static int solicitudSongsFavs(){
        System.out.println("Ingresar el index de la canción fav");
        return scanner.nextInt();
    }

}
