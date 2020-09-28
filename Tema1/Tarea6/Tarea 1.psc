Proceso sin_titulo
	//Crea un programa que pida al usuario un código de usuario y una contraseña. 
	//Deberá repetirse hasta que el código sea "1" y la contraseña sea "1234".
	
	Definir a, b Como Entero

	
	Repetir
		Escribir "dame tu usuario"
		leer a
		si a<>1
			Escribir "Usuario incorrecto"
		SiNo
			Escribir "Usuario correcto" 
		FinSi
		
		Escribir "Dame tu clave"
		leer b
		si b<>1234
			Escribir "Clave incorrecta"
		sino 
			Escribir "Clave correcta"
		FinSi
	Hasta Que a=1 y b=1234
	
	
	
FinProceso
