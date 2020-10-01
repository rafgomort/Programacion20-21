Proceso sin_titulo
	//Dibuja un triángulo creciente de asteriscos, del tamaño que indique el usuario. 
	//Por ejemplo, si escoge 4, el resultado debería ser:
	
	Definir fila, altura, columna, contador  Como Entero
	leer altura
	contador=0
	
	Para fila=1 hasta altura con paso 1 Hacer
		Para columna=1 hasta fila con paso 1 Hacer
			Escribir sin saltar "*"
		FinPara
		Escribir " "
	FinPara
	
FinProceso
