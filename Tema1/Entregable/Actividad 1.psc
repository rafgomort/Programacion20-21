Proceso sin_titulo
	
	Definir num1, num2, num3  Como real
	Escribir "Introduzca la cantidad de unidades: "
	leer num1
	
	si num1<=100
		num1=num1*5.23
		Escribir "El precio del pedido es : " num1
	sino 
		si num1>101 y num1<1000
			num2=num1-101
			Escribir "El precio del pedido es : " (num2*4.16) + (100*5.23)
			
		FinSi
	FinSi
	
FinProceso
