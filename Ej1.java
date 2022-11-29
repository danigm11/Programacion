/*
 * Ej1.java
 * 
 * Daniel García Mesa 29/11/2022
 * 
 * Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
 * 
 */


public class Ej1 {
	
	public static void main (String[] args) {
		
		 System.out.print("Los números múltiplos de 5 de 0 a 100 son: ");
		
		for(int i=0;i<101;i++){
			
			if(i%5==0){
				System.out.print(i+" ");
			}
		}
		
	}
}

