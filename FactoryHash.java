public class FactoryHash {
    
        public IHash crearFuncion(String input) {
            
            if (input.equalsIgnoreCase("organica")) {
                return new Organica();

            } else if (input.equalsIgnoreCase("md5")) {
                return new MD5();

            } else if (input.equalsIgnoreCase("sha1")) {
                return new SHA1();

            } else {
                throw new IllegalArgumentException("Tipo de función hash no válido");
            }
        }
}
