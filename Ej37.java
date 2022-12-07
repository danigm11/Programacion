import java.util.Scanner;

/*
 * Ej37.java
 * 
 * Daniel García Mesa 6/12/2022 
 *  
 * Realiza un conversor del sistema decimal al sistema de “palotes”.
 * 
 */


public class Ej37 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int n2=0;
		int aux=0;
		int aux2=0;
		do{
			System.out.print("Introduzca un número positivo: ");
			n=s.nextInt();
		}while(n<=0);
		
		while(n>0){
			aux2+=(n%10);
			n/=10;
			aux2*=10;
		}
		
		System.out.print(n+" en decimal es: ");
		while(aux2>0){
			aux=aux2%10;
			System.out.print("-");
			for(int i=0;i<aux;i++){
				System.out.print("| ");
			}
			aux2=aux2/10;
		}
		System.out.print(" en el sistema de palotes");
		
	}
}
