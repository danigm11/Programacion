import java.util.Scanner;

/*
 * Ej13.java
 * 
 * Daniel García Mesa 21/11/2022
 * 
 * Escribe un programa que ordene tres números enteros introducidos por teclado.
 * 
 * 
 */


public class Ej13 {
	
	public static void main (String[] args) {
		int n1=0;
		int n2=0;
		int n3=0;
		int aux=0;
		Scanner s;
		s=new Scanner(System.in);
		
		System.out.println("Este programa ordena 3 numeros enteros");
		System.out.print("Introduce un numero: ");
		n1=s.nextInt();
		System.out.print("Introduce otro numero: ");
		n2=s.nextInt();
		System.out.print("Introduce otro numero: ");
		n3=s.nextInt();
		
		if((n1>n2)&&(n1>n3)){
			System.out.print(n1+" > ");
			if(n2>n3){
				System.out.print(n2+" > "+n3);
			}	else{
					System.out.print(n3+" > "+n2);
				}
		}	else if((n2>n1)&&(n2>n3)){
				System.out.print(n2+" > ");
				if(n1>n3){
					System.out.print(n1+" > "+n3);
				}	else{
					System.out.print(n3+" > "+n2);
					}
			}	else if((n3>n1)&&(n3>n1)){
					System.out.print(n3+" > ");
					if(n1>n2){
						System.out.print(n1+" > "+n2);
					}	else{
							System.out.print(n2+" > "+n1);		
					}
		
				}	
	}
}

