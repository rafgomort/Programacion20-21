Proceso sin_titulo
	//Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.
//Ejemplo:
//Por favor, introduzca la altura del reloj de arena: 7 
//	*******
//	*****
//	***
//	*
//	***
//	*****
	//	*******
	Definir fila, espacio, asterisco, num, fila1, m , l Como Entero
	Escribir "Introduce un numero"
	leer num
		
	Mientras num>3 y num mod 2=0 Hacer
		leer num
	Fin Mientras
		
	Para fila1<-num-1 Hasta 0 Con paso -2 Hacer
		Para m<-(num-1)-fila1 hasta 0 con paso -1 Hacer
			Escribir sin saltar " "
		FinPara
		Para l<-fila1 hasta 0 con paso -1 hacer 
			Escribir sin saltar "* "
		FinPara
		Escribir " "
	FinPara
		
	Para fila<-3 Hasta num Con Paso 2 Hacer
		Para espacio<-1 Hasta num-fila Con Paso 1 Hacer
			Escribir sin saltar " "
		Fin Para
		Para asterisco<-1 hasta fila Con Paso 1 Hacer 
			Escribir sin saltar " *"
		FinPara
		Escribir " "
	Fin Para

FinProceso
