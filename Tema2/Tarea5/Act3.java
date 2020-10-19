package Tarea5;

import java.util.Scanner;

public class Act3 {
    public static void main (String[]args){
        //Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();

        if(num%2==0){
            System.out.println("es par");
        }else{
            System.out.println("es impar");
        }
    }
}
