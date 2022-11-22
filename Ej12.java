import java.util.Scanner;

/*
 * Ej12.java
 * 
 * Daniel García Mesa 21/11/2022
 * 
 * Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El
 * programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
 * tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
 * en las diferentes asignaturas del curso.
 *
 *
 */


public class Ej12 {
	
	public static void main (String[] args) {
		
		Scanner s;
		s=new Scanner(System.in);
		int n=0;
		int res=0;
		
		System.out.println("1ºPregunta: Como declaras una variable entera? \n1-Con double \n2-Con float \n3-Con int");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 3:{
				res+=1;
			}	
		}
		System.out.println("2ºPregunta: Que tipo de memorias hay? \n1-ROM y RAM \n2-Volatiles y no volatiles \n3-Dimm y Simm");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 2:{
				res+=1;
			}	
		}
		System.out.println("3ºPregunta: Qué direcciones maneja un procesador? \n1-Logicas \n2-Logicas y fisicas \n3-Fisicas");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 1:{
				res+=1;
			}	
		}
		System.out.println("4ºPregunta: Qué marca se usa para declarar un párrafo? \n1-<p> \n2-<pa> \n3-<pr>");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 1:{
				res+=1;
			}	
		}
		System.out.println("5ºPregunta: Qué marca se usa para declarar una tabla? \n1-<tab> \n2-<tb> \n3-<table>");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 3:{
				res+=1;
			}	
		}
		System.out.println("6ºPregunta: Qué marca se usa para declarar un formulario? \n1-<form> \n2-<f> \n3-<fm>");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 1:{
				res+=1;
			}	
		}
		System.out.println("7ºPregunta: Qué marca se usa para declarar un salto de linea? \n1-<s> \n2-<br> \n3-<jump>");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 2:{
				res+=1;
			}	
		}
		System.out.println("8ºPregunta: Que es un IDE? \n1-Entorno de desarrollo \n2-Procesador de texto \n3-Cable de red");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 1:{
				res+=1;
			}	
		}
		System.out.println("9ºPregunta: Cómo se escribe la salida formateada? \n1-print \n2-prinln \n3-printf");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 3:{
				res+=1;
			}	
		}
		System.out.println("10ºPregunta: Para qué se usa el Scanner en java? \n1-Copiar texto \n2-Introducir datos por teclado \n3-Introducir datos con el raton");
		System.out.print("Introduzca la respuesta(1-3): ");
		n=s.nextInt();
		switch(n){
			case 2:{
				res+=1;
			}	
		}
		
		System.out.print("\nEl resultado es: "+res+"/10");
	}
}

