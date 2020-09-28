Proceso sin_titulo
	//Crea un programa que genere dos números al azar entre el 0 y el 100,
	//y pida al usuario que calcule e introduzca su suma. Si la respuesta
	//no es correcta, deberá volver a pedirla tantas veces como sea necesario 
	//hasta que el usuario acierte.
	//Pista: como verás en el apartado 10, para generar un número al 
	//azar del 0 al 100 puedes hacer numero <- AZAR(101)
	
	Definir a, num1, num2, num3 como entero
	Escribir "Generamos dos números al azar"
	num3=0
	num1 = AZAR(101)
	num2 = AZAR(101)
	a=num1+num2
	
	Escribir "El primer numero es " num1
	Escribir "El segundo numero es " num2
	
	
	Mientras num3<>a
		Escribir "calcula la suma"
		leer num3
		
		Si a== num3 Entonces
			Escribir "Correcto"
		FinSi
	FinMientras
	
FinProceso