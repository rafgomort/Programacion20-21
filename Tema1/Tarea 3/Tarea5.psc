Proceso sin_titulo
	//Crea un programa que pida al usuario dos n�meros 
	//y muestre su divisi�n si el segundo no es cero, 
	//o un mensaje de aviso en caso contrario.
	
	Definir a, b, c Como Entero
	Escribir "Dame dos numeros"
	leer a, b
	si b!=0
		c=a/b
	SiNo
		si b=0
			Escribir "No hay divisi�n"
			c=b
		FinSi
	FinSi
	
	Escribir c
FinProceso
