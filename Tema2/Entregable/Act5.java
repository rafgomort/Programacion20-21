package Entregable1;

import java.util.Scanner;

public class Act5 {
    public static void main (String[]args){
        //Dada una cadena mostrar por pantalla la cantidad de espacios, haches y vocales
        //abiertas tiene, independientemente de que sean mayúsculas, minúsculas o acentuadas.
        //Las vocales abiertas son a, e, o.
        //
        //Ejemplo:
        //Entrada: cad = "Hipolito el Anodo"
        //Salida: La cantidad de espacios, haches y vocales abiertas es 9

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String cadena = teclado.next();
        teclado.nextLine();
        int contador=0;

        for(int x=0;x<cadena.length();x++) {
            if ((cadena.charAt(x)=='a') || (cadena.charAt(x)=='e') || (cadena.charAt(x)=='o') || (cadena.charAt(x)=='h')
                    || (cadena.charAt(x)=='A') || (cadena.charAt(x)=='E') || (cadena.charAt(x)=='O') || (cadena.charAt(x)=='H')
                    || (cadena.charAt(x)=='á') || (cadena.charAt(x)=='é') || (cadena.charAt(x)=='ó') || (cadena.charAt(x)=='Á')
                    || (cadena.charAt(x)=='É') || (cadena.charAt(x)=='Ó') || (cadena.charAt(x)==' ')){
                contador++;
            }
        }


        System.out.println("Entrada: " + cadena);
        System.out.println("Salida: La cantidad de espacios, haches y vocales abiertas es: " + contador);

    }
}
