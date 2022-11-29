/*
 * Ej2.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.
 * 
 */


public class Ej2{
	
	public static void main (String[] args) {
		
		int i=0;
		
		System.out.print("Los números múltiplos de 5 de 0 a 100 son: ");

		
		while(i<101){
			if(i%5==0){
				System.out.print(i+" ");
			}
			i++;
		}
	}
}

