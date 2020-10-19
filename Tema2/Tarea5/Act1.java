package Tarea5;

import java.util.Scanner;

public class Act1 {
    public static void main  (String[]args){
        //Crea un programa que pida un número entero al usuario y
        // diga si es positivo (mayor que cero) o si, por el contrario,
        // no lo es (usando "else").

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame un numero");
        int num = teclado.nextInt();

        if (num>0){
            System.out.println("Si es positivo");
        }else{
            System.out.println("No es positivo");
        }
    }
}
