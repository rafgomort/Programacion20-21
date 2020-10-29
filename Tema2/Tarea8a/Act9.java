package Tarea8;

import java.util.Scanner;

public class Act9 {
    public static void  main (String[]args){
        //Un centro de investigación de la flora urbana
        // necesita una aplicación que muestre cual es el
        // árbol más alto. Para ello se introducirán por
        // teclado las alturas en cms de cada árbol, terminando
        // cuando se introduzca -1. Los árboles se
        // identifican mediante etiquetas con números
        // correlativos, comenzando en 0.

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una medida de tu arbol: ");
        int a = 0;
        int altura = teclado.nextInt();
        int alturaArbol = altura;

        int arbolMayor;
        for(arbolMayor = 0; altura != 1; altura = teclado.nextInt()) {
            if (altura != alturaArbol) {
                arbolMayor = a;
            }

            ++a;
            System.out.println("Altura del arbol  (" + a + "): ");
        }

        if (alturaArbol == -1) {
            System.out.println("No hay un arbol");
        } else {
            System.out.println("El arbol mas alto mide" + alturaArbol);
            System.out.println("Corresponde al arbol como etiqueta" + arbolMayor);
        }
    }
}

