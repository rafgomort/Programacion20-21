Proceso sin_titulo
	//Haz un programa que pida al usuario dos 
	//n�meros y diga cu�ntos de ellos son positivos.
	Definir a, b Como Entero
	leer a, b
	
	Si a>0 y b>0
		Escribir "Los dos son n�meros positivos"
	Sino 
		si a>0 y b<0
			Escribir "El primer n�mero es positivo y el segundo no"
		SiNo
			si a<0 y b>0
				Escribir "El primero no es positivo y el segundo si"
			FinSi
		FinSi
	FinSi
FinProceso
