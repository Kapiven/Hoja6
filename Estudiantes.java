public class Estudiantes {

    private String nombre;
    private String numero;
    private String correo;
    private String nacionalidad;
    private int postalZip;

    
    public Estudiantes(String nombre, String numero, String correo, String nacionalidad, int postalZip) {
        this.nombre = nombre;
        this.numero = numero;
        this.correo = correo;
        this.nacionalidad = nacionalidad;
        this.postalZip = postalZip;
    }

    // Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Numero
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    // Correo
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    // Nacionalidad
    public String getNacionalidad() {
        return nacionalidad;
    }


    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    // postalZip
    public int getpostalZip() {
        return postalZip;
    }

    public void setpostalZip(int postalZip) {
        this.postalZip = postalZip;
    }

}