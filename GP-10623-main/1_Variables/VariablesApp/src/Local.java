public class Local {
    public static void main(String[] args) {
        // variable local
        String saludo;
        saludo = "Alfonso";
        saludo(saludo);
    }

    // Método estatico
    public static void saludo(String nombre){ // nombre es variable local
        // variable local
        String saludo = "Hola ";
        // tamaño de las variables locales
        System.out.println("Tamaño de saludo = "+ saludo.length());
        System.out.println("Tamaño de nombre = "+ nombre.length());
        System.out.println(saludo + nombre);
    }
}
