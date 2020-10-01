Proceso sin_titulo
	// Tambien se puede contar usando una orden "mientras" o una orden "
	//repetir", si usas una variable como contador e incrementas 
	//(o disminuyes) su valor en cada pasada de forma manual. 
	//Compruébalo creando un programa que escriba los números 
	//del 1 al 15 usando "mientras" en vez de "para".
	
	Definir num1 , contador Como Entero
	num1=0
	contador=0
	
	Mientras num1<>15 Hacer
		contador=contador+1
		num1=num1+contador
		Escribir num1
	FinMientras

FinProceso
