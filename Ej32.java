import java.util.Scanner;

/*
 * Ej32.java
 * 
 * Daniel García Mesa 6/12/2022 
 *  
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
 * cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 * izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 * números largos.
 * 
 */


public class Ej32 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int suma=0;
		long par=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
		}while((n<=0));
		
		while((n>0)){
		
			if((n>0)&&(n%2==0)){
	
				par+=(n%10);
				par*=10;
				suma+=(n%10);
			}	
			n=n/10;	
		}
		par/=10;
		System.out.print("El número formado por los dígitos pares es: ");
		while(par>0){
			System.out.print(par%10);
			par/=10;
		}
		System.out.print("\nSu suma es "+suma);
		
	}
}

