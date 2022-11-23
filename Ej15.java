import java.util.Scanner;

/*
 * Ej15.java
 * 
 * Daniel García Mesa 23/11/2022
 * 
 * Escribe un programa que pinte una pirámide rellena con un carácter introducido
 * por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
 * etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
 * de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
 * hacia la derecha.
 * 
 */


public class Ej15 {
	
	public static void main (String[] args) {
		
		String st;
		int n=0;
		Scanner s=new Scanner(System.in);
		
		
		System.out.print("Introducir un caracter: ");
		st=s.next();
		System.out.print("Introducir una dirección(1-4): ");
		n=s.nextInt();
		
		switch(n){
			
			case 1:{
				System.out.print("   "+st+"\n  "+st+st+st+"\n "+st+st+st+st+st+"\n"+st+st+st+st+st+st+st);
				
			}
			case 2:{
				System.out.print(st+"\n"+st+st+st+"\n"+st+st+st+st+st+"\n"+st+st+st+st+st+st+st+"\n"+st+st+st+st+st+"\n"+st+st+st+"\n"+st);
				
			}
			case 3:{
				System.out.print("      "+st+"\n    "+st+st+st+"\n  "+st+st+st+st+st+"\n"+st+st+st+st+st+st+st+"\n  "+st+st+st+st+st+"\n    "+st+st+st+"\n      "+st);
				
			}
			case 4:{
				System.out.print("\n"+st+st+st+st+st+st+st+"\n "+st+st+st+st+st+"\n  "+st+st+st+"\n   "+st);
				
			}
			
			
			
		}
		
	}
}

