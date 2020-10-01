Proceso sin_titulo
	//A partir del ejemplo que dibuja un rectángulo de asteriscos, 
	//crea un que dibuje un cuadrado (deberá pedir sólo un dato, 
	//el lado, y ambas órdenes "para" deberán tener ese valor como límite).
	
	Definir fila, columna, num Como Entero
	leer num
	
	Para fila=1 hasta num con paso 1 Hacer
		Para columna=1 hasta num con paso 1 Hacer
			Escribir Sin Saltar "* "
		FinPara
		Escribir " "
	FinPara
FinProceso
