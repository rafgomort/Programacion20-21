package Tarea5;

import org.codehaus.groovy.transform.SourceURIASTTransformation;

import java.util.Scanner;

public class Act5 {
    public static void main (String[]args){
        //Crea un programa que pida tres números enteros
        // largos al usuario y diga cuál es el mayor de los tres.

        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un numero");
        int num = teclado.nextInt();
        System.out.println("Introduce otro numero");
        int num1 = teclado.nextInt();
        System.out.println("Introduce otro numero");
        int num2 = teclado.nextInt();


        if (num>num1 ||num>num2) {
            System.out.println(num + " Es el numero mayor");
        }else{
            if (num1>num || num1>num2){
                System.out.println(num1 + "Es el numero mayor");
            }else{
                System.out.println(num2 + "Es el mayor");
            }
        }

    }
}
