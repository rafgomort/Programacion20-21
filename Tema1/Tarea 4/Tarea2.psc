Proceso sin_titulo
	//Crea una variante del ejercicio 5.1, 
	//en la que emplees varios SI-ENTONCES en vez de SEGUN.
	Definir a Como Entero
	Escribir "Dame un n�mero del 1 al 7 y te dir� el d�a de la semana"
	leer a
	
	Si a=1
		Escribir "Es lunes"
	sino
		si a=2
			Escribir "Es Martes"
		sino
			si a=3
				Escribir "Es Mi�rcoles"
			SiNo
				si a=4 
					Escribir "Es Jueves"
				SiNo
					si a=5
					Escribir "Es Viernes"
				SiNo
					si a=6
						Escribir "Es S�bado"
					SiNo
						si a=7
							Escribir "Es Domingo"
						sino 
							Si a>7
								Escribir "Error"
							FinSi
						FinSi
					FinSi
					Finsi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
