public class Aritmeticos {

    /* 
     * Variables de instancia
     * 
     */

    int a = 5,b = 8;
    // String van entre comillas dobles
    String nombre = "Alfonso", saludo = "Hola ";
    // char van entre comillas simples
    char grupo = 'A';


    public void operadorSuma(){
        // sin parentecis todos son Strings
        System.out.println("a + b = " + a + b);
        // con parentecis es tipo original
        System.out.println("a + b = " + (a+b));
        /* sobrecarga del operador +, suma enteros y concatena
         * Strings y chars
         */
        System.out.println(saludo + nombre);
        System.out.println(nombre + "es del grupo " + grupo);
    }

    public void operadorResta(){
        System.out.println("a - b = " + (a - b) );
        // !No se pueden restar String, solo tipos numericos.
        // System.out.println(nombre - saludo);
        // *El operador resta no tiene sobre carga de operadores
        
        // Cambiar el signo
        System.out.println("-a = " + -a);
    }

    public void operadorMultiplicacion(){
        // !el operadro * no multiplica Strings
        // System.out.println(nombre*a);
        // puede multiplicar chars
        System.out.println(grupo*a);
    }

    public void operadorDivision(){
        // Regresa la parte entera de la división
        System.out.println((a/b));
        System.out.println((18/3));

        double div = (5/8);
        System.out.println("div =  " + div);

        div = (5.0/8.0);
        System.out.println("div =  " + div);
    }

    public void operadorModulo(){
        // el modulo siempre retorno un entero
        System.out.println(a%b);
        System.out.println(b%a);
    }
}
