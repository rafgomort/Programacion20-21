//Crea un procedimiento EscribirCentrado, que reciba como par�metro un texto y lo 
//escriba centrado en pantalla (suponiendo una anchura de 80 columnas; pista: 
//deber�s escribir 40 - longitud/2 espacios antes del texto).

Funcion centrar(cad)	
	Definir i como Entero;
	Para i<-0 hasta (40 - (Longitud(cad)/2)) Hacer
		Escribir sin saltar " ";
	FinPara
	Escribir cad;
	
FinFuncion

Proceso EscribirCentrado
	Definir mensaje1,mensaje2 Como Caracter;
	mensaje1 <- "Un mensaje centrado";
	centrar(mensaje1);
	mensaje2<-"Otro mensaje";
	centrar(mensaje2);
FinProceso
