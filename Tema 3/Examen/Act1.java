package Examen_Arrays;


import java.util.Scanner;

public class Act1 {
  public static void main(String[] args) {
    // Define la función mezcla con la siguiente cabecera:
    // public static int[] mezcla(int[] a, int[] b)
    //
    // Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de
    // mezclar los números de ambos de forma alterna, se coge unnúmero de a, luego de b, luego de a,
    // etc. Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan los
    // números de un array se terminan de coger todos los que quedan del otro.
    //
    // Ejemplos:
    //
    // Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
    //
    // Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
    //
    // Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
    //
    // Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}

      Scanner teclado = new Scanner(System.in);
      System.out.println("Introduce un numero para el apartado A");
      int NUMA = teclado.nextInt();
      System.out.println("Introduce un numero para el apartado B");
      int NUMB = teclado.nextInt();

      int [] n1 = new int[NUMA];
      int [] n2 = new int[NUMB];

      System.out.println(mezcla(n1, n2));
  }

  public static int mezcla (int[] a, int[] b){
        int resul=0;
        a = new int[]{8, 9, 0};
        b = new int[]{1, 2, 3};

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        String hacerMezcla = String.valueOf(a[i]) + String.valueOf(b[j]);
        int numeroFinal = Integer.parseInt(hacerMezcla);
        resul = numeroFinal;
      }
   }
      return resul;
  }
}
