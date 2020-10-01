SubProceso esMultiplo (num1, num2)
	
    Si num1>num2 Entonces
        Si num1 % num2==0 Entonces
            Escribir 'El numero ',num1,' es multiplo de ',num2;
        Sino
            Escribir 'El numero ',num1,' No es multiplo de ',num2;
        FinSi
    Sino
        Si num2 % num1==0 Entonces
            Escribir 'El numero ',num2,' es multiplo de ',num1;
        Sino
            Escribir 'El numero ',num2,' No es multiplo de ',num1;
        FinSi
    FinSi
Fin SubProceso


Proceso sin_titulo
	//Crea un programa que pida dos números enteros al 
	//usuario y diga si alguno de ellos es múltiplo del otro. 
	//Crea una función EsMultiplo que te ayude a que el proceso principal sea legible.
	Definir n1, n2 como entero
	leer n1, n2
	esMultiplo(n1,n2)
	
FinProceso
