import java.util.Scanner;

/*
 * Ej19.java
 * 
 * Daniel García Mesa 4/12/2022
 * 
 * Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 * pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 * pedir por teclado.
 * 
 */


public class Ej19 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		int cont=1;
		String c="";
		
		System.out.print("Introduce la altura de la pirámide: ");
		n=s.nextInt();
		System.out.print("Introduce el carácter para la pirámide: ");
		c=s.next();
		
		for(int i=1;i<=n;i++){
			
			for(int b=n;b>i;b--){
				System.out.print(" ");
			}
			for(int j=0;j<cont;j++){
				System.out.print(c);
			}
			System.out.println("");
			cont+=2;
			
		}
		
	}
}

