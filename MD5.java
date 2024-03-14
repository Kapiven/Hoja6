import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 implements IHash{

    @Override
    public String calcularHash(String input) {
        try {
            // Obtener una instancia de MessageDigest para MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Actualizar el digest con los bytes de la cadena de entrada
            md.update(input.getBytes());

            // Calcular el hash MD5
            byte[] digest = md.digest();

            // Convertir el resultado a una representación hexadecimal
            String hashMD5 = DatatypeConverter.printHexBinary(digest).toUpperCase();

            return hashMD5;
        } catch (NoSuchAlgorithmException e) {
            // Manejar la excepción si el algoritmo no está disponible
            e.printStackTrace();
            return null;
        }
    }
}