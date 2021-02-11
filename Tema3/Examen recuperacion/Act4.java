package ExamenRecu1;

import java.util.Arrays;
import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        //Realiza un programa que pida 10 números por teclado y
        // que los almacene en un array. A continuación, se mostrará
        // el contenido de ese array junto al índice (0 – 9) utilizando
        // para ello una tabla. Seguidamente el programa pasará
        // los primos a las primeras posiciones, desplazando el
        // resto de números (los que no son primos) de tal forma
        // que no se pierda ninguno. Al final se debe mostrar el array resultante.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Dame 10 números");
        int num1 = teclado.nextInt();
        boolean primo = true;

        int [] num2 = new int [10];

        for (int i = 0; i < num2.length-1; i++) {
            num1 = teclado.nextInt();
            System.out.print(num2);
            System.out.print(i);


            for(int j = 0; j < num2.length-1; i++) {
                if (num1 % i == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("Es primo");
            }else {
                System.out.println("No es primo");
            }
        }

    }
}
