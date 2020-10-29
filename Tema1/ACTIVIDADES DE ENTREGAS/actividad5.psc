SubProceso res <- Array ( num1, num2 )
	
	si num1[1]=num2
		res=verdadero
	FinSi
	
Fin SubProceso

Proceso sin_titulo
	//Realizar un algoritmo que contenga dos funciones para trabajar con vectores (arrays).
	//- contiene. Recibirá dos parámetros, un array de enteros y un entero a buscar. 
	//Devolverá verdadero si el entero está en el vector y falso en caso contrario.
	//- ocurrencias. Recibirá dos parámetros, un array de enteros y un entero a buscar. 
	//Devolverá el número de ocurrencias de ese entero en el vector.
	//El cuerpo del algoritmo llamará al menos dos veces a cada una de las funciones.
	Definir n1, n2 Como Entero
	Dimension n1[2]
	n1[1]=25
	n1[2]=10
	Escribir res<-Array(n1, n2)
	
FinProceso
