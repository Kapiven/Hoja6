import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
                    if (campos.length >= 5) {
                        String nombre = campos[0].trim();
                        String numero = campos[1].trim();
                        String correo = campos[2].trim();
                        String nacionalidad = campos[4].trim();
                        int postalZip = Integer.parseInt(campos[3]);
    
                        Estudiantes estudiante = new Estudiantes(nombre, numero, correo, nacionalidad, postalZip);
                        estudiantesPorCarnet.put(numero, estudiante);
                    }
                }
            } catch (IOException e) {
                System.err.println("Error al leer el archivo: " + e.getMessage());
            }
        }
    
        public Estudiantes buscarPorCarnet(String carnet) {
            return estudiantesPorCarnet.get(carnet);
        }

        public Map<String, List<Estudiantes>> estudiantesPorNacionalidad() {
            Map<String, List<Estudiantes>> estudiantesPorNacionalidad = new HashMap<>();
            for (Estudiantes estudiante : estudiantesPorCarnet.values()) {
                String nacionalidad = estudiante.getNacionalidad();
                if (!estudiantesPorNacionalidad.containsKey(nacionalidad)) {
                    estudiantesPorNacionalidad.put(nacionalidad, new ArrayList<>());
                }
                estudiantesPorNacionalidad.get(nacionalidad).add(estudiante);
            }
            return estudiantesPorNacionalidad;
}


    
