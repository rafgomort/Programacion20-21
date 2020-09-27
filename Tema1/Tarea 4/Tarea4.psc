Proceso sin_titulo
	//Crea una variante del ejercicio 5.3, 
	//en la que emplees varios SI-ENTONCES en vez de SEGUN.
	
	Definir a Como Entero
	Escribir "Dame un número del 1 al 12 y te diré el mes del año"
	leer a
	
	Si a=1
		Escribir "Es Enero"
	sino
		si a=2
			Escribir "Es Febrero"
		sino
			si a=3
				Escribir "Es Marzo"
			SiNo
				si a=4 
					Escribir "Es Abril"
				SiNo
					si a=5
						Escribir "Es Mayo"
					SiNo
						si a=6
							Escribir "Es Junio"
						SiNo
							si a=7
								Escribir "Es Julio"
							sino 
								Si a=8
									Escribir "Es Agosto"
								sino 
									si a=9
										Escribir "Es Septiembre"
									sino 
										si a=10
											Escribir "Es Octubre"
										SiNo
											si a=11 
												Escribir "Es Noviembre"
											SiNo
												si a=12
													Escribir "Es diciembre" 
												SiNo
													Escribir "Error, no existen más meses" 
												FinSi
											FinSi
										FinSi
									FinSi
								FinSi
							FinSi
						FinSi
					Finsi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso
