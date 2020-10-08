Proceso sin_titulo
	//Escribe un programa que si le pasamos un entero nos devuelva ese entero al revés
	//Ejemplo:	
	//Por favor, introduzca un número entero positivo: 123456
	//El número resultante es 654321	
	//NOTA: No se pueden utilizar funciones de texto de PseInt.
	
	Definir num,inverso, residuo Como Entero
	Escribir "Por favor, introduzca un número entero positivo: 123456"
	leer num
	inverso<-0
	residuo<-num
	Mientras residuo>0 Hacer
		inverso<-inverso*10+residuo mod 10
		residuo <- (residuo-residuo mod 10)/10
	FinMientras
	Escribir ""
	Escribir "Valoe del numero inverso: " inverso
	
FinProceso

