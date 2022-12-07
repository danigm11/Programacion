import java.util.Scanner;

/*
 * Ej31.java
 * 
 * Daniel García Mesa 6/12/2022 
 * 
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 * programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 * mitad (división entera entre 2) de la altura más uno. 
 * 
 */


public class Ej31 {
	
	public static void main (String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=0;
		do{
			System.out.print("Introduzca un número: ");
			n=s.nextInt();
		}while(n<=0);
		
		for(int i=1;i<n;i++){
			System.out.println("*");
			if(i==n-1){
				for(int j=0;j<((n/2)+1);j++){
					System.out.print("* ");
				}
			}
		}
	}
}

