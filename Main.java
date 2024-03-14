import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean go = true;
        int opcion = 0;

        while (go) {
            Menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    break;

                case 2:

                    break;

                default:
                    System.out.println("\u001B[31mOpción incorrecta\u001B[37m");
                    break;
            }
        }
    }
}

public static void Menu() {

    System.out.println("\n");
    System.out.println("MENÚ");
    System.out.println("Opcion1");
    System.out.println("Ingrese la opción seleccionada: ");
    System.out.println("\n");
}