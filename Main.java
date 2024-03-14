import java.io.*;
import java.util.*;

public class Main {
    public static <K, V> void main(String args[]) {
        // public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean go = true;
        int opcionMap = 0;
        int opcion = 0;

        while (go) {
            MenuMaps();
            opcionMap = sc.nextInt();
            Map<K, V> estudiantes = FactoryMap.getMap(opcion);

            // Cargar datos del JSON

            MenuOpcion();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // buscar por
                    break;

                case 2:

                    break;

                case 3:
                    go = false;
                    System.out.println("\u001B[31mSaliendo del programa...\u001B[37m");
                    break;

                default:
                    System.out.println("\u001B[31mOpción incorrecta\u001B[37m");
                    break;
            }
        }

    }
}

public static void MenuMaps() {

    System.out.println("\n");
    System.out.println("MENÚ (Implementación MAP)");
    System.out.println("1.  HashMap");
    System.out.println("2.  TreeMap");
    System.out.println("3.  LinkedHashMap");
    System.out.println("4.  Salir");
    System.out.println("Ingrese la opción seleccionada: ");
    System.out.println("\n");
}

public static void MenuOpcion() {

    System.out.println("\n");
    System.out.println("MENÚ DEL PROGRAMA");
    System.out.println("1.  Buscar estudiante por postalZip");
    System.out.println("2.  Buscar estudiante por nacionalidad");
    System.out.println("3.  Salir");
    System.out.println("Ingrese la opción seleccionada: ");
    System.out.println("\n");
}