/*
 * Ej9.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Realiza un programa que vaya generando números aleatorios pares entre 0
 * y 100 y que no termine de generar números hasta que no saque el 24. El
 * programa deberá decir al final cuántos números se han generado.
 * 
 * 
 */


public class Ej9 {
	
	public static void main (String[] args) {
		
		int n=0;
		int cont=0;
		while(n!=24){
			n=(int)(Math.random()*100+1);
			cont++;
		}
		System.out.print("Se han generado "+cont+" numeros.");
	}
}

