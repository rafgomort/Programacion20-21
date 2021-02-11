package ExamenRecu1;

import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        //Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
        //
        //Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo serán de 4
        // unidades. No hay que comprobar que los datos se introducen correctamente;
        // podemos suponer que el usuario los introduce bien. Dentro de la pecera hay que
        // colocar de forma aleatoria un pececito, que puede estar situado en cualquiera de
        // las posiciones que quedan en el hueco que forma el rectángulo.
        //
        //Ejemplo: Por favor, introduzca la altura de la pecera (como mínimo 4): 4
        //
        //Ahora introduzca la anchura (como mínimo 4): 7
        //
        //* * * * * * *
        //*           *
        //*       &   *
        //* * * * * * *


        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4)");
        int altura = teclado.nextInt();
        System.out.println("Ahora introduzca la anchura (como mínimo 4):");
        int anchura = teclado.nextInt();

        while (altura<4 && anchura<4){
            System.out.println("Por favor, introduzca la altura de la pecera (como mínimo 4)");
            altura = teclado.nextInt();
            System.out.println("Ahora introduzca la anchura (como mínimo 4):");
            anchura = teclado.nextInt();
        }

        //Para realizar la pecera hago un bucle for para dibujar la altura y la anchura
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {

                if (    i==0 && j==0 || i==1 && j==0 || i==2 && j==0 || i==3 && j==0 //lado izquierdo
                        || i==0 && j==1 ||i==0 && j==2 || i==0 && j==3 ||i==0 && j==4 || i==0 && j==5 || i==0 && j==6 //lado superior
                        || i==3 && j==1 || i==3 && j==2 || i==3 && j==3|| i==3 && j==4 || i==3 && j==5 || i==3 && j==6 //lado inferior
                        || i==1 && j==6 || i==2 && j==6 ){ //lado derecho

                    System.out.print("* ");
                }

                if(i==2 && j==4){
                    System.out.print("      &   ");
                }


                //* * * * * * *
                //*           *
                //*       &   *
                //* * * * * * *
            }
            System.out.println(" ");
        }
    }
}
