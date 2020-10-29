Proceso sin_titulo
	//Actividad 4
	
	Definir num, n, i, a, j, k, p como entero
	num=20
	
	dimension n[num]
	
	
	Para i<-0 hasta num-1 con paso 1 Hacer
		//Genera entre 0 y 400
		n[i] = 0+ Azar (400)	+1
		Escribir sin saltar n[i] ", "
		
		leer p
		Segun p Hacer
			Caso 1:
				Si (n[i] MOD 5) = 0 Entonces
					Escribir "es multiplo de 5";
				FinSi
			Caso 2:
				Si (n[i] MOD 7) = 0 Entonces
					Escribir "es multiplo de 7";
				FinSi
		FinSegun
		
		
	FinPara
	
	
	
FinProceso

