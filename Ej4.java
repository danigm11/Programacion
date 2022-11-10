/*
 * Ej4.java
 * Daniel García Mesa 10/11/2022
 * 
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 */


public class Ej4 {
	
	public static void main (String[] args) {
		
		//declaración de variables
		
		double n1=0;
		double n2=0;
		String linea;
		
		//lee primer número
		
		System.out.print("Escriba un numero: ");
		
		linea=System.console().readLine();
		
		n1=Double.parseDouble(linea);
		
		//lee segundo número
		
		System.out.print("Escriba otro numero: ");
		
		linea=System.console().readLine();
		
		n2=Double.parseDouble(linea);
		
		//Calcula y muestra por pantalla el resultado de las operaciones
		
		System.out.println(n1+" + "+n2+" = "+(n1+n2));
		System.out.println(n1+" - "+n2+" = "+(n1-n2));
		System.out.println(n1+" * "+n2+" = "+(n1*n2));
		System.out.println(n1+" / "+n2+" = "+(n1/n2));
	}
}

