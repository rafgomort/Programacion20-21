package Examen_Arrays;

import java.util.Scanner;

public class Act2 {
  public static void main(String[] args) {
    //Escribe un programa que pida 20 números enteros.
      // Estos números se deben introducir en un array
      // de 4 filas por 5 columnas. El programa mostrará
      // las sumas parciales de filas y columnas igual que
      // si de una hoja de cálculo se tratara. La suma total
      // debe aparecer en la esquina inferior derecha.

      Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce 20 numeros");
    int NUMFILAS=5;
    int NUMCOLUMNAS=4;

    int[][] num = new int[NUMFILAS][NUMCOLUMNAS];


    for (int i = 0; i <num.length; i++) {
      for (int j = 0; j < num.length; j++) {
        num [i][j]= teclado.nextInt();
        System.out.println(num[i][j]);

        //Esto es para averiguar la suma total de filas
        if (i == 0 && j==0 && j==1 && j==2 && j==3 && j==4) {
          int sumaFila1 = num[0][0] + num[0][1] + num[0][2] + num[0][3] + num[0][4];
        }
        if(i == 1 && j==0 && j==1 && j==2 && j==3 && j==4){
          int sumaFila2= num[1][0] + num[1][1] + num[1][2] +num[1][3] + num[1][4];
        }
        if(i == 2 && j==0 && j==1 && j==2 && j==3 && j==4){
          int sumaFila3= num[2][0] + num[2][1] + num[2][2] +num[2][3] + num[2][4];
        }
        if(i == 3 && j==0 && j==1 && j==2 && j==3 && j==4){
          int sumaFila4= num[3][0] + num[3][1] + num[3][2] +num[3][3] + num[4][4];
        }

        //Calcular las columnas
        if ( i==0 && i==1 && i==2 && i==3 && j == 0) {
          int sumaCol1 = num[0][0] + num[1][0] + num[2][0] + num[3][0];
        }
        if ( i==0 && i==1 && i==2 && i==3 && j == 1) {
          int sumaCol2 = num[0][1] + num[1][1] + num[2][1] + num[3][1];
        }
        if ( i==0 && i==1 && i==2 && i==3 && j == 2) {
          int sumaCol3 = num[0][2] + num[1][2] + num[2][2] + num[3][2];
        }
        if ( i==0 && i==1 && i==2 && i==3 && j == 3) {
          int sumaCol4 = num[0][3] + num[1][3] + num[2][3] + num[3][3] + num[4][3];
        }
        if ( i==0 && i==1 && i==2 && i==3 && j == 4) {
          int sumaCol5 = num[0][4] + num[1][4] + num[2][4] + num[3][4] + num[4][4];
        }


        System.out.println();
      }
    }

//    int n[][]= new int[NUMFILAS][NUMCOLUMNAS];
//    for (int i = 0; i < n.length; i++) {
//      for (int j = 0; j < n.length; j++) {
//        n[i][j] = (int) Math.floor(Math.random()*(100-200+1)+200);
//        System.out.println(n[i][j]);
//
//      }
//    }
  }
}
