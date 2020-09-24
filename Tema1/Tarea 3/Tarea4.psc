Proceso sin_titulo
	//Haz un programa que pida al usuario dos 
	//números y diga cuántos de ellos son positivos.
	Definir a, b Como Entero
	leer a, b
	
	Si a>0 y b>0
		Escribir "Los dos son números positivos"
	Sino 
		si a>0 y b<0
			Escribir "El primer número es positivo y el segundo no"
		SiNo
			si a<0 y b>0
				Escribir "El primero no es positivo y el segundo si"
			FinSi
		FinSi
	FinSi
FinProceso
