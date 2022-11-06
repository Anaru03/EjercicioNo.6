import java.util.Scanner;

public class UI {

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
        System.out.println("8. Ver una cacnción favorita");
        System.out.println("9. Bloquar/Desbloquear");
        return scanner.nextInt();
    }

    public static void mistake(){
        System.out.println("No se encuentra esa opción");
    }

}
