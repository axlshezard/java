import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int filaTiro,columnaTiro;
        boolean ganador = false;
        char posibleGanador = ' ';

        // ?representar el table con char
        char tablero[][] = {
            //col 0 ,1 ,2   
            {'-','-','-'}, // 0 fila
            {'-','-','-'}, // 1
            {'-','-','-'}  // 2
        };
        /*  TODO: recorrer matrices irregulares       
        char tablero2[][] = {{'-','-','-','-'},{'-','-'},{'-','-','-'}};
        
        for(int fila = 0;fila<tablero2.length;fila++){
            for(int columna = 0;columna<tablero2[fila].length;columna++){
                System.out.println("tablero2["+fila+"]["+columna+"] =  " + tablero2[fila][columna]);
            }
        } */

        int cont = 0;
        // con la condición cont<9 controlo la cantidad de tiros
        while(cont<9){
            // ?tiro del jugador 'X' 'O'
            // el tiro = filaTiro,columnaTiro
            System.out.print("Ingresa la fila: ");
            filaTiro = Integer.parseInt(sc.nextLine());
            System.out.print("Ingresa la columna: ");
            columnaTiro = Integer.parseInt(sc.nextLine());

            // no tirar en una casilla ocupada
            if(tablero[filaTiro][columnaTiro]=='-'){
                // controlar jugadro con ternario
                tablero[filaTiro][columnaTiro] = cont%2==0?'X':'O';
                posibleGanador = tablero[filaTiro][columnaTiro];
                cont++;
            }else{
                System.out.println("Error: Casilla ocupada \n\n");
                // reinicia
                continue;
            }
            
            // !Verificar la regla del juego
            // *Ganar columna
            for(int columna = 0;columna<tablero.length;columna++){
                // !si son guines no gana
                if(tablero[0][columna]=='-') break;

                if(tablero[0][columna] == tablero[1][columna] 
                && tablero[1][columna] == tablero[2][columna]){
                    ganador = true;
                }
            }
            // *Ganar fila
            for(int fila = 0;fila<tablero.length;fila++){

                if(tablero[fila][0]=='-') break;

                if(tablero[fila][0] == tablero[fila][1] 
                && tablero[fila][1] == tablero[fila][2]){
                    ganador = true;
                }
            }
            // *Ganar diagonal '\'
            if(tablero[1][1]!='-'){
                if(tablero[0][0] == tablero[1][1] 
                && tablero[1][1] == tablero[2][2]){
                    ganador = true;
                }
                
                // *Ganar diagonal '/' 
                if(tablero[0][2] == tablero[1][1] 
                && tablero[1][1] == tablero[2][0]){
                    ganador = true;
                }
            }

            if(ganador){
                // rope el ciclo
                break;
            }

            for(int fila = 0;fila<tablero.length;fila++){
                for(int columna = 0;columna<tablero.length;columna++){
                    System.out.print(tablero[fila][columna]);
                }
                System.out.println();
            }
        }

        System.out.println(
            ganador 
            ? ("El ganador es = " + posibleGanador)
            : "Empate"
        );
        sc.close();
    }
}
