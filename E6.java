import java.util.Scanner;

/*
 * E6.java
 * 
 * Daniel García Mesa 20/12/2022
 * 
 * Escribe un programa que piense un número al azar entre 0 y 100. El usuario debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento fallido,
 * el programa dirá cuántas oportunidades quedan y si el número introducido es
 * menor o mayor que el número secreto.
 * 
 * 
 */


public class E6 {
	
	public static void main (String[] args) {
		int n=(int)(Math.random()*100+1);
		int n1=0;
		Scanner s=new Scanner(System.in);
		
		for(int i=5;i>0;i--){
			System.out.print("Intenta adiviniar un numero del 1 al 100(quedan "+i+" intentos): ");
			n1=s.nextInt();
			if(n1==n){
				System.out.print("Felicidades has acertado.");
				i=0;
			}	else if(n1<n){
				System.out.println(n1+" es menor que el número");
			}	else if(n1>n){
				System.out.println(n1+" es mayor que el número");
			}
		}
	}
}

