
//import java.io.*;
//import java.util.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1_HASH implements IHash {

    @Override
    public String calcularHash(String input) {
        try {
            // Obtener instancia de MessageDigest para SHA-1
            MessageDigest md = MessageDigest.getInstance("SHA-1");

            // Convertir la cadena de entrada a un arreglo de bytes y calcular el hash SHA-1
            byte[] sha1Bytes = md.digest(input.getBytes());

            // Convertir el hash SHA-1 de bytes a una representación hexadecimal
            StringBuilder sb = new StringBuilder();
            for (byte b : sha1Bytes) {
                sb.append(String.format("%02x", b));
            }

            return sb.toString(); // Devolver el hash SHA-1 como una cadena hexadecimal
        } catch (NoSuchAlgorithmException e) {
            // Manejar la excepción si el algoritmo SHA-1 no está disponible
            e.printStackTrace();
            return null; // En caso de error, devolver null
        }
    }
}