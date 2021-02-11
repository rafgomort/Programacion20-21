package ExamenRecu1;

import java.util.Scanner;

public class Act5 {
    public static void main(String[] args) {
        //Crea la función de manejo de arrays que tenga la siguiente
        // cabecera y que haga lo que se especifica en los comentarios:
        //
        //public int[] filtraCapicuas(int x[])
        //// Devuelve un array con todos los números capicúa que se encuentren
        //// en otro array que se pasa como parámetro. Obviamente el tamaño del
        //// array que se devuelve será menor o igual al que se pasa como
        //// parámetro.
        //
        //Utiliza esta función en un programa para comprobar que funcionan bien.
        // Para que el ejercicio resulte más fácil, las repeticiones de números
        // capicúa se conservan; es decir, si en el array x el número 505 se repite
        // 3 veces, en el array devuelto también estará repetido 3 veces. Si no
        // existe ningún número capicúa en x, se devuelve un array con el número
        // -1 como único elemento.

        Scanner teclado = new Scanner (System.in);
        int num=535;

        int [] num2 = {3};


    }
        public int[] filtraCapicuas(int x[]){
            boolean esCapitua=false;
            int num1=x[3];

            for (int i = 0; i < x.length; i++) {
                if(x[i]==num1){
                    esCapitua=true;
                }
            }
        return x;
        }
}
