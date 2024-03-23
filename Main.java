import java.io.*;
import java.util.*;

public class Main {
    public static <K, V> void main(String args[]) {
        // public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        boolean go = true;
        int opcionMap = 0;
        int opcion = 0;

        System.out.println("\n");
        System.out.println("MENÚ (Implementación MAP)");
        System.out.println("1.  HashMap");
        System.out.println("2.  TreeMap");
        System.out.println("3.  LinkedHashMap");
        System.out.println("4.  Salir");
        System.out.println("Ingrese la opción seleccionada: ");
        opcionMap = sc.nextInt();
        FactoryMap<String, Estudiantes> factoryEstudiantes = new FactoryMap<String, Estudiantes>();
        AbstractMap<String, Estudiantes> estudiantes = factoryEstudiantes.getMap(opcionMap);

        while (go) {
            System.out.println("\n");
            System.out.println("MENÚ DEL PROGRAMA");
            System.out.println("1.  Buscar estudiante por postalZip");
            System.out.println("2.  Buscar estudiante por nacionalidad");
            System.out.println("3.  Salir");
            System.out.println("Ingrese la opción seleccionada: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // buscar por llave (postalZip)
                    System.out.println("\n");
                    System.out.println("Ingrese el postalZip del estudiante que desee buscar: ");
                    int postalZip = sc.nextInt();
                    Estudiantes estudiante = estudiantes.get(postalZip);
                    if (estudiante != null) {
                        System.out.println("Estudiante identificado con el postalZip " + postalZip + " es: "
                                + estudiante.getNombre());
                    } else {
                        System.out.println("No se identificó un estudiante con el postalzip: " + postalZip);
                    }

                    break;

                case 2:
                    // buscar por nacionalidad
                    System.out.println("\n");
                    System.out.println("Ingrese la nacionalidad del estudiante: ");
                    String nacionalidad = sc.next();
                    int orden = 0;
                    for (Estudiantes est : estudiantes.values()) {
                        if (est.getNacionalidad().equalsIgnoreCase(nacionalidad)) {
                            orden = orden + 1;
                            System.out.println(orden + est.getNombre());
                        }
                    }

                    // Notas de clase:
                    // colisiones por listas para los repetidos
                    // dos mapas (string estudiante)
                    // (arraylist, estudiante)
                    // *lógica para repetidos* Manejo de colisiones

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
        sc.close();
    }
}