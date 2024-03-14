public class Estudiantes {
    
    private String carnet;
    private String nombre;
    private String nacionalidad;
    private int edad;

    
    public Estudiantes(String carnet, String nombre, String nacionalidad, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }


    public String getCarnet() {
        return carnet;
    }


    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }
}