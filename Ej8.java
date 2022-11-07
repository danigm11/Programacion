/*
 * Ej8.java
 * 
 * Daniel García Mesa 7/11/2022
 * 
 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
 * otra variable como cadena de caracteres y asígnale como valor la concatenación de las anteriores 5 variables. Por último, muestra la cadena de caracteres
 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
 * 
 * 
 * Este programa escribe la palabra "Manos" concatenando los caracteres dentro de un string.
 * 
 */


public class Ej8 {
	
	public static void main (String[] args) {
		
		char c1='M';
		char c2='a';
		char c3='n';
		char c4='o';
		char c5='s';
		String s=(c1+""+c2+""+c3+""+c4+""+c5);
		
		System.out.println(s);
	}
}

