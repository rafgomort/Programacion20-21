package Tarea5;

import java.util.Scanner;

public class Act2 {
    public static void main (String[]args){
        //Crea un programa que pida al usuario que introduzca
        // el número 12. Después debe decirle si lo ha hecho correctamente o no.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero 12");
        int num = teclado.nextInt();

        if (num==12){
            System.out.println("Es correcto");
        }else{
            System.out.println("No es correcto");
        }
    }
}
