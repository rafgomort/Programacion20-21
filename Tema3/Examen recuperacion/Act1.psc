Algoritmo sin_titulo
	
	Definir num, cont, contImpar,sumarImpar, mediaImpar, mayorPar Como Entero
	cont=0
	contImpar=0
	sumarImpar=0
	
	Repetir
		leer num
		cont=cont+1;
		
		si  num%2==1
			sumarImpar=sumarImpar+num
			contImpar=contImpar+1
			mediaImpar=sumarImpar/contImpar
		FinSi
		
		si num%2==0
			Para i<-0 Hasta num Con Paso 1 Hacer
				si num>mayorPar	
					mayorPar=num
				FinSi
			Fin Para
		FinSi
	Hasta Que num<0
	
	escribir "Has introducido "  cont  " numeros"
	escribir "Has introducido " contImpar " numeros impares"
	escribir "El resultado de la media es: " mediaImpar 
	escribir "El numero mayor es: " mayorPar
	
	
FinAlgoritmo
