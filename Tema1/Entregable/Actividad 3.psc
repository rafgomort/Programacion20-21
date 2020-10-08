Proceso sin_titulo
	//Nos han encargado realizar un programa que pinte un 8 por pantalla 
	//usando la letra M. Se pide al usuario la altura, que debe ser un número 
	//entero impar mayor o igual que 5. Si el número introducido no es correcto, 
	//el programa deberá mostrar un mensaje de error y volver a solicitarlo. 
	//A continuación se muestran algunos ejemplos.
	//La anchura de la figura siempre será de 6 caracteres.
	//Ejemplo 1:
	
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 8
	//	La altura introducida no es correcta
	//Ejemplo 2:
	
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 3
	//	La altura introducida no es correcta
	
	//Ejemplo 3:
	//Por favor, introduzca la altura (número impar mayor o igual a 5): 7
	//	MMMMMM
	//	M    M
	//	M    M
	//	MMMMMM
	//	M    M
	//	M   M
	//  MMMMMM
	
	Definir altura, fila, columna, espacio Como entero
	Escribir "Introduce un numero para la altura"
	leer altura
	
	Mientras altura<>5 y altura mod 2=0 Hacer
		leer altura
	FinMientras
	
	Para fila=0 hasta altura-1 con paso 1 Hacer
		Para columna=0 hasta altura-2 con paso 1 Hacer
			si fila=0 | fila=6 | columna=1 | fila= 3
				Escribir sin saltar "M"
			FinSi
		FinPara
		Escribir " "
	FinPara
FinProceso
