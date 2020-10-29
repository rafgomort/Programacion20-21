Proceso sin_titulo
	//Escribe un algoritmo que calcule el sueldo semanal de un trabajador teniendo en cuenta lo siguiente:
	//-> El sueldo para las primeras 40 horas es 10€
	//	-> A partir de la hora 41 (incluida) el trabajado cobrará 15€ hora
	//Por ejemplo:
	//Introduzca el número de horas trabajadas durante la semana: 36
	//	El sueldo semanal que le corresponde es de 360
	//Introduzca el número de horas trabajadas durante la semana: 50
	//	El sueldo semanal que le corresponde es de 550
	
	Definir num, num2 Como Entero
	leer num
	

	si num<40
		Escribir "El sueldo semanal que le corresponde es de " 10*num
	sino 
		si num>40 
			num2=num-40
			Escribir "El sueldo semanal que le corresponde es de " (num2*15)+40*10
		FinSi
	FinSi
FinProceso
