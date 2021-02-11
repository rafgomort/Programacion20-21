package entregable;

public class Act1 {
    public static void main(String[] args) {
        //Crea la función filtraPrimos que:
        //
        //Recibe un array de enteros
        //Devuelve un array de enteros con todos los primos que se encuentran en el array origen
        //Obviamente el tamaño del array  que se devuelve será de una
        // longitud menor o igual al que se pasa como parámetro. Para facilitar
        // el ejercicio aunque un número primo se repita lo añadiremos al vector.
        // Si no existe ningún número primo en el vector original, se devuelve
        // un array con el número -1 como único elemento.

        int NUM=10;

        int[] num = new int[NUM];

    }

    public static boolean filtraPrimos (int[] primos){

        boolean resul=false;
        for (int i = 0; i <= primos.length; i++) {
            primos[i]=(int)(Math.random() * 101);

            int numero = 0;
            if(primos[i]!=esPrimo(numero)){
                resul=true;
            }else{
                resul=false;
            }
        }
        return resul;
    }

    public static boolean esPrimo(int numero){
        int contador = 2;
        boolean primo=true;
        while ((primo) && (contador!=numero)){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }
}
