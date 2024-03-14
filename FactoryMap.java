import java.util.*;

public class FactoryMap<K, V> {
    public static Map<K, V> getMap(int opcion) {
        switch (opcion) {
            case 1:
                return new HashMap<K, V>();
            case 2:
                return new TreeMap<K, V>();
            case 3:
                return new LinkedHashMap<K, V>();
            default:
                return null;
        }
    }
}