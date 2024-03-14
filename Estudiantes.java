import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Estudiantes {
    
    private List<String> datosEstudiantes;

    public Estudiantes(String rutaArchivo) {
        datosEstudiantes = new ArrayList<>();
        cargarDatosDesdeArchivo(rutaArchivo);
    }

    private void cargarDatosDesdeArchivo(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                datosEstudiantes.add(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    public List<String> getDatosEstudiantes() {
        return datosEstudiantes;
    }
}
