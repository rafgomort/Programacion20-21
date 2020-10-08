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
	//Realiza un programa que calcule el máximo, 
	//el mínimo y la media de una serie de números 
	//enteros positivos introducidos por teclado. El programa 
	//terminará cuando el usuario introduzca un número primo. 
	//Este último número no se tendrá en cuenta en los cálculos. 
	//El programa debe indicar también cuántos números ha introducido 
	//el usuario (sin contar el primo que sirve para salir).
	
	//Ejemplo:
	//Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo:
	//	6
	//	8
	//	15
	//	12
	//	23
	//	Ha introducido 4 números no primos.
	//Máximo: 15
	//Mínimo: 6
	//Media: 10.25
	
	Definir num  Como Entero
	Escribir "Introduce varios numeros"
	leer num
	
	Escribir resultado <-esPrimo (num)

	
FinProceso
