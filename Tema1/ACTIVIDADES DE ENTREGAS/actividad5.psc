SubProceso res <- Array ( num1, num2 )
	
	si num1[1]=num2
		res=verdadero
	FinSi
	
Fin SubProceso

Proceso sin_titulo
	//Realizar un algoritmo que contenga dos funciones para trabajar con vectores (arrays).
	//- contiene. Recibir� dos par�metros, un array de enteros y un entero a buscar. 
	//Devolver� verdadero si el entero est� en el vector y falso en caso contrario.
	//- ocurrencias. Recibir� dos par�metros, un array de enteros y un entero a buscar. 
	//Devolver� el n�mero de ocurrencias de ese entero en el vector.
	//El cuerpo del algoritmo llamar� al menos dos veces a cada una de las funciones.
	Definir n1, n2 Como Entero
	Dimension n1[2]
	n1[1]=25
	n1[2]=10
	Escribir res<-Array(n1, n2)
	
FinProceso
