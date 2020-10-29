package Varios;

public class Act2 {
    public static void main (String[]args){
        //Tenemos las variables enteras "edad", "nivel_de_estudios", e
        // ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:
        //
        //verdadero. Si la edad es menor o igual a 28, el nivel
        // de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
        //falso. En caso contrario.

        //escribe el código necesario para inicializar "jasp" en una línea.

        int edad=27;
        int nivel_estudios = 3;
        int ingresos=27000;
        boolean jasp;

        jasp= (edad>=28 || nivel_estudios>3 || ingresos>28000) ? true : false;
        System.out.println(jasp);

    }
}

