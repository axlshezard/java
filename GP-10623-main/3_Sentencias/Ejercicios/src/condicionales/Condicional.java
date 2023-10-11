package condicionales;

import java.util.Scanner;

public class Condicional {
    
    /** 
     * Ejercicio 1 
     * Escribir un programa que pregunte al usuario su edad y muestre por 
     * pantalla si es mayor de edad o no.
     */
    public static void ejercicio1(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();
        if(edad>=18){
        System.out.println("Eres mayor de edad");
        }else{
            System.out.println("No eres mayor de edad");
        }
        sc.close();
    }

    /**
     * Ejercicio 2 
     * Escribir un programa que almacene una 
     * contraseña en una variable, pregunte
     * al usuario por la contraseña imprima por pantalla si la 
     * contraseña introducida por el usuario coincide con la guardada en la 
     * variable sin tener en cuenta mayúsculas y minúsculas.
     * @date 03/10/23
     * @author yo mero
     * @class estatica porque no quiero crear el objeto
     */
    public static void ejercicio2(){
         Scanner sc = new Scanner(System.in);
         String user_db = "Admin";
         String pass_db = "batman";
 
         System.out.print("Ingresa el usuario: ");
         String user = sc.nextLine(); 
 
         System.out.print("Ingresa la contraseña: ");
         String pass = sc.nextLine();
 
         boolean user_valido = user_db.toUpperCase().equals(user.toUpperCase());
         boolean pass_valido = pass_db.equalsIgnoreCase(pass);
 
         if(user_valido && pass_valido ){
             System.out.println("Acceso...");
         }else{
             System.out.println("Denegado...");
         }
         sc.close();
    }
}
