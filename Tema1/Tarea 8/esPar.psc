//Crea una función EsPar que devuelva el valor lógico "verdadero" o "falso" 
//según si el número que se indique como parámetro es par o no lo es.
Funcion res <- EsPar (num1)
	Definir res Como Logico
	Si num1%2=0
		res <- Verdadero
	Sino 
		res <- Falso
	FinSi
FinFuncion

Algoritmo Funcion1
	Definir num como entero
	leer num
	Escribir Espar(num)
FinAlgoritmo


	