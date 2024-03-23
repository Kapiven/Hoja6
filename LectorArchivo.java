import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LectorArchivo {
        private Map<String, Estudiantes> estudiantesPorCarnet;
    
        public LectorArchivo(String rutaArchivo) {
            estudiantesPorCarnet = new HashMap<>();
            cargarDatosDesdeArchivo(rutaArchivo);
        }
    
        private void cargarDatosDesdeArchivo(String rutaArchivo) {
            try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
                String linea;
                while ((linea = br.readLine()) != null) {
                    String[] campos = linea.split(",");
                    if (campos.length >= 4) {
                        String carnet = campos[0];
                        String nombre = campos[1];
                        String nacionalidad = campos[2];
                        int edad = Integer.parseInt(campos[3]);
    
                        Estudiantes estudiante = new Estudiantes(carnet, nombre, nacionalidad, nacionalidad, edad);
                        estudiantesPorCarnet.put(carnet, estudiante);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    
        public Estudiantes buscarPorCarnet(String carnet) {
            return estudiantesPorCarnet.get(carnet);
        }
}


    
