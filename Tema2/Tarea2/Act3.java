package Tarea1;

import java.util.Scanner;

public class Act3 {
    public static void main (String[]args){
        //Crea un programa que calcule y muestre la división de dos números enteros introducidos por el usuario.

        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        System.out.println("Introduce otro numero");
        int num1= teclado.nextInt();

        System.out.println("El resultado es: " + num/num1);

    }
}


