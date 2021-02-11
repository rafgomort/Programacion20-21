package entregable;

import java.util.Arrays;
import java.util.Random;

public class Act4 {
    public static void main(String[] args) {
        //Juego del buscaminas
        //
        //Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.
        //
        //A continuación rellenar todo el vector colocando en cada casilla de manera aleatoria:
        //
        //O bien un carácter X que significa que hay una bomba.
        //O bien un carácter - que significa que esa casilla no nada.
        //A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
        //
        //En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar por pantalla la cantidad de bombas que hay en las casillas de alrededor.
        //
        //Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez (hasta que el usuario encuentre una bomba).
        //
        //NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.

        //Introduzca una posición: 1,1
        //
        //La posición 1,1 tiene 3 bombas en los alrededores
        //
        //Introduzca una posición: 1,0
        //
        //La posición 1,0 tiene 1 bomba en los alrededores
        //
        //Introduzca una posición: 3,1
        //
        //La posición 3,0 tiene una bomba, está muerto


        String matricula = "";
        Random rnd = new Random();

        int NUM_MAX=4;

        int n[][] = new int[NUM_MAX][NUM_MAX];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n.length; j++) {
                int a=0;
                do {
                    n[i][j] = (int) (Math.random() * 75 + 45);///
                } while ( n[i][j] == 45 || n[i][j] == 120 );

                char letra = (char) a;
            }
            System.out.println(Arrays.deepToString(n));
        }
    }
}
