Funcion resultado <- esPrimo (n)
	Definir resultado Como Logico
	resultado<-verdadero
	Para i=0 hasta num-1 Hacer
		si num mod i = 0 Entonces
			resultado <-falso
		FinSi
	FinPara
FinFuncion

Proceso sin_titulo
	//Realiza un programa que calcule el m�ximo, 
	//el m�nimo y la media de una serie de n�meros 
	//enteros positivos introducidos por teclado. El programa 
	//terminar� cuando el usuario introduzca un n�mero primo. 
	//Este �ltimo n�mero no se tendr� en cuenta en los c�lculos. 
	//El programa debe indicar tambi�n cu�ntos n�meros ha introducido 
	//el usuario (sin contar el primo que sirve para salir).
	
	//Ejemplo:
	//Por favor, vaya introduciendo n�meros enteros positivos. Para terminar, introduzca un n�mero primo:
	//	6
	//	8
	//	15
	//	12
	//	23
	//	Ha introducido 4 n�meros no primos.
	//M�ximo: 15
	//M�nimo: 6
	//Media: 10.25
	
	Definir num  Como Entero
	Escribir "Introduce varios numeros"
	leer num
	
	Escribir resultado <-esPrimo (num)

	
FinProceso
