import java.util.Scanner;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);        System.out.println("Matrices de una dimensión");
        // 2 bytes
        // [0,0,0,0,0] i[0,1,2,3,4]
        int enteros[] = new int[5];
        
        String[] stringsArray = new String[5]; 
        
        // System.out.println(enteros.length);
        // System.out.println(stringsArray.length);
        
        // recorrer arreglo con indices
        
        int pares[] = {2,4,6,8,10,12,14,16};
        imprimeArray(pares);
        imprimeArray(enteros);
        // System.out.println("Termine");
        
        // System.out.println("Matrices de dos dimensión");

        // matriz[fila][columna]
        int matriz[][] = new int[3][3];

        int matrizA[][] = {
            // 0,1,2
            {00,01,02},// 0
            {10,11,12},// 1
            {20,21,22} // 2
        };
        
        // System.out.println("matrizA[fila][columna] = " + matrizA[2][2]);

        char matrizChar[][] = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
        };

        // int cont = 0;
        // imprimeGato(matrizChar);
        // while(cont<4){
        //     System.out.println("Ingresa la posicion de la matriz: ");
        //     System.out.print("Ingresa la fila: ");
        //     int fila = Integer.parseInt(sc.nextLine());
        //     System.out.print("Ingresa la columna: ");
        //     int column = Integer.parseInt(sc.nextLine());
        //     matrizChar[fila][column] = 'X';
        //     imprimeGato(matrizChar);
    
        //     System.out.println("Ingresa la posicion de la matriz: ");
        //     System.out.print("Ingresa la fila: ");
        //     fila = Integer.parseInt(sc.nextLine());
        //     System.out.print("Ingresa la columna: ");
        //     column = Integer.parseInt(sc.nextLine());
        //     matrizChar[fila][column] = 'O';
        //     imprimeGato(matrizChar);
        //     cont++;
        // }


        // Persona caja[] = new Persona[10];
        Persona caja[] = {
            new Persona("Alfonso", "Purpura"),
            new Persona("Evelyn", "Amarillo"),
            new Persona("Erick", "Negro"),
            new Persona("José", "Rojo"),
        };

        for(int i = 0;i<caja.length;i++){
            System.out.println(caja[i]);
            // caja[i].toString();
            // System.out.println(caja[i].nombre + " color = "+ caja[i].color);
        }

    }

    public static void imprimeArray(int[] arreglo){
        for(int i = 0;i<arreglo.length;i++){
            System.out.println("arreglo["+i+"] =  " + arreglo[i]);
        }
    }

    public static void imprimeGato(char[][] tablero){
        for(int fila = 0;fila<tablero.length;fila++){
            for(int columna = 0;columna<tablero.length;columna++){
                if(columna!=2){
                    System.out.print(tablero[fila][columna] + "|");
                }else{
                    System.out.println(tablero[fila][columna]);
                }
                // fila = 0 , columna = 0
                // fila = 0 , columna = 1
                // fila = 0 , columna = 2
                
                // fila = 1 , columna = 0
                // fila = 1 , columna = 1
                // fila = 1 , columna = 2

                // fila = 2 , columna = 0
                // fila = 2 , columna = 1
                // fila = 2 , columna = 2



            }
            if(fila!=2){
                System.out.println("-----");
            }else{
                System.out.println();
            }
        }
    }
}
