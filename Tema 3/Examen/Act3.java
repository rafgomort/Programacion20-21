package Examen_Arrays;

public class Act3 {
  public static void main(String[] args) {
    // Implementa una función con nombre corteza que sea capaz de extraer la capa exterior de un
    // array bidimensional. Esta capa se extrae en forma de array de una dimensión. La extracción de
    // números comienza en la esquina superior izquierda y continúa en el sentido de las agujas del
    // reloj. Se debe entregar tanto el código de la función como el código de prueba que la usa. La
    // cabecera de la función es la siguiente:
    //
    // public static int[] corteza(int[][] n)
    //
    // Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
    //
    // 45 92 14 20 25 78
    // 35 72 24 45 42 60
    // 32 42 64 23 41 39
    // 98 45 94 11 18 48
    //
    // El array unidimensional generado por corteza(a) sería el siguiente:
    //
    // 45 92 14 20 25 78 60 39
      // 48 18 11 94 45 98 32 35

     int  NUMFILAS=6;
     int NUMCOLUMNAS=4;

      int [][] num =  {{45, 92, 14, 20, 25, 78}, {35, 72, 24, 45, 42,
          60}, {32, 42, 64, 23, 41, 39}, {98, 45, 94, 11, 18, 48}};

    System.out.println(corteza(num));
  }

  public static int[] corteza (int [][] n){
      int [] resul;
        for(int i = 0; i < n.length; i++) {
      for (int j = 0; j < n.length; j+) {
        //
      }
        }

      return resul;
  }
}
